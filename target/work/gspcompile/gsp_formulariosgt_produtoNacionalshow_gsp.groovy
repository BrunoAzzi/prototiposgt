import formulariosgt.produto.ProdutoNacional
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_produtoNacionalshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produtoNacional/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'produtoNacional.label', default: 'ProdutoNacional'))],-1)
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
if(true && (produtoNacionalInstance?.descricao)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("produtoNacional.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(produtoNacionalInstance),'field':("descricao")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (produtoNacionalInstance?.produtoCategoriaId)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("produtoNacional.produtoCategoriaId.label"),'default':("Produto Categoria Id")],-1)
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(produtoNacionalInstance?.produtoCategoriaId?.encodeAsHTML())
})
invokeTag('link','g',39,['controller':("produtoCategoria"),'action':("show"),'id':(produtoNacionalInstance?.produtoCategoriaId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (produtoNacionalInstance?.produtosRegionais)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("produtoNacional.produtosRegionais.label"),'default':("Produtos Regionais")],-1)
printHtmlPart(21)
for( p in (produtoNacionalInstance.produtosRegionais) ) {
printHtmlPart(22)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',49,['controller':("produtoRegional"),'action':("show"),'id':(p.id)],4)
printHtmlPart(23)
}
printHtmlPart(24)
}
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
createTagBody(3, {->
invokeTag('message','g',58,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',58,['class':("edit"),'action':("edit"),'resource':(produtoNacionalInstance)],3)
printHtmlPart(27)
invokeTag('actionSubmit','g',59,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(28)
})
invokeTag('form','g',61,['url':([resource:produtoNacionalInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430259928852L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
