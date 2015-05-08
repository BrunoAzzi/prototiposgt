import formulariosgt.clientes.Cliente
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_clienteindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cliente/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'cliente.label', default: 'Cliente'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("isAtivo"),'title':(message(code: 'cliente.isAtivo.label', default: 'Is Ativo'))],-1)
printHtmlPart(13)
invokeTag('message','g',29,['code':("cliente.pessoasFisicas.label"),'default':("Pessoas Fisicas")],-1)
printHtmlPart(14)
invokeTag('message','g',31,['code':("cliente.pessoasFisicasEstrangeiras.label"),'default':("Pessoas Fisicas Estrangeiras")],-1)
printHtmlPart(14)
invokeTag('message','g',33,['code':("cliente.pessoasJuridicas.label"),'default':("Pessoas Juridicas")],-1)
printHtmlPart(14)
invokeTag('message','g',35,['code':("cliente.pessoasJuridicasEstrangeiras.label"),'default':("Pessoas Juridicas Estrangeiras")],-1)
printHtmlPart(14)
invokeTag('message','g',37,['code':("cliente.tipocliente.label"),'default':("Tipocliente")],-1)
printHtmlPart(15)
loop:{
int i = 0
for( clienteInstance in (clienteInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: clienteInstance, field: "isAtivo"))
})
invokeTag('link','g',45,['action':("show"),'id':(clienteInstance.id)],3)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: clienteInstance, field: "pessoasFisicas"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: clienteInstance, field: "pessoasFisicasEstrangeiras"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: clienteInstance, field: "pessoasJuridicas"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: clienteInstance, field: "pessoasJuridicasEstrangeiras"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: clienteInstance, field: "tipocliente"))
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
invokeTag('paginate','g',62,['total':(clienteInstanceCount ?: 0)],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266140247L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
