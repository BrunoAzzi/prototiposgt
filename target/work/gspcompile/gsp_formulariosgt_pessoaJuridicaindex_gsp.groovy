import formulariosgt.clientes.PessoaJuridica
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_pessoaJuridicaindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pessoaJuridica/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'pessoaJuridica.label', default: 'PessoaJuridica'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('message','g',27,['code':("pessoaJuridica.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("cnae"),'title':(message(code: 'pessoaJuridica.cnae.label', default: 'Cnae'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',31,['property':("cnpj"),'title':(message(code: 'pessoaJuridica.cnpj.label', default: 'Cnpj'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',33,['property':("enderecoCobranca"),'title':(message(code: 'pessoaJuridica.enderecoCobranca.label', default: 'Endereco Cobranca'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',35,['property':("enderecoFaturamento"),'title':(message(code: 'pessoaJuridica.enderecoFaturamento.label', default: 'Endereco Faturamento'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',37,['property':("inscricaoEstadual"),'title':(message(code: 'pessoaJuridica.inscricaoEstadual.label', default: 'Inscricao Estadual'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( pessoaJuridicaInstance in (pessoaJuridicaInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: pessoaJuridicaInstance, field: "cliente"))
})
invokeTag('link','g',45,['action':("show"),'id':(pessoaJuridicaInstance.id)],3)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: pessoaJuridicaInstance, field: "cnae"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: pessoaJuridicaInstance, field: "cnpj"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: pessoaJuridicaInstance, field: "enderecoCobranca"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: pessoaJuridicaInstance, field: "enderecoFaturamento"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: pessoaJuridicaInstance, field: "inscricaoEstadual"))
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
invokeTag('paginate','g',62,['total':(pessoaJuridicaInstanceCount ?: 0)],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266194470L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
