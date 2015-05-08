import formulariosgt.apropriacao.ReceitaApropriada
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_receitaApropriadashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/receitaApropriada/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'receitaApropriada.label', default: 'ReceitaApropriada'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (receitaApropriadaInstance?.apropriador)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("receitaApropriada.apropriador.label"),'default':("Apropriador")],-1)
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(receitaApropriadaInstance?.apropriador?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("usuario"),'action':("show"),'id':(receitaApropriadaInstance?.apropriador?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (receitaApropriadaInstance?.dataDeApropriacao)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("receitaApropriada.dataDeApropriacao.label"),'default':("Data De Apropriacao")],-1)
printHtmlPart(19)
invokeTag('formatDate','g',39,['date':(receitaApropriadaInstance?.dataDeApropriacao)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (receitaApropriadaInstance?.producoesApropriadas)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("receitaApropriada.producoesApropriadas.label"),'default':("Producoes Apropriadas")],-1)
printHtmlPart(21)
for( p in (receitaApropriadaInstance.producoesApropriadas) ) {
printHtmlPart(22)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',49,['controller':("producaoApropriada"),'action':("show"),'id':(p.id)],4)
printHtmlPart(23)
}
printHtmlPart(24)
}
printHtmlPart(17)
if(true && (receitaApropriadaInstance?.quantidadeApropriada)) {
printHtmlPart(25)
invokeTag('message','g',57,['code':("receitaApropriada.quantidadeApropriada.label"),'default':("Quantidade Apropriada")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',59,['bean':(receitaApropriadaInstance),'field':("quantidadeApropriada")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (receitaApropriadaInstance?.receitaApropriada)) {
printHtmlPart(27)
invokeTag('message','g',66,['code':("receitaApropriada.receitaApropriada.label"),'default':("Receita Apropriada")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',68,['bean':(receitaApropriadaInstance),'field':("receitaApropriada")],-1)
printHtmlPart(16)
}
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(30)
createTagBody(3, {->
invokeTag('message','g',76,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',76,['class':("edit"),'action':("edit"),'resource':(receitaApropriadaInstance)],3)
printHtmlPart(31)
invokeTag('actionSubmit','g',77,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(32)
})
invokeTag('form','g',79,['url':([resource:receitaApropriadaInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',81,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430265962013L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
