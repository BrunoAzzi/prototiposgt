package formulariosgt.unidades



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class TipoUnidadeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond TipoUnidade.list(params), model:[tipoUnidadeInstanceCount: TipoUnidade.count()]
    }

    def show(TipoUnidade tipoUnidadeInstance) {
        respond tipoUnidadeInstance
    }

    def create() {
        respond new TipoUnidade(params)
    }

    @Transactional
    def save(TipoUnidade tipoUnidadeInstance) {
        if (tipoUnidadeInstance == null) {
            notFound()
            return
        }

        if (tipoUnidadeInstance.hasErrors()) {
            respond tipoUnidadeInstance.errors, view:'create'
            return
        }

        tipoUnidadeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'tipoUnidade.label', default: 'TipoUnidade'), tipoUnidadeInstance.id])
                redirect tipoUnidadeInstance
            }
            '*' { respond tipoUnidadeInstance, [status: CREATED] }
        }
    }

    def edit(TipoUnidade tipoUnidadeInstance) {
        respond tipoUnidadeInstance
    }

    @Transactional
    def update(TipoUnidade tipoUnidadeInstance) {
        if (tipoUnidadeInstance == null) {
            notFound()
            return
        }

        if (tipoUnidadeInstance.hasErrors()) {
            respond tipoUnidadeInstance.errors, view:'edit'
            return
        }

        tipoUnidadeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'TipoUnidade.label', default: 'TipoUnidade'), tipoUnidadeInstance.id])
                redirect tipoUnidadeInstance
            }
            '*'{ respond tipoUnidadeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(TipoUnidade tipoUnidadeInstance) {

        if (tipoUnidadeInstance == null) {
            notFound()
            return
        }

        tipoUnidadeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'TipoUnidade.label', default: 'TipoUnidade'), tipoUnidadeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'tipoUnidade.label', default: 'TipoUnidade'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
