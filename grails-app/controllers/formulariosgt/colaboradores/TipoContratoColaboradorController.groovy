package formulariosgt.colaboradores



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class TipoContratoColaboradorController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond TipoContratoColaborador.list(params), model:[tipoContratoColaboradorInstanceCount: TipoContratoColaborador.count()]
    }

    def show(TipoContratoColaborador tipoContratoColaboradorInstance) {
        respond tipoContratoColaboradorInstance
    }

    def create() {
        respond new TipoContratoColaborador(params)
    }

    @Transactional
    def save(TipoContratoColaborador tipoContratoColaboradorInstance) {
        if (tipoContratoColaboradorInstance == null) {
            notFound()
            return
        }

        if (tipoContratoColaboradorInstance.hasErrors()) {
            respond tipoContratoColaboradorInstance.errors, view:'create'
            return
        }

        tipoContratoColaboradorInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'tipoContratoColaborador.label', default: 'TipoContratoColaborador'), tipoContratoColaboradorInstance.id])
                redirect tipoContratoColaboradorInstance
            }
            '*' { respond tipoContratoColaboradorInstance, [status: CREATED] }
        }
    }

    def edit(TipoContratoColaborador tipoContratoColaboradorInstance) {
        respond tipoContratoColaboradorInstance
    }

    @Transactional
    def update(TipoContratoColaborador tipoContratoColaboradorInstance) {
        if (tipoContratoColaboradorInstance == null) {
            notFound()
            return
        }

        if (tipoContratoColaboradorInstance.hasErrors()) {
            respond tipoContratoColaboradorInstance.errors, view:'edit'
            return
        }

        tipoContratoColaboradorInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'TipoContratoColaborador.label', default: 'TipoContratoColaborador'), tipoContratoColaboradorInstance.id])
                redirect tipoContratoColaboradorInstance
            }
            '*'{ respond tipoContratoColaboradorInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(TipoContratoColaborador tipoContratoColaboradorInstance) {

        if (tipoContratoColaboradorInstance == null) {
            notFound()
            return
        }

        tipoContratoColaboradorInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'TipoContratoColaborador.label', default: 'TipoContratoColaborador'), tipoContratoColaboradorInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'tipoContratoColaborador.label', default: 'TipoContratoColaborador'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
