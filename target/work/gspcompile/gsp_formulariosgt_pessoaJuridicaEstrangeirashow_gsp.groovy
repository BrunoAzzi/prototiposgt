import formulariosgt.clientes.PessoaJuridicaEstrangeira
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_pessoaJuridicaEstrangeirashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pessoaJuridicaEstrangeira/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'pessoaJuridicaEstrangeira.label', default: 'PessoaJuridicaEstrangeira'))],-1)
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
if(true && (pessoaJuridicaEstrangeiraInstance?.cliente)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("pessoaJuridicaEstrangeira.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(pessoaJuridicaEstrangeiraInstance?.cliente?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("cliente"),'action':("show"),'id':(pessoaJuridicaEstrangeiraInstance?.cliente?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaEstrangeiraInstance?.documentoEmpresaEstrangeira)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("pessoaJuridicaEstrangeira.documentoEmpresaEstrangeira.label"),'default':("Documento Empresa Estrangeira")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(pessoaJuridicaEstrangeiraInstance),'field':("documentoEmpresaEstrangeira")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaEstrangeiraInstance?.equivalenteRazaoSocial)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("pessoaJuridicaEstrangeira.equivalenteRazaoSocial.label"),'default':("Equivalente Razao Social")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(pessoaJuridicaEstrangeiraInstance),'field':("equivalenteRazaoSocial")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaEstrangeiraInstance?.nomeFantasia)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("pessoaJuridicaEstrangeira.nomeFantasia.label"),'default':("Nome Fantasia")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(pessoaJuridicaEstrangeiraInstance),'field':("nomeFantasia")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaEstrangeiraInstance?.numeroDeFuncionarios)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("pessoaJuridicaEstrangeira.numeroDeFuncionarios.label"),'default':("Numero De Funcionarios")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(pessoaJuridicaEstrangeiraInstance),'field':("numeroDeFuncionarios")],-1)
printHtmlPart(16)
}
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
createTagBody(3, {->
invokeTag('message','g',74,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',74,['class':("edit"),'action':("edit"),'resource':(pessoaJuridicaEstrangeiraInstance)],3)
printHtmlPart(28)
invokeTag('actionSubmit','g',75,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(29)
})
invokeTag('form','g',77,['url':([resource:pessoaJuridicaEstrangeiraInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',79,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266204466L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
