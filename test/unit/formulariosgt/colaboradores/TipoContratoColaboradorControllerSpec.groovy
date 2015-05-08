package formulariosgt.colaboradores



import grails.test.mixin.*
import spock.lang.*

@TestFor(TipoContratoColaboradorController)
@Mock(TipoContratoColaborador)
class TipoContratoColaboradorControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.tipoContratoColaboradorInstanceList
            model.tipoContratoColaboradorInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.tipoContratoColaboradorInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'POST'
            def tipoContratoColaborador = new TipoContratoColaborador()
            tipoContratoColaborador.validate()
            controller.save(tipoContratoColaborador)

        then:"The create view is rendered again with the correct model"
            model.tipoContratoColaboradorInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            tipoContratoColaborador = new TipoContratoColaborador(params)

            controller.save(tipoContratoColaborador)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/tipoContratoColaborador/show/1'
            controller.flash.message != null
            TipoContratoColaborador.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def tipoContratoColaborador = new TipoContratoColaborador(params)
            controller.show(tipoContratoColaborador)

        then:"A model is populated containing the domain instance"
            model.tipoContratoColaboradorInstance == tipoContratoColaborador
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def tipoContratoColaborador = new TipoContratoColaborador(params)
            controller.edit(tipoContratoColaborador)

        then:"A model is populated containing the domain instance"
            model.tipoContratoColaboradorInstance == tipoContratoColaborador
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'PUT'
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/tipoContratoColaborador/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def tipoContratoColaborador = new TipoContratoColaborador()
            tipoContratoColaborador.validate()
            controller.update(tipoContratoColaborador)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.tipoContratoColaboradorInstance == tipoContratoColaborador

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            tipoContratoColaborador = new TipoContratoColaborador(params).save(flush: true)
            controller.update(tipoContratoColaborador)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/tipoContratoColaborador/show/$tipoContratoColaborador.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'DELETE'
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/tipoContratoColaborador/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def tipoContratoColaborador = new TipoContratoColaborador(params).save(flush: true)

        then:"It exists"
            TipoContratoColaborador.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(tipoContratoColaborador)

        then:"The instance is deleted"
            TipoContratoColaborador.count() == 0
            response.redirectedUrl == '/tipoContratoColaborador/index'
            flash.message != null
    }
}
