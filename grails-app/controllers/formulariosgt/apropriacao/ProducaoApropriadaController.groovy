package formulariosgt.apropriacao



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProducaoApropriadaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ProducaoApropriada.list(params), model:[producaoApropriadaInstanceCount: ProducaoApropriada.count()]
    }

    def show(ProducaoApropriada producaoApropriadaInstance) {
        respond producaoApropriadaInstance
    }

    def create() {
        respond new ProducaoApropriada(params)
    }

    @Transactional
    def save(ProducaoApropriada producaoApropriadaInstance) {
        if (producaoApropriadaInstance == null) {
            notFound()
            return
        }

        if (producaoApropriadaInstance.hasErrors()) {
            respond producaoApropriadaInstance.errors, view:'create'
            return
        }

        producaoApropriadaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'producaoApropriada.label', default: 'ProducaoApropriada'), producaoApropriadaInstance.id])
                redirect producaoApropriadaInstance
            }
            '*' { respond producaoApropriadaInstance, [status: CREATED] }
        }
    }

    def edit(ProducaoApropriada producaoApropriadaInstance) {
        respond producaoApropriadaInstance
    }

    @Transactional
    def update(ProducaoApropriada producaoApropriadaInstance) {
        if (producaoApropriadaInstance == null) {
            notFound()
            return
        }

        if (producaoApropriadaInstance.hasErrors()) {
            respond producaoApropriadaInstance.errors, view:'edit'
            return
        }

        producaoApropriadaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ProducaoApropriada.label', default: 'ProducaoApropriada'), producaoApropriadaInstance.id])
                redirect producaoApropriadaInstance
            }
            '*'{ respond producaoApropriadaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ProducaoApropriada producaoApropriadaInstance) {

        if (producaoApropriadaInstance == null) {
            notFound()
            return
        }

        producaoApropriadaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ProducaoApropriada.label', default: 'ProducaoApropriada'), producaoApropriadaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'producaoApropriada.label', default: 'ProducaoApropriada'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
