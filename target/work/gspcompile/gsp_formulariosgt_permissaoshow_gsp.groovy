import formulariosgt.permissoes.Permissao
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_permissaoshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/permissao/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'permissao.label', default: 'Permissao'))],-1)
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
if(true && (permissaoInstance?.descricao)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("permissao.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(permissaoInstance),'field':("descricao")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (permissaoInstance?.features)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("permissao.features.label"),'default':("Features")],-1)
printHtmlPart(19)
for( f in (permissaoInstance.features) ) {
printHtmlPart(20)
createTagBody(4, {->
expressionOut.print(f?.encodeAsHTML())
})
invokeTag('link','g',40,['controller':("feature"),'action':("show"),'id':(f.id)],4)
printHtmlPart(21)
}
printHtmlPart(22)
}
printHtmlPart(17)
if(true && (permissaoInstance?.usuarios)) {
printHtmlPart(23)
invokeTag('message','g',48,['code':("permissao.usuarios.label"),'default':("Usuarios")],-1)
printHtmlPart(19)
for( u in (permissaoInstance.usuarios) ) {
printHtmlPart(24)
createTagBody(4, {->
expressionOut.print(u?.encodeAsHTML())
})
invokeTag('link','g',51,['controller':("usuario"),'action':("show"),'id':(u.id)],4)
printHtmlPart(21)
}
printHtmlPart(22)
}
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
createTagBody(3, {->
invokeTag('message','g',60,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',60,['class':("edit"),'action':("edit"),'resource':(permissaoInstance)],3)
printHtmlPart(27)
invokeTag('actionSubmit','g',61,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(28)
})
invokeTag('form','g',63,['url':([resource:permissaoInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266765308L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
