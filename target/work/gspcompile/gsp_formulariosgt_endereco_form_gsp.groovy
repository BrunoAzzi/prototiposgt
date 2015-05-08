import formulariosgt.clientes.Endereco
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_endereco_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/endereco/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: enderecoInstance, field: 'bairro', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("endereco.bairro.label"),'default':("Bairro")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("bairro"),'required':(""),'value':(enderecoInstance?.bairro)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: enderecoInstance, field: 'cep', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("endereco.cep.label"),'default':("Cep")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("cep"),'required':(""),'value':(enderecoInstance?.cep)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: enderecoInstance, field: 'cliente', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("endereco.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("cliente"),'name':("cliente.id"),'from':(formulariosgt.clientes.Cliente.list()),'optionKey':("id"),'required':(""),'value':(enderecoInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: enderecoInstance, field: 'localidade', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("endereco.localidade.label"),'default':("Localidade")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("localidade"),'required':(""),'value':(enderecoInstance?.localidade)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: enderecoInstance, field: 'logradouro', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("endereco.logradouro.label"),'default':("Logradouro")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("logradouro"),'required':(""),'value':(enderecoInstance?.logradouro)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: enderecoInstance, field: 'uf', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("endereco.uf.label"),'default':("Uf")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("uf"),'required':(""),'value':(enderecoInstance?.uf)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266200415L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
