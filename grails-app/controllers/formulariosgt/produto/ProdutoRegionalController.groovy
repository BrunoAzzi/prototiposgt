package formulariosgt.produto



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProdutoRegionalController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ProdutoRegional.list(params), model:[produtoRegionalInstanceCount: ProdutoRegional.count()]
    }

    def show(ProdutoRegional produtoRegionalInstance) {
        respond produtoRegionalInstance
    }

    def create() {
        respond new ProdutoRegional(params)
    }

    @Transactional
    def save(ProdutoRegional produtoRegionalInstance) {
        if (produtoRegionalInstance == null) {
            notFound()
            return
        }

        if (produtoRegionalInstance.hasErrors()) {
            respond produtoRegionalInstance.errors, view:'create'
            return
        }

        produtoRegionalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'produtoRegional.label', default: 'ProdutoRegional'), produtoRegionalInstance.id])
                redirect produtoRegionalInstance
            }
            '*' { respond produtoRegionalInstance, [status: CREATED] }
        }
    }

    def edit(ProdutoRegional produtoRegionalInstance) {
        respond produtoRegionalInstance
    }

    @Transactional
    def update(ProdutoRegional produtoRegionalInstance) {
        if (produtoRegionalInstance == null) {
            notFound()
            return
        }

        if (produtoRegionalInstance.hasErrors()) {
            respond produtoRegionalInstance.errors, view:'edit'
            return
        }

        produtoRegionalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ProdutoRegional.label', default: 'ProdutoRegional'), produtoRegionalInstance.id])
                redirect produtoRegionalInstance
            }
            '*'{ respond produtoRegionalInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ProdutoRegional produtoRegionalInstance) {

        if (produtoRegionalInstance == null) {
            notFound()
            return
        }

        produtoRegionalInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ProdutoRegional.label', default: 'ProdutoRegional'), produtoRegionalInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'produtoRegional.label', default: 'ProdutoRegional'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
