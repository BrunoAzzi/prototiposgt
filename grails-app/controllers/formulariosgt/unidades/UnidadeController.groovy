package formulariosgt.unidades



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UnidadeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Unidade.list(params), model:[unidadeInstanceCount: Unidade.count()]
    }

    def show(Unidade unidadeInstance) {
        respond unidadeInstance
    }

    def create() {
        respond new Unidade(params)
    }

    @Transactional
    def save(Unidade unidadeInstance) {
        if (unidadeInstance == null) {
            notFound()
            return
        }

        if (unidadeInstance.hasErrors()) {
            respond unidadeInstance.errors, view:'create'
            return
        }

        unidadeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'unidade.label', default: 'Unidade'), unidadeInstance.id])
                redirect unidadeInstance
            }
            '*' { respond unidadeInstance, [status: CREATED] }
        }
    }

    def edit(Unidade unidadeInstance) {
        respond unidadeInstance
    }

    @Transactional
    def update(Unidade unidadeInstance) {
        if (unidadeInstance == null) {
            notFound()
            return
        }

        if (unidadeInstance.hasErrors()) {
            respond unidadeInstance.errors, view:'edit'
            return
        }

        unidadeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Unidade.label', default: 'Unidade'), unidadeInstance.id])
                redirect unidadeInstance
            }
            '*'{ respond unidadeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Unidade unidadeInstance) {

        if (unidadeInstance == null) {
            notFound()
            return
        }

        unidadeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Unidade.label', default: 'Unidade'), unidadeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'unidade.label', default: 'Unidade'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
