import formulariosgt.produto.ProdutoLinha
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_produtoLinha_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produtoLinha/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: produtoLinhaInstance, field: 'descricao', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("produtoLinha.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("descricao"),'required':(""),'value':(produtoLinhaInstance?.descricao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: produtoLinhaInstance, field: 'numeroCentroDeResponsabilidade', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("produtoLinha.numeroCentroDeResponsabilidade.label"),'default':("Numero Centro De Responsabilidade")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("numeroCentroDeResponsabilidade"),'required':(""),'value':(produtoLinhaInstance?.numeroCentroDeResponsabilidade)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: produtoLinhaInstance, field: 'produtosCategorias', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("produtoLinha.produtosCategorias.label"),'default':("Produtos Categorias")],-1)
printHtmlPart(6)
for( p in (produtoLinhaInstance?.produtosCategorias) ) {
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("produtoCategoria"),'action':("show"),'id':(p.id)],2)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'produtoCategoria.label', default: 'ProdutoCategoria')]))
})
invokeTag('link','g',34,['controller':("produtoCategoria"),'action':("create"),'params':(['produtoLinha.id': produtoLinhaInstance?.id])],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430259885537L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
