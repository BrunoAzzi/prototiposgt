import formulariosgt.produto.ProdutoCategoria
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_produtoCategoriashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produtoCategoria/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'produtoCategoria.label', default: 'ProdutoCategoria'))],-1)
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
if(true && (produtoCategoriaInstance?.descricao)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("produtoCategoria.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(produtoCategoriaInstance),'field':("descricao")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (produtoCategoriaInstance?.numeroCentroDeResponsabilidade)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("produtoCategoria.numeroCentroDeResponsabilidade.label"),'default':("Numero Centro De Responsabilidade")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(produtoCategoriaInstance),'field':("numeroCentroDeResponsabilidade")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (produtoCategoriaInstance?.produtoLinhaId)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("produtoCategoria.produtoLinhaId.label"),'default':("Produto Linha Id")],-1)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(produtoCategoriaInstance?.produtoLinhaId?.encodeAsHTML())
})
invokeTag('link','g',48,['controller':("produtoLinha"),'action':("show"),'id':(produtoCategoriaInstance?.produtoLinhaId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (produtoCategoriaInstance?.produtosNacionais)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("produtoCategoria.produtosNacionais.label"),'default':("Produtos Nacionais")],-1)
printHtmlPart(23)
for( p in (produtoCategoriaInstance.produtosNacionais) ) {
printHtmlPart(24)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',58,['controller':("produtoNacional"),'action':("show"),'id':(p.id)],4)
printHtmlPart(25)
}
printHtmlPart(26)
}
printHtmlPart(27)
createTagBody(2, {->
printHtmlPart(28)
createTagBody(3, {->
invokeTag('message','g',67,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',67,['class':("edit"),'action':("edit"),'resource':(produtoCategoriaInstance)],3)
printHtmlPart(29)
invokeTag('actionSubmit','g',68,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(30)
})
invokeTag('form','g',70,['url':([resource:produtoCategoriaInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',72,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430259914512L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
