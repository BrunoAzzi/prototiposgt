package formulariosgt.produto



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProdutoLinhaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ProdutoLinha.list(params), model:[produtoLinhaInstanceCount: ProdutoLinha.count()]
    }

    def show(ProdutoLinha produtoLinhaInstance) {
        respond produtoLinhaInstance
    }

    def create() {
        respond new ProdutoLinha(params)
    }

    @Transactional
    def save(ProdutoLinha produtoLinhaInstance) {
        if (produtoLinhaInstance == null) {
            notFound()
            return
        }

        if (produtoLinhaInstance.hasErrors()) {
            respond produtoLinhaInstance.errors, view:'create'
            return
        }

        produtoLinhaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'produtoLinha.label', default: 'ProdutoLinha'), produtoLinhaInstance.id])
                redirect produtoLinhaInstance
            }
            '*' { respond produtoLinhaInstance, [status: CREATED] }
        }
    }

    def edit(ProdutoLinha produtoLinhaInstance) {
        respond produtoLinhaInstance
    }

    @Transactional
    def update(ProdutoLinha produtoLinhaInstance) {
        if (produtoLinhaInstance == null) {
            notFound()
            return
        }

        if (produtoLinhaInstance.hasErrors()) {
            respond produtoLinhaInstance.errors, view:'edit'
            return
        }

        produtoLinhaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ProdutoLinha.label', default: 'ProdutoLinha'), produtoLinhaInstance.id])
                redirect produtoLinhaInstance
            }
            '*'{ respond produtoLinhaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ProdutoLinha produtoLinhaInstance) {

        if (produtoLinhaInstance == null) {
            notFound()
            return
        }

        produtoLinhaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ProdutoLinha.label', default: 'ProdutoLinha'), produtoLinhaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'produtoLinha.label', default: 'ProdutoLinha'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
