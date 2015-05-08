package formulariosgt.produto



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProdutoNacionalController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ProdutoNacional.list(params), model:[produtoNacionalInstanceCount: ProdutoNacional.count()]
    }

    def show(ProdutoNacional produtoNacionalInstance) {
        respond produtoNacionalInstance
    }

    def create() {
        respond new ProdutoNacional(params)
    }

    @Transactional
    def save(ProdutoNacional produtoNacionalInstance) {
        if (produtoNacionalInstance == null) {
            notFound()
            return
        }

        if (produtoNacionalInstance.hasErrors()) {
            respond produtoNacionalInstance.errors, view:'create'
            return
        }

        produtoNacionalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'produtoNacional.label', default: 'ProdutoNacional'), produtoNacionalInstance.id])
                redirect produtoNacionalInstance
            }
            '*' { respond produtoNacionalInstance, [status: CREATED] }
        }
    }

    def edit(ProdutoNacional produtoNacionalInstance) {
        respond produtoNacionalInstance
    }

    @Transactional
    def update(ProdutoNacional produtoNacionalInstance) {
        if (produtoNacionalInstance == null) {
            notFound()
            return
        }

        if (produtoNacionalInstance.hasErrors()) {
            respond produtoNacionalInstance.errors, view:'edit'
            return
        }

        produtoNacionalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ProdutoNacional.label', default: 'ProdutoNacional'), produtoNacionalInstance.id])
                redirect produtoNacionalInstance
            }
            '*'{ respond produtoNacionalInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ProdutoNacional produtoNacionalInstance) {

        if (produtoNacionalInstance == null) {
            notFound()
            return
        }

        produtoNacionalInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ProdutoNacional.label', default: 'ProdutoNacional'), produtoNacionalInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'produtoNacional.label', default: 'ProdutoNacional'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
