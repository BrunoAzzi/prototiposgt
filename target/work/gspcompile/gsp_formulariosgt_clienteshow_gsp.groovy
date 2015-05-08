import formulariosgt.clientes.Cliente
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_clienteshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cliente/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'cliente.label', default: 'Cliente'))],-1)
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
if(true && (clienteInstance?.atendimentos)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("cliente.atendimentos.label"),'default':("Atendimentos")],-1)
printHtmlPart(15)
for( a in (clienteInstance.atendimentos) ) {
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
if(true && (clienteInstance?.contatos)) {
printHtmlPart(20)
invokeTag('message','g',39,['code':("cliente.contatos.label"),'default':("Contatos")],-1)
printHtmlPart(15)
for( c in (clienteInstance.contatos) ) {
printHtmlPart(21)
createTagBody(4, {->
expressionOut.print(c?.encodeAsHTML())
})
invokeTag('link','g',42,['controller':("contato"),'action':("show"),'id':(c.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (clienteInstance?.enderecos)) {
printHtmlPart(22)
invokeTag('message','g',50,['code':("cliente.enderecos.label"),'default':("Enderecos")],-1)
printHtmlPart(15)
for( e in (clienteInstance.enderecos) ) {
printHtmlPart(23)
createTagBody(4, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',53,['controller':("endereco"),'action':("show"),'id':(e.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (clienteInstance?.isAtivo)) {
printHtmlPart(24)
invokeTag('message','g',61,['code':("cliente.isAtivo.label"),'default':("Is Ativo")],-1)
printHtmlPart(25)
invokeTag('formatBoolean','g',63,['boolean':(clienteInstance?.isAtivo)],-1)
printHtmlPart(26)
}
printHtmlPart(19)
if(true && (clienteInstance?.pessoasFisicas)) {
printHtmlPart(27)
invokeTag('message','g',70,['code':("cliente.pessoasFisicas.label"),'default':("Pessoas Fisicas")],-1)
printHtmlPart(28)
createTagBody(3, {->
expressionOut.print(clienteInstance?.pessoasFisicas?.encodeAsHTML())
})
invokeTag('link','g',72,['controller':("pessoaFisica"),'action':("show"),'id':(clienteInstance?.pessoasFisicas?.id)],3)
printHtmlPart(26)
}
printHtmlPart(19)
if(true && (clienteInstance?.pessoasFisicasEstrangeiras)) {
printHtmlPart(29)
invokeTag('message','g',79,['code':("cliente.pessoasFisicasEstrangeiras.label"),'default':("Pessoas Fisicas Estrangeiras")],-1)
printHtmlPart(30)
createTagBody(3, {->
expressionOut.print(clienteInstance?.pessoasFisicasEstrangeiras?.encodeAsHTML())
})
invokeTag('link','g',81,['controller':("pessoaFisicaEstrangeira"),'action':("show"),'id':(clienteInstance?.pessoasFisicasEstrangeiras?.id)],3)
printHtmlPart(26)
}
printHtmlPart(19)
if(true && (clienteInstance?.pessoasJuridicas)) {
printHtmlPart(31)
invokeTag('message','g',88,['code':("cliente.pessoasJuridicas.label"),'default':("Pessoas Juridicas")],-1)
printHtmlPart(32)
createTagBody(3, {->
expressionOut.print(clienteInstance?.pessoasJuridicas?.encodeAsHTML())
})
invokeTag('link','g',90,['controller':("pessoaJuridica"),'action':("show"),'id':(clienteInstance?.pessoasJuridicas?.id)],3)
printHtmlPart(26)
}
printHtmlPart(19)
if(true && (clienteInstance?.pessoasJuridicasEstrangeiras)) {
printHtmlPart(33)
invokeTag('message','g',97,['code':("cliente.pessoasJuridicasEstrangeiras.label"),'default':("Pessoas Juridicas Estrangeiras")],-1)
printHtmlPart(34)
createTagBody(3, {->
expressionOut.print(clienteInstance?.pessoasJuridicasEstrangeiras?.encodeAsHTML())
})
invokeTag('link','g',99,['controller':("pessoaJuridicaEstrangeira"),'action':("show"),'id':(clienteInstance?.pessoasJuridicasEstrangeiras?.id)],3)
printHtmlPart(26)
}
printHtmlPart(19)
if(true && (clienteInstance?.tipocliente)) {
printHtmlPart(35)
invokeTag('message','g',106,['code':("cliente.tipocliente.label"),'default':("Tipocliente")],-1)
printHtmlPart(36)
createTagBody(3, {->
expressionOut.print(clienteInstance?.tipocliente?.encodeAsHTML())
})
invokeTag('link','g',108,['controller':("tipoCliente"),'action':("show"),'id':(clienteInstance?.tipocliente?.id)],3)
printHtmlPart(26)
}
printHtmlPart(19)
if(true && (clienteInstance?.ultimaAtualizacao)) {
printHtmlPart(37)
invokeTag('message','g',115,['code':("cliente.ultimaAtualizacao.label"),'default':("Ultima Atualizacao")],-1)
printHtmlPart(38)
invokeTag('formatDate','g',117,['date':(clienteInstance?.ultimaAtualizacao)],-1)
printHtmlPart(26)
}
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
createTagBody(3, {->
invokeTag('message','g',125,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',125,['class':("edit"),'action':("edit"),'resource':(clienteInstance)],3)
printHtmlPart(41)
invokeTag('actionSubmit','g',126,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(42)
})
invokeTag('form','g',128,['url':([resource:clienteInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',130,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266141214L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
