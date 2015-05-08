import formulariosgt.produto.ProdutoRegional
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_produtoRegional_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produtoRegional/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: produtoRegionalInstance, field: 'atendimentos', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("produtoRegional.atendimentos.label"),'default':("Atendimentos")],-1)
printHtmlPart(2)
for( a in (produtoRegionalInstance?.atendimentos) ) {
printHtmlPart(3)
createTagBody(2, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',13,['controller':("atendimento"),'action':("show"),'id':(a.id)],2)
printHtmlPart(4)
}
printHtmlPart(5)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')]))
})
invokeTag('link','g',16,['controller':("atendimento"),'action':("create"),'params':(['produtoRegional.id': produtoRegionalInstance?.id])],1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: produtoRegionalInstance, field: 'colaboradoresAtendentes', 'error'))
printHtmlPart(7)
invokeTag('message','g',25,['code':("produtoRegional.colaboradoresAtendentes.label"),'default':("Colaboradores Atendentes")],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: produtoRegionalInstance, field: 'isAtivo', 'error'))
printHtmlPart(9)
invokeTag('message','g',34,['code':("produtoRegional.isAtivo.label"),'default':("Is Ativo")],-1)
printHtmlPart(10)
invokeTag('checkBox','g',37,['name':("isAtivo"),'value':(produtoRegionalInstance?.isAtivo)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: produtoRegionalInstance, field: 'nome', 'error'))
printHtmlPart(12)
invokeTag('message','g',43,['code':("produtoRegional.nome.label"),'default':("Nome")],-1)
printHtmlPart(13)
invokeTag('textField','g',46,['name':("nome"),'required':(""),'value':(produtoRegionalInstance?.nome)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: produtoRegionalInstance, field: 'numeroCentroDeResponsabilidade', 'error'))
printHtmlPart(14)
invokeTag('message','g',52,['code':("produtoRegional.numeroCentroDeResponsabilidade.label"),'default':("Numero Centro De Responsabilidade")],-1)
printHtmlPart(13)
invokeTag('field','g',55,['name':("numeroCentroDeResponsabilidade"),'type':("number"),'value':(produtoRegionalInstance.numeroCentroDeResponsabilidade),'required':("")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: produtoRegionalInstance, field: 'numeroCentroDeResponsabilidadeLivre', 'error'))
printHtmlPart(15)
invokeTag('message','g',61,['code':("produtoRegional.numeroCentroDeResponsabilidadeLivre.label"),'default':("Numero Centro De Responsabilidade Livre")],-1)
printHtmlPart(13)
invokeTag('field','g',64,['name':("numeroCentroDeResponsabilidadeLivre"),'type':("number"),'value':(produtoRegionalInstance.numeroCentroDeResponsabilidadeLivre),'required':("")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: produtoRegionalInstance, field: 'produtoNacionalId', 'error'))
printHtmlPart(16)
invokeTag('message','g',70,['code':("produtoRegional.produtoNacionalId.label"),'default':("Produto Nacional Id")],-1)
printHtmlPart(13)
invokeTag('select','g',73,['id':("produtoNacionalId"),'name':("produtoNacionalId.id"),'from':(formulariosgt.produto.ProdutoNacional.list()),'optionKey':("id"),'required':(""),'value':(produtoRegionalInstance?.produtoNacionalId?.id),'class':("many-to-one")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: produtoRegionalInstance, field: 'unidade', 'error'))
printHtmlPart(17)
invokeTag('message','g',79,['code':("produtoRegional.unidade.label"),'default':("Unidade")],-1)
printHtmlPart(13)
invokeTag('select','g',82,['id':("unidade"),'name':("unidade.id"),'from':(formulariosgt.unidades.Unidade.list()),'optionKey':("id"),'required':(""),'value':(produtoRegionalInstance?.unidade?.id),'class':("many-to-one")],-1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430259930314L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
