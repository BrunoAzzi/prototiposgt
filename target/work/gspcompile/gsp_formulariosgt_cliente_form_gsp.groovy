import formulariosgt.clientes.Cliente
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_cliente_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cliente/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'atendimentos', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("cliente.atendimentos.label"),'default':("Atendimentos")],-1)
printHtmlPart(2)
for( a in (clienteInstance?.atendimentos) ) {
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
invokeTag('link','g',16,['controller':("atendimento"),'action':("create"),'params':(['cliente.id': clienteInstance?.id])],1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'contatos', 'error'))
printHtmlPart(7)
invokeTag('message','g',25,['code':("cliente.contatos.label"),'default':("Contatos")],-1)
printHtmlPart(2)
for( c in (clienteInstance?.contatos) ) {
printHtmlPart(3)
createTagBody(2, {->
expressionOut.print(c?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("contato"),'action':("show"),'id':(c.id)],2)
printHtmlPart(4)
}
printHtmlPart(5)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'contato.label', default: 'Contato')]))
})
invokeTag('link','g',34,['controller':("contato"),'action':("create"),'params':(['cliente.id': clienteInstance?.id])],1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'enderecos', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("cliente.enderecos.label"),'default':("Enderecos")],-1)
printHtmlPart(2)
for( e in (clienteInstance?.enderecos) ) {
printHtmlPart(3)
createTagBody(2, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',49,['controller':("endereco"),'action':("show"),'id':(e.id)],2)
printHtmlPart(4)
}
printHtmlPart(5)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'endereco.label', default: 'Endereco')]))
})
invokeTag('link','g',52,['controller':("endereco"),'action':("create"),'params':(['cliente.id': clienteInstance?.id])],1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'isAtivo', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("cliente.isAtivo.label"),'default':("Is Ativo")],-1)
printHtmlPart(10)
invokeTag('checkBox','g',64,['name':("isAtivo"),'value':(clienteInstance?.isAtivo)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'pessoasFisicas', 'error'))
printHtmlPart(12)
invokeTag('message','g',70,['code':("cliente.pessoasFisicas.label"),'default':("Pessoas Fisicas")],-1)
printHtmlPart(13)
invokeTag('select','g',73,['id':("pessoasFisicas"),'name':("pessoasFisicas.id"),'from':(formulariosgt.clientes.PessoaFisica.list()),'optionKey':("id"),'required':(""),'value':(clienteInstance?.pessoasFisicas?.id),'class':("many-to-one")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'pessoasFisicasEstrangeiras', 'error'))
printHtmlPart(14)
invokeTag('message','g',79,['code':("cliente.pessoasFisicasEstrangeiras.label"),'default':("Pessoas Fisicas Estrangeiras")],-1)
printHtmlPart(13)
invokeTag('select','g',82,['id':("pessoasFisicasEstrangeiras"),'name':("pessoasFisicasEstrangeiras.id"),'from':(formulariosgt.clientes.PessoaFisicaEstrangeira.list()),'optionKey':("id"),'required':(""),'value':(clienteInstance?.pessoasFisicasEstrangeiras?.id),'class':("many-to-one")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'pessoasJuridicas', 'error'))
printHtmlPart(15)
invokeTag('message','g',88,['code':("cliente.pessoasJuridicas.label"),'default':("Pessoas Juridicas")],-1)
printHtmlPart(13)
invokeTag('select','g',91,['id':("pessoasJuridicas"),'name':("pessoasJuridicas.id"),'from':(formulariosgt.clientes.PessoaJuridica.list()),'optionKey':("id"),'required':(""),'value':(clienteInstance?.pessoasJuridicas?.id),'class':("many-to-one")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'pessoasJuridicasEstrangeiras', 'error'))
printHtmlPart(16)
invokeTag('message','g',97,['code':("cliente.pessoasJuridicasEstrangeiras.label"),'default':("Pessoas Juridicas Estrangeiras")],-1)
printHtmlPart(13)
invokeTag('select','g',100,['id':("pessoasJuridicasEstrangeiras"),'name':("pessoasJuridicasEstrangeiras.id"),'from':(formulariosgt.clientes.PessoaJuridicaEstrangeira.list()),'optionKey':("id"),'required':(""),'value':(clienteInstance?.pessoasJuridicasEstrangeiras?.id),'class':("many-to-one")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'tipocliente', 'error'))
printHtmlPart(17)
invokeTag('message','g',106,['code':("cliente.tipocliente.label"),'default':("Tipocliente")],-1)
printHtmlPart(13)
invokeTag('select','g',109,['id':("tipocliente"),'name':("tipocliente.id"),'from':(formulariosgt.clientes.TipoCliente.list()),'optionKey':("id"),'required':(""),'value':(clienteInstance?.tipocliente?.id),'class':("many-to-one")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: clienteInstance, field: 'ultimaAtualizacao', 'error'))
printHtmlPart(18)
invokeTag('message','g',115,['code':("cliente.ultimaAtualizacao.label"),'default':("Ultima Atualizacao")],-1)
printHtmlPart(13)
invokeTag('datePicker','g',118,['name':("ultimaAtualizacao"),'precision':("day"),'value':(clienteInstance?.ultimaAtualizacao)],-1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266141651L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
