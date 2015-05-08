import formulariosgt.unidades.Unidade
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_unidade_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/unidade/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: unidadeInstance, field: 'descricao', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("unidade.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("descricao"),'required':(""),'value':(unidadeInstance?.descricao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: unidadeInstance, field: 'municipio', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("unidade.municipio.label"),'default':("Municipio")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("municipio"),'name':("municipio.id"),'from':(formulariosgt.unidades.Municipio.list()),'optionKey':("id"),'required':(""),'value':(unidadeInstance?.municipio?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: unidadeInstance, field: 'numeroCentroDeResponsabilidade', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("unidade.numeroCentroDeResponsabilidade.label"),'default':("Numero Centro De Responsabilidade")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("numeroCentroDeResponsabilidade"),'type':("number"),'value':(unidadeInstance.numeroCentroDeResponsabilidade),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: unidadeInstance, field: 'produtosRegionais', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("unidade.produtosRegionais.label"),'default':("Produtos Regionais")],-1)
printHtmlPart(7)
for( p in (unidadeInstance?.produtosRegionais) ) {
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',40,['controller':("produtoRegional"),'action':("show"),'id':(p.id)],2)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'produtoRegional.label', default: 'ProdutoRegional')]))
})
invokeTag('link','g',43,['controller':("produtoRegional"),'action':("create"),'params':(['unidade.id': unidadeInstance?.id])],1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: unidadeInstance, field: 'tipoUnidade', 'error'))
printHtmlPart(12)
invokeTag('message','g',52,['code':("unidade.tipoUnidade.label"),'default':("Tipo Unidade")],-1)
printHtmlPart(2)
invokeTag('select','g',55,['id':("tipoUnidade"),'name':("tipoUnidade.id"),'from':(formulariosgt.unidades.TipoUnidade.list()),'optionKey':("id"),'required':(""),'value':(unidadeInstance?.tipoUnidade?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: unidadeInstance, field: 'usuarios', 'error'))
printHtmlPart(13)
invokeTag('message','g',61,['code':("unidade.usuarios.label"),'default':("Usuarios")],-1)
printHtmlPart(7)
for( u in (unidadeInstance?.usuarios) ) {
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(u?.encodeAsHTML())
})
invokeTag('link','g',67,['controller':("usuario"),'action':("show"),'id':(u.id)],2)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'usuario.label', default: 'Usuario')]))
})
invokeTag('link','g',70,['controller':("usuario"),'action':("create"),'params':(['unidade.id': unidadeInstance?.id])],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266818923L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
