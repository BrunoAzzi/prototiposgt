import formulariosgt.clientes.PessoaJuridica
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_pessoaJuridicashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pessoaJuridica/show.gsp" }
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
if(true && (pessoaJuridicaInstance?.cliente)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("pessoaJuridica.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(pessoaJuridicaInstance?.cliente?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("cliente"),'action':("show"),'id':(pessoaJuridicaInstance?.cliente?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaInstance?.cnae)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("pessoaJuridica.cnae.label"),'default':("Cnae")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(pessoaJuridicaInstance),'field':("cnae")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaInstance?.cnpj)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("pessoaJuridica.cnpj.label"),'default':("Cnpj")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(pessoaJuridicaInstance),'field':("cnpj")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaInstance?.enderecoCobranca)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("pessoaJuridica.enderecoCobranca.label"),'default':("Endereco Cobranca")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(pessoaJuridicaInstance),'field':("enderecoCobranca")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaInstance?.enderecoFaturamento)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("pessoaJuridica.enderecoFaturamento.label"),'default':("Endereco Faturamento")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(pessoaJuridicaInstance),'field':("enderecoFaturamento")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaInstance?.inscricaoEstadual)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("pessoaJuridica.inscricaoEstadual.label"),'default':("Inscricao Estadual")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(pessoaJuridicaInstance),'field':("inscricaoEstadual")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaInstance?.nomeFantasia)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("pessoaJuridica.nomeFantasia.label"),'default':("Nome Fantasia")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(pessoaJuridicaInstance),'field':("nomeFantasia")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaInstance?.numeroDeFuncionarios)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("pessoaJuridica.numeroDeFuncionarios.label"),'default':("Numero De Funcionarios")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(pessoaJuridicaInstance),'field':("numeroDeFuncionarios")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (pessoaJuridicaInstance?.razaoSocial)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("pessoaJuridica.razaoSocial.label"),'default':("Razao Social")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(pessoaJuridicaInstance),'field':("razaoSocial")],-1)
printHtmlPart(16)
}
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
createTagBody(3, {->
invokeTag('message','g',110,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',110,['class':("edit"),'action':("edit"),'resource':(pessoaJuridicaInstance)],3)
printHtmlPart(36)
invokeTag('actionSubmit','g',111,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(37)
})
invokeTag('form','g',113,['url':([resource:pessoaJuridicaInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266194578L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
