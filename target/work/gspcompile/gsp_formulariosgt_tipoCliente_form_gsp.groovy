import formulariosgt.clientes.TipoCliente
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_tipoCliente_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tipoCliente/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: tipoClienteInstance, field: 'clientes', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("tipoCliente.clientes.label"),'default':("Clientes")],-1)
printHtmlPart(2)
for( c in (tipoClienteInstance?.clientes) ) {
printHtmlPart(3)
createTagBody(2, {->
expressionOut.print(c?.encodeAsHTML())
})
invokeTag('link','g',13,['controller':("cliente"),'action':("show"),'id':(c.id)],2)
printHtmlPart(4)
}
printHtmlPart(5)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'cliente.label', default: 'Cliente')]))
})
invokeTag('link','g',16,['controller':("cliente"),'action':("create"),'params':(['tipoCliente.id': tipoClienteInstance?.id])],1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: tipoClienteInstance, field: 'descricao', 'error'))
printHtmlPart(7)
invokeTag('message','g',25,['code':("tipoCliente.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(8)
invokeTag('textField','g',28,['name':("descricao"),'required':(""),'value':(tipoClienteInstance?.descricao)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266212203L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
