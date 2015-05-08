import formulariosgt.clientes.Contato
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_contato_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/contato/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: contatoInstance, field: 'cliente', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("contato.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("cliente"),'name':("cliente.id"),'from':(formulariosgt.clientes.Cliente.list()),'optionKey':("id"),'required':(""),'value':(contatoInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contatoInstance, field: 'email', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("contato.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("email"),'required':(""),'value':(contatoInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contatoInstance, field: 'nome', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("contato.nome.label"),'default':("Nome")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("nome"),'required':(""),'value':(contatoInstance?.nome)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contatoInstance, field: 'setor', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("contato.setor.label"),'default':("Setor")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("setor"),'required':(""),'value':(contatoInstance?.setor)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contatoInstance, field: 'telefone', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("contato.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("telefone"),'required':(""),'value':(contatoInstance?.telefone)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266206062L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
