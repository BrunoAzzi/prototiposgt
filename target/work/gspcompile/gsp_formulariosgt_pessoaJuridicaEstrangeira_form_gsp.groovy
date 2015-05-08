import formulariosgt.clientes.PessoaJuridicaEstrangeira
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_pessoaJuridicaEstrangeira_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pessoaJuridicaEstrangeira/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'cliente', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("pessoaJuridicaEstrangeira.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("cliente"),'name':("cliente.id"),'from':(formulariosgt.clientes.Cliente.list()),'optionKey':("id"),'required':(""),'value':(pessoaJuridicaEstrangeiraInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'documentoEmpresaEstrangeira', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("pessoaJuridicaEstrangeira.documentoEmpresaEstrangeira.label"),'default':("Documento Empresa Estrangeira")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("documentoEmpresaEstrangeira"),'required':(""),'value':(pessoaJuridicaEstrangeiraInstance?.documentoEmpresaEstrangeira)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'equivalenteRazaoSocial', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("pessoaJuridicaEstrangeira.equivalenteRazaoSocial.label"),'default':("Equivalente Razao Social")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("equivalenteRazaoSocial"),'required':(""),'value':(pessoaJuridicaEstrangeiraInstance?.equivalenteRazaoSocial)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'nomeFantasia', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("pessoaJuridicaEstrangeira.nomeFantasia.label"),'default':("Nome Fantasia")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("nomeFantasia"),'required':(""),'value':(pessoaJuridicaEstrangeiraInstance?.nomeFantasia)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'numeroDeFuncionarios', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("pessoaJuridicaEstrangeira.numeroDeFuncionarios.label"),'default':("Numero De Funcionarios")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("numeroDeFuncionarios"),'type':("number"),'value':(pessoaJuridicaEstrangeiraInstance.numeroDeFuncionarios),'required':("")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266205494L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
