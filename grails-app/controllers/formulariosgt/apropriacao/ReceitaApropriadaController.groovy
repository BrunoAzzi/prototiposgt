package formulariosgt.apropriacao



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ReceitaApropriadaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE", index: ["GET", "POST"]]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ReceitaApropriada.list(params), model:[receitaApropriadaInstanceCount: ReceitaApropriada.count()]
    }

    def show(ReceitaApropriada receitaApropriadaInstance) {
        respond receitaApropriadaInstance
    }

    def create() {
        respond new ReceitaApropriada(params)
    }

    @Transactional
    def save(ReceitaApropriada receitaApropriadaInstance) {
        if (receitaApropriadaInstance == null) {
            notFound()
            return
        }

        if (receitaApropriadaInstance.hasErrors()) {
            respond receitaApropriadaInstance.errors, view:'create'
            return
        }

        receitaApropriadaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'receitaApropriada.label', default: 'ReceitaApropriada'), receitaApropriadaInstance.id])
                redirect receitaApropriadaInstance
            }
            '*' { respond receitaApropriadaInstance, [status: CREATED] }
        }
    }

    def edit(ReceitaApropriada receitaApropriadaInstance) {
        respond receitaApropriadaInstance
    }

    @Transactional
    def update(ReceitaApropriada receitaApropriadaInstance) {
        if (receitaApropriadaInstance == null) {
            notFound()
            return
        }

        if (receitaApropriadaInstance.hasErrors()) {
            respond receitaApropriadaInstance.errors, view:'edit'
            return
        }

        receitaApropriadaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ReceitaApropriada.label', default: 'ReceitaApropriada'), receitaApropriadaInstance.id])
                redirect receitaApropriadaInstance
            }
            '*'{ respond receitaApropriadaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ReceitaApropriada receitaApropriadaInstance) {

        if (receitaApropriadaInstance == null) {
            notFound()
            return
        }

        receitaApropriadaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ReceitaApropriada.label', default: 'ReceitaApropriada'), receitaApropriadaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'receitaApropriada.label', default: 'ReceitaApropriada'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
