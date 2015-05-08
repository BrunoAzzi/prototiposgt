import formulariosgt.produto.ProdutoRegional
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_produtoRegionalshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produtoRegional/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'produtoRegional.label', default: 'ProdutoRegional'))],-1)
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
if(true && (produtoRegionalInstance?.atendimentos)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("produtoRegional.atendimentos.label"),'default':("Atendimentos")],-1)
printHtmlPart(15)
for( a in (produtoRegionalInstance.atendimentos) ) {
printHtmlPart(16)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("atendimento"),'action':("show"),'id':(a.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (produtoRegionalInstance?.colaboradoresAtendentes)) {
printHtmlPart(20)
invokeTag('message','g',39,['code':("produtoRegional.colaboradoresAtendentes.label"),'default':("Colaboradores Atendentes")],-1)
printHtmlPart(15)
for( c in (produtoRegionalInstance.colaboradoresAtendentes) ) {
printHtmlPart(21)
createTagBody(4, {->
expressionOut.print(c?.encodeAsHTML())
})
invokeTag('link','g',42,['controller':("colaborador"),'action':("show"),'id':(c.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (produtoRegionalInstance?.isAtivo)) {
printHtmlPart(22)
invokeTag('message','g',50,['code':("produtoRegional.isAtivo.label"),'default':("Is Ativo")],-1)
printHtmlPart(23)
invokeTag('formatBoolean','g',52,['boolean':(produtoRegionalInstance?.isAtivo)],-1)
printHtmlPart(24)
}
printHtmlPart(19)
if(true && (produtoRegionalInstance?.nome)) {
printHtmlPart(25)
invokeTag('message','g',59,['code':("produtoRegional.nome.label"),'default':("Nome")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',61,['bean':(produtoRegionalInstance),'field':("nome")],-1)
printHtmlPart(24)
}
printHtmlPart(19)
if(true && (produtoRegionalInstance?.numeroCentroDeResponsabilidade)) {
printHtmlPart(27)
invokeTag('message','g',68,['code':("produtoRegional.numeroCentroDeResponsabilidade.label"),'default':("Numero Centro De Responsabilidade")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',70,['bean':(produtoRegionalInstance),'field':("numeroCentroDeResponsabilidade")],-1)
printHtmlPart(24)
}
printHtmlPart(19)
if(true && (produtoRegionalInstance?.numeroCentroDeResponsabilidadeLivre)) {
printHtmlPart(29)
invokeTag('message','g',77,['code':("produtoRegional.numeroCentroDeResponsabilidadeLivre.label"),'default':("Numero Centro De Responsabilidade Livre")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',79,['bean':(produtoRegionalInstance),'field':("numeroCentroDeResponsabilidadeLivre")],-1)
printHtmlPart(24)
}
printHtmlPart(19)
if(true && (produtoRegionalInstance?.produtoNacionalId)) {
printHtmlPart(31)
invokeTag('message','g',86,['code':("produtoRegional.produtoNacionalId.label"),'default':("Produto Nacional Id")],-1)
printHtmlPart(32)
createTagBody(3, {->
expressionOut.print(produtoRegionalInstance?.produtoNacionalId?.encodeAsHTML())
})
invokeTag('link','g',88,['controller':("produtoNacional"),'action':("show"),'id':(produtoRegionalInstance?.produtoNacionalId?.id)],3)
printHtmlPart(24)
}
printHtmlPart(19)
if(true && (produtoRegionalInstance?.unidade)) {
printHtmlPart(33)
invokeTag('message','g',95,['code':("produtoRegional.unidade.label"),'default':("Unidade")],-1)
printHtmlPart(34)
createTagBody(3, {->
expressionOut.print(produtoRegionalInstance?.unidade?.encodeAsHTML())
})
invokeTag('link','g',97,['controller':("unidade"),'action':("show"),'id':(produtoRegionalInstance?.unidade?.id)],3)
printHtmlPart(24)
}
printHtmlPart(35)
createTagBody(2, {->
printHtmlPart(36)
createTagBody(3, {->
invokeTag('message','g',105,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',105,['class':("edit"),'action':("edit"),'resource':(produtoRegionalInstance)],3)
printHtmlPart(37)
invokeTag('actionSubmit','g',106,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(38)
})
invokeTag('form','g',108,['url':([resource:produtoRegionalInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(39)
})
invokeTag('captureBody','sitemesh',110,[:],1)
printHtmlPart(40)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430259930034L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
