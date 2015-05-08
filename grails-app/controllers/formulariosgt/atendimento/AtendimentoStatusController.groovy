package formulariosgt.atendimento



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AtendimentoStatusController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AtendimentoStatus.list(params), model:[atendimentoStatusInstanceCount: AtendimentoStatus.count()]
    }

    def show(AtendimentoStatus atendimentoStatusInstance) {
        respond atendimentoStatusInstance
    }

    def create() {
        respond new AtendimentoStatus(params)
    }

    @Transactional
    def save(AtendimentoStatus atendimentoStatusInstance) {
        if (atendimentoStatusInstance == null) {
            notFound()
            return
        }

        if (atendimentoStatusInstance.hasErrors()) {
            respond atendimentoStatusInstance.errors, view:'create'
            return
        }

        atendimentoStatusInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'atendimentoStatus.label', default: 'AtendimentoStatus'), atendimentoStatusInstance.id])
                redirect atendimentoStatusInstance
            }
            '*' { respond atendimentoStatusInstance, [status: CREATED] }
        }
    }

    def edit(AtendimentoStatus atendimentoStatusInstance) {
        respond atendimentoStatusInstance
    }

    @Transactional
    def update(AtendimentoStatus atendimentoStatusInstance) {
        if (atendimentoStatusInstance == null) {
            notFound()
            return
        }

        if (atendimentoStatusInstance.hasErrors()) {
            respond atendimentoStatusInstance.errors, view:'edit'
            return
        }

        atendimentoStatusInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'AtendimentoStatus.label', default: 'AtendimentoStatus'), atendimentoStatusInstance.id])
                redirect atendimentoStatusInstance
            }
            '*'{ respond atendimentoStatusInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(AtendimentoStatus atendimentoStatusInstance) {

        if (atendimentoStatusInstance == null) {
            notFound()
            return
        }

        atendimentoStatusInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'AtendimentoStatus.label', default: 'AtendimentoStatus'), atendimentoStatusInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'atendimentoStatus.label', default: 'AtendimentoStatus'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
