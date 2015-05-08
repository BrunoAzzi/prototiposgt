package formulariosgt.produto



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProdutoCategoriaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ProdutoCategoria.list(params), model:[produtoCategoriaInstanceCount: ProdutoCategoria.count()]
    }

    def show(ProdutoCategoria produtoCategoriaInstance) {
        respond produtoCategoriaInstance
    }

    def create() {
        respond new ProdutoCategoria(params)
    }

    @Transactional
    def save(ProdutoCategoria produtoCategoriaInstance) {
        if (produtoCategoriaInstance == null) {
            notFound()
            return
        }

        if (produtoCategoriaInstance.hasErrors()) {
            respond produtoCategoriaInstance.errors, view:'create'
            return
        }

        produtoCategoriaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'produtoCategoria.label', default: 'ProdutoCategoria'), produtoCategoriaInstance.id])
                redirect produtoCategoriaInstance
            }
            '*' { respond produtoCategoriaInstance, [status: CREATED] }
        }
    }

    def edit(ProdutoCategoria produtoCategoriaInstance) {
        respond produtoCategoriaInstance
    }

    @Transactional
    def update(ProdutoCategoria produtoCategoriaInstance) {
        if (produtoCategoriaInstance == null) {
            notFound()
            return
        }

        if (produtoCategoriaInstance.hasErrors()) {
            respond produtoCategoriaInstance.errors, view:'edit'
            return
        }

        produtoCategoriaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ProdutoCategoria.label', default: 'ProdutoCategoria'), produtoCategoriaInstance.id])
                redirect produtoCategoriaInstance
            }
            '*'{ respond produtoCategoriaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ProdutoCategoria produtoCategoriaInstance) {

        if (produtoCategoriaInstance == null) {
            notFound()
            return
        }

        produtoCategoriaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ProdutoCategoria.label', default: 'ProdutoCategoria'), produtoCategoriaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'produtoCategoria.label', default: 'ProdutoCategoria'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
