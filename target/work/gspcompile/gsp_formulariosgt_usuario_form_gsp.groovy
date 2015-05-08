import formulariosgt.usuarios.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_usuario_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'atendimentos', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("usuario.atendimentos.label"),'default':("Atendimentos")],-1)
printHtmlPart(2)
for( a in (usuarioInstance?.atendimentos) ) {
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
invokeTag('link','g',16,['controller':("atendimento"),'action':("create"),'params':(['usuario.id': usuarioInstance?.id])],1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'colaborador', 'error'))
printHtmlPart(7)
invokeTag('message','g',25,['code':("usuario.colaborador.label"),'default':("Colaborador")],-1)
printHtmlPart(8)
invokeTag('select','g',28,['id':("colaborador"),'name':("colaborador.id"),'from':(formulariosgt.colaboradores.Colaborador.list()),'optionKey':("id"),'required':(""),'value':(usuarioInstance?.colaborador?.id),'class':("many-to-one")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'isAtivo', 'error'))
printHtmlPart(10)
invokeTag('message','g',34,['code':("usuario.isAtivo.label"),'default':("Is Ativo")],-1)
printHtmlPart(11)
invokeTag('checkBox','g',37,['name':("isAtivo"),'value':(usuarioInstance?.isAtivo)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'loginEmail', 'error'))
printHtmlPart(12)
invokeTag('message','g',43,['code':("usuario.loginEmail.label"),'default':("Login Email")],-1)
printHtmlPart(8)
invokeTag('textField','g',46,['name':("loginEmail"),'required':(""),'value':(usuarioInstance?.loginEmail)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'permissoes', 'error'))
printHtmlPart(13)
invokeTag('message','g',52,['code':("usuario.permissoes.label"),'default':("Permissoes")],-1)
printHtmlPart(11)
invokeTag('select','g',55,['name':("permissoes"),'from':(formulariosgt.permissoes.Permissao.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(usuarioInstance?.permissoes*.id),'class':("many-to-many")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'producaoApropriada', 'error'))
printHtmlPart(14)
invokeTag('message','g',61,['code':("usuario.producaoApropriada.label"),'default':("Producao Apropriada")],-1)
printHtmlPart(2)
for( p in (usuarioInstance?.producaoApropriada) ) {
printHtmlPart(3)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',67,['controller':("producaoApropriada"),'action':("show"),'id':(p.id)],2)
printHtmlPart(4)
}
printHtmlPart(5)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'producaoApropriada.label', default: 'ProducaoApropriada')]))
})
invokeTag('link','g',70,['controller':("producaoApropriada"),'action':("create"),'params':(['usuario.id': usuarioInstance?.id])],1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'receitaApropriada', 'error'))
printHtmlPart(15)
invokeTag('message','g',79,['code':("usuario.receitaApropriada.label"),'default':("Receita Apropriada")],-1)
printHtmlPart(2)
for( r in (usuarioInstance?.receitaApropriada) ) {
printHtmlPart(3)
createTagBody(2, {->
expressionOut.print(r?.encodeAsHTML())
})
invokeTag('link','g',85,['controller':("receitaApropriada"),'action':("show"),'id':(r.id)],2)
printHtmlPart(4)
}
printHtmlPart(5)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'receitaApropriada.label', default: 'ReceitaApropriada')]))
})
invokeTag('link','g',88,['controller':("receitaApropriada"),'action':("create"),'params':(['usuario.id': usuarioInstance?.id])],1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'senha', 'error'))
printHtmlPart(16)
invokeTag('message','g',97,['code':("usuario.senha.label"),'default':("Senha")],-1)
printHtmlPart(8)
invokeTag('textField','g',100,['name':("senha"),'required':(""),'value':(usuarioInstance?.senha)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'unidadeId', 'error'))
printHtmlPart(17)
invokeTag('message','g',106,['code':("usuario.unidadeId.label"),'default':("Unidade Id")],-1)
printHtmlPart(8)
invokeTag('select','g',109,['id':("unidadeId"),'name':("unidadeId.id"),'from':(formulariosgt.unidades.Unidade.list()),'optionKey':("id"),'required':(""),'value':(usuarioInstance?.unidadeId?.id),'class':("many-to-one")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'username', 'error'))
printHtmlPart(18)
invokeTag('message','g',115,['code':("usuario.username.label"),'default':("Username")],-1)
printHtmlPart(8)
invokeTag('textField','g',118,['name':("username"),'required':(""),'value':(usuarioInstance?.username)],-1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266822587L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
