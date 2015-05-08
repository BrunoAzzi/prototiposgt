import formulariosgt.clientes.PessoaFisicaEstrangeira
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_pessoaFisicaEstrangeira_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pessoaFisicaEstrangeira/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'cliente', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("pessoaFisicaEstrangeira.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("cliente"),'name':("cliente.id"),'from':(formulariosgt.clientes.Cliente.list()),'optionKey':("id"),'required':(""),'value':(pessoaFisicaEstrangeiraInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'email', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("pessoaFisicaEstrangeira.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("email"),'required':(""),'value':(pessoaFisicaEstrangeiraInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'nomeCompleto', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("pessoaFisicaEstrangeira.nomeCompleto.label"),'default':("Nome Completo")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("nomeCompleto"),'required':(""),'value':(pessoaFisicaEstrangeiraInstance?.nomeCompleto)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'numeroPassaporte', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("pessoaFisicaEstrangeira.numeroPassaporte.label"),'default':("Numero Passaporte")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("numeroPassaporte"),'required':(""),'value':(pessoaFisicaEstrangeiraInstance?.numeroPassaporte)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'telefone', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("pessoaFisicaEstrangeira.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("telefone"),'required':(""),'value':(pessoaFisicaEstrangeiraInstance?.telefone)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266195610L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
