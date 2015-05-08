package formulariosgt.clientes



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PessoaFisicaEstrangeiraController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond PessoaFisicaEstrangeira.list(params), model:[pessoaFisicaEstrangeiraInstanceCount: PessoaFisicaEstrangeira.count()]
    }

    def show(PessoaFisicaEstrangeira pessoaFisicaEstrangeiraInstance) {
        respond pessoaFisicaEstrangeiraInstance
    }

    def create() {
        respond new PessoaFisicaEstrangeira(params)
    }

    @Transactional
    def save(PessoaFisicaEstrangeira pessoaFisicaEstrangeiraInstance) {
        if (pessoaFisicaEstrangeiraInstance == null) {
            notFound()
            return
        }

        if (pessoaFisicaEstrangeiraInstance.hasErrors()) {
            respond pessoaFisicaEstrangeiraInstance.errors, view:'create'
            return
        }

        pessoaFisicaEstrangeiraInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'pessoaFisicaEstrangeira.label', default: 'PessoaFisicaEstrangeira'), pessoaFisicaEstrangeiraInstance.id])
                redirect pessoaFisicaEstrangeiraInstance
            }
            '*' { respond pessoaFisicaEstrangeiraInstance, [status: CREATED] }
        }
    }

    def edit(PessoaFisicaEstrangeira pessoaFisicaEstrangeiraInstance) {
        respond pessoaFisicaEstrangeiraInstance
    }

    @Transactional
    def update(PessoaFisicaEstrangeira pessoaFisicaEstrangeiraInstance) {
        if (pessoaFisicaEstrangeiraInstance == null) {
            notFound()
            return
        }

        if (pessoaFisicaEstrangeiraInstance.hasErrors()) {
            respond pessoaFisicaEstrangeiraInstance.errors, view:'edit'
            return
        }

        pessoaFisicaEstrangeiraInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'PessoaFisicaEstrangeira.label', default: 'PessoaFisicaEstrangeira'), pessoaFisicaEstrangeiraInstance.id])
                redirect pessoaFisicaEstrangeiraInstance
            }
            '*'{ respond pessoaFisicaEstrangeiraInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(PessoaFisicaEstrangeira pessoaFisicaEstrangeiraInstance) {

        if (pessoaFisicaEstrangeiraInstance == null) {
            notFound()
            return
        }

        pessoaFisicaEstrangeiraInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'PessoaFisicaEstrangeira.label', default: 'PessoaFisicaEstrangeira'), pessoaFisicaEstrangeiraInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'pessoaFisicaEstrangeira.label', default: 'PessoaFisicaEstrangeira'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
