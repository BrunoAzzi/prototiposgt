package formulariosgt.clientes



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PessoaJuridicaEstrangeiraController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond PessoaJuridicaEstrangeira.list(params), model:[pessoaJuridicaEstrangeiraInstanceCount: PessoaJuridicaEstrangeira.count()]
    }

    def show(PessoaJuridicaEstrangeira pessoaJuridicaEstrangeiraInstance) {
        respond pessoaJuridicaEstrangeiraInstance
    }

    def create() {
        respond new PessoaJuridicaEstrangeira(params)
    }

    @Transactional
    def save(PessoaJuridicaEstrangeira pessoaJuridicaEstrangeiraInstance) {
        if (pessoaJuridicaEstrangeiraInstance == null) {
            notFound()
            return
        }

        if (pessoaJuridicaEstrangeiraInstance.hasErrors()) {
            respond pessoaJuridicaEstrangeiraInstance.errors, view:'create'
            return
        }

        pessoaJuridicaEstrangeiraInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'pessoaJuridicaEstrangeira.label', default: 'PessoaJuridicaEstrangeira'), pessoaJuridicaEstrangeiraInstance.id])
                redirect pessoaJuridicaEstrangeiraInstance
            }
            '*' { respond pessoaJuridicaEstrangeiraInstance, [status: CREATED] }
        }
    }

    def edit(PessoaJuridicaEstrangeira pessoaJuridicaEstrangeiraInstance) {
        respond pessoaJuridicaEstrangeiraInstance
    }

    @Transactional
    def update(PessoaJuridicaEstrangeira pessoaJuridicaEstrangeiraInstance) {
        if (pessoaJuridicaEstrangeiraInstance == null) {
            notFound()
            return
        }

        if (pessoaJuridicaEstrangeiraInstance.hasErrors()) {
            respond pessoaJuridicaEstrangeiraInstance.errors, view:'edit'
            return
        }

        pessoaJuridicaEstrangeiraInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'PessoaJuridicaEstrangeira.label', default: 'PessoaJuridicaEstrangeira'), pessoaJuridicaEstrangeiraInstance.id])
                redirect pessoaJuridicaEstrangeiraInstance
            }
            '*'{ respond pessoaJuridicaEstrangeiraInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(PessoaJuridicaEstrangeira pessoaJuridicaEstrangeiraInstance) {

        if (pessoaJuridicaEstrangeiraInstance == null) {
            notFound()
            return
        }

        pessoaJuridicaEstrangeiraInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'PessoaJuridicaEstrangeira.label', default: 'PessoaJuridicaEstrangeira'), pessoaJuridicaEstrangeiraInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'pessoaJuridicaEstrangeira.label', default: 'PessoaJuridicaEstrangeira'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
