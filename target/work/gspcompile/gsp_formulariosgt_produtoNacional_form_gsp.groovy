import formulariosgt.produto.ProdutoNacional
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_produtoNacional_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produtoNacional/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: produtoNacionalInstance, field: 'descricao', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("produtoNacional.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("descricao"),'required':(""),'value':(produtoNacionalInstance?.descricao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: produtoNacionalInstance, field: 'produtoCategoriaId', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("produtoNacional.produtoCategoriaId.label"),'default':("Produto Categoria Id")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("produtoCategoriaId"),'name':("produtoCategoriaId.id"),'from':(formulariosgt.produto.ProdutoCategoria.list()),'optionKey':("id"),'required':(""),'value':(produtoNacionalInstance?.produtoCategoriaId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: produtoNacionalInstance, field: 'produtosRegionais', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("produtoNacional.produtosRegionais.label"),'default':("Produtos Regionais")],-1)
printHtmlPart(6)
for( p in (produtoNacionalInstance?.produtosRegionais) ) {
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("produtoRegional"),'action':("show"),'id':(p.id)],2)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'produtoRegional.label', default: 'ProdutoRegional')]))
})
invokeTag('link','g',34,['controller':("produtoRegional"),'action':("create"),'params':(['produtoNacional.id': produtoNacionalInstance?.id])],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430259929481L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
