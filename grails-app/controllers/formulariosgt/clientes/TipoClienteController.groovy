package formulariosgt.clientes



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class TipoClienteController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond TipoCliente.list(params), model:[tipoClienteInstanceCount: TipoCliente.count()]
    }

    def show(TipoCliente tipoClienteInstance) {
        respond tipoClienteInstance
    }

    def create() {
        respond new TipoCliente(params)
    }

    @Transactional
    def save(TipoCliente tipoClienteInstance) {
        if (tipoClienteInstance == null) {
            notFound()
            return
        }

        if (tipoClienteInstance.hasErrors()) {
            respond tipoClienteInstance.errors, view:'create'
            return
        }

        tipoClienteInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'tipoCliente.label', default: 'TipoCliente'), tipoClienteInstance.id])
                redirect tipoClienteInstance
            }
            '*' { respond tipoClienteInstance, [status: CREATED] }
        }
    }

    def edit(TipoCliente tipoClienteInstance) {
        respond tipoClienteInstance
    }

    @Transactional
    def update(TipoCliente tipoClienteInstance) {
        if (tipoClienteInstance == null) {
            notFound()
            return
        }

        if (tipoClienteInstance.hasErrors()) {
            respond tipoClienteInstance.errors, view:'edit'
            return
        }

        tipoClienteInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'TipoCliente.label', default: 'TipoCliente'), tipoClienteInstance.id])
                redirect tipoClienteInstance
            }
            '*'{ respond tipoClienteInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(TipoCliente tipoClienteInstance) {

        if (tipoClienteInstance == null) {
            notFound()
            return
        }

        tipoClienteInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'TipoCliente.label', default: 'TipoCliente'), tipoClienteInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'tipoCliente.label', default: 'TipoCliente'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
