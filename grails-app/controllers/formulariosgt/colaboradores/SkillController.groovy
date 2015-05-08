package formulariosgt.colaboradores



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SkillController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Skill.list(params), model:[skillInstanceCount: Skill.count()]
    }

    def show(Skill skillInstance) {
        respond skillInstance
    }

    def create() {
        respond new Skill(params)
    }

    @Transactional
    def save(Skill skillInstance) {
        if (skillInstance == null) {
            notFound()
            return
        }

        if (skillInstance.hasErrors()) {
            respond skillInstance.errors, view:'create'
            return
        }

        skillInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'skill.label', default: 'Skill'), skillInstance.id])
                redirect skillInstance
            }
            '*' { respond skillInstance, [status: CREATED] }
        }
    }

    def edit(Skill skillInstance) {
        respond skillInstance
    }

    @Transactional
    def update(Skill skillInstance) {
        if (skillInstance == null) {
            notFound()
            return
        }

        if (skillInstance.hasErrors()) {
            respond skillInstance.errors, view:'edit'
            return
        }

        skillInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Skill.label', default: 'Skill'), skillInstance.id])
                redirect skillInstance
            }
            '*'{ respond skillInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Skill skillInstance) {

        if (skillInstance == null) {
            notFound()
            return
        }

        skillInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Skill.label', default: 'Skill'), skillInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'skill.label', default: 'Skill'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
