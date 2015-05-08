import formulariosgt.unidades.Unidade
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_unidadeshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/unidade/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'unidade.label', default: 'Unidade'))],-1)
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
if(true && (unidadeInstance?.descricao)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("unidade.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(unidadeInstance),'field':("descricao")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (unidadeInstance?.municipio)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("unidade.municipio.label"),'default':("Municipio")],-1)
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(unidadeInstance?.municipio?.encodeAsHTML())
})
invokeTag('link','g',39,['controller':("municipio"),'action':("show"),'id':(unidadeInstance?.municipio?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (unidadeInstance?.numeroCentroDeResponsabilidade)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("unidade.numeroCentroDeResponsabilidade.label"),'default':("Numero Centro De Responsabilidade")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(unidadeInstance),'field':("numeroCentroDeResponsabilidade")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (unidadeInstance?.produtosRegionais)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("unidade.produtosRegionais.label"),'default':("Produtos Regionais")],-1)
printHtmlPart(23)
for( p in (unidadeInstance.produtosRegionais) ) {
printHtmlPart(24)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',58,['controller':("produtoRegional"),'action':("show"),'id':(p.id)],4)
printHtmlPart(25)
}
printHtmlPart(26)
}
printHtmlPart(17)
if(true && (unidadeInstance?.tipoUnidade)) {
printHtmlPart(27)
invokeTag('message','g',66,['code':("unidade.tipoUnidade.label"),'default':("Tipo Unidade")],-1)
printHtmlPart(28)
createTagBody(3, {->
expressionOut.print(unidadeInstance?.tipoUnidade?.encodeAsHTML())
})
invokeTag('link','g',68,['controller':("tipoUnidade"),'action':("show"),'id':(unidadeInstance?.tipoUnidade?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (unidadeInstance?.usuarios)) {
printHtmlPart(29)
invokeTag('message','g',75,['code':("unidade.usuarios.label"),'default':("Usuarios")],-1)
printHtmlPart(23)
for( u in (unidadeInstance.usuarios) ) {
printHtmlPart(30)
createTagBody(4, {->
expressionOut.print(u?.encodeAsHTML())
})
invokeTag('link','g',78,['controller':("usuario"),'action':("show"),'id':(u.id)],4)
printHtmlPart(25)
}
printHtmlPart(26)
}
printHtmlPart(31)
createTagBody(2, {->
printHtmlPart(32)
createTagBody(3, {->
invokeTag('message','g',87,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',87,['class':("edit"),'action':("edit"),'resource':(unidadeInstance)],3)
printHtmlPart(33)
invokeTag('actionSubmit','g',88,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(34)
})
invokeTag('form','g',90,['url':([resource:unidadeInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',92,[:],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266818620L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
