package formulariosgt.colaboradores



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FormacaoColaboradorController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond FormacaoColaborador.list(params), model:[formacaoColaboradorInstanceCount: FormacaoColaborador.count()]
    }

    def show(FormacaoColaborador formacaoColaboradorInstance) {
        respond formacaoColaboradorInstance
    }

    def create() {
        respond new FormacaoColaborador(params)
    }

    @Transactional
    def save(FormacaoColaborador formacaoColaboradorInstance) {
        if (formacaoColaboradorInstance == null) {
            notFound()
            return
        }

        if (formacaoColaboradorInstance.hasErrors()) {
            respond formacaoColaboradorInstance.errors, view:'create'
            return
        }

        formacaoColaboradorInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'formacaoColaborador.label', default: 'FormacaoColaborador'), formacaoColaboradorInstance.id])
                redirect formacaoColaboradorInstance
            }
            '*' { respond formacaoColaboradorInstance, [status: CREATED] }
        }
    }

    def edit(FormacaoColaborador formacaoColaboradorInstance) {
        respond formacaoColaboradorInstance
    }

    @Transactional
    def update(FormacaoColaborador formacaoColaboradorInstance) {
        if (formacaoColaboradorInstance == null) {
            notFound()
            return
        }

        if (formacaoColaboradorInstance.hasErrors()) {
            respond formacaoColaboradorInstance.errors, view:'edit'
            return
        }

        formacaoColaboradorInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'FormacaoColaborador.label', default: 'FormacaoColaborador'), formacaoColaboradorInstance.id])
                redirect formacaoColaboradorInstance
            }
            '*'{ respond formacaoColaboradorInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(FormacaoColaborador formacaoColaboradorInstance) {

        if (formacaoColaboradorInstance == null) {
            notFound()
            return
        }

        formacaoColaboradorInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'FormacaoColaborador.label', default: 'FormacaoColaborador'), formacaoColaboradorInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'formacaoColaborador.label', default: 'FormacaoColaborador'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
