import formulariosgt.produto.ProdutoCategoria
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_produtoCategoria_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produtoCategoria/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: produtoCategoriaInstance, field: 'descricao', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("produtoCategoria.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("descricao"),'required':(""),'value':(produtoCategoriaInstance?.descricao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: produtoCategoriaInstance, field: 'numeroCentroDeResponsabilidade', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("produtoCategoria.numeroCentroDeResponsabilidade.label"),'default':("Numero Centro De Responsabilidade")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("numeroCentroDeResponsabilidade"),'required':(""),'value':(produtoCategoriaInstance?.numeroCentroDeResponsabilidade)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: produtoCategoriaInstance, field: 'produtoLinhaId', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("produtoCategoria.produtoLinhaId.label"),'default':("Produto Linha Id")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("produtoLinhaId"),'name':("produtoLinhaId.id"),'from':(formulariosgt.produto.ProdutoLinha.list()),'optionKey':("id"),'required':(""),'value':(produtoCategoriaInstance?.produtoLinhaId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: produtoCategoriaInstance, field: 'produtosNacionais', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("produtoCategoria.produtosNacionais.label"),'default':("Produtos Nacionais")],-1)
printHtmlPart(7)
for( p in (produtoCategoriaInstance?.produtosNacionais) ) {
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',40,['controller':("produtoNacional"),'action':("show"),'id':(p.id)],2)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'produtoNacional.label', default: 'ProdutoNacional')]))
})
invokeTag('link','g',43,['controller':("produtoNacional"),'action':("create"),'params':(['produtoCategoria.id': produtoCategoriaInstance?.id])],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430259914813L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
