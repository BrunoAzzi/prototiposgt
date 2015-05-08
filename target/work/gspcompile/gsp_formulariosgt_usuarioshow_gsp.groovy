import formulariosgt.usuarios.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_usuarioshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'usuario.label', default: 'Usuario'))],-1)
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
if(true && (usuarioInstance?.atendimentos)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("usuario.atendimentos.label"),'default':("Atendimentos")],-1)
printHtmlPart(15)
for( a in (usuarioInstance.atendimentos) ) {
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
if(true && (usuarioInstance?.colaborador)) {
printHtmlPart(20)
invokeTag('message','g',39,['code':("usuario.colaborador.label"),'default':("Colaborador")],-1)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(usuarioInstance?.colaborador?.encodeAsHTML())
})
invokeTag('link','g',41,['controller':("colaborador"),'action':("show"),'id':(usuarioInstance?.colaborador?.id)],3)
printHtmlPart(22)
}
printHtmlPart(19)
if(true && (usuarioInstance?.isAtivo)) {
printHtmlPart(23)
invokeTag('message','g',48,['code':("usuario.isAtivo.label"),'default':("Is Ativo")],-1)
printHtmlPart(24)
invokeTag('formatBoolean','g',50,['boolean':(usuarioInstance?.isAtivo)],-1)
printHtmlPart(22)
}
printHtmlPart(19)
if(true && (usuarioInstance?.loginEmail)) {
printHtmlPart(25)
invokeTag('message','g',57,['code':("usuario.loginEmail.label"),'default':("Login Email")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',59,['bean':(usuarioInstance),'field':("loginEmail")],-1)
printHtmlPart(22)
}
printHtmlPart(19)
if(true && (usuarioInstance?.permissoes)) {
printHtmlPart(27)
invokeTag('message','g',66,['code':("usuario.permissoes.label"),'default':("Permissoes")],-1)
printHtmlPart(15)
for( p in (usuarioInstance.permissoes) ) {
printHtmlPart(28)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',69,['controller':("permissao"),'action':("show"),'id':(p.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (usuarioInstance?.producaoApropriada)) {
printHtmlPart(29)
invokeTag('message','g',77,['code':("usuario.producaoApropriada.label"),'default':("Producao Apropriada")],-1)
printHtmlPart(15)
for( p in (usuarioInstance.producaoApropriada) ) {
printHtmlPart(30)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',80,['controller':("producaoApropriada"),'action':("show"),'id':(p.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (usuarioInstance?.receitaApropriada)) {
printHtmlPart(31)
invokeTag('message','g',88,['code':("usuario.receitaApropriada.label"),'default':("Receita Apropriada")],-1)
printHtmlPart(15)
for( r in (usuarioInstance.receitaApropriada) ) {
printHtmlPart(32)
createTagBody(4, {->
expressionOut.print(r?.encodeAsHTML())
})
invokeTag('link','g',91,['controller':("receitaApropriada"),'action':("show"),'id':(r.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (usuarioInstance?.senha)) {
printHtmlPart(33)
invokeTag('message','g',99,['code':("usuario.senha.label"),'default':("Senha")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',101,['bean':(usuarioInstance),'field':("senha")],-1)
printHtmlPart(22)
}
printHtmlPart(19)
if(true && (usuarioInstance?.unidadeId)) {
printHtmlPart(35)
invokeTag('message','g',108,['code':("usuario.unidadeId.label"),'default':("Unidade Id")],-1)
printHtmlPart(36)
createTagBody(3, {->
expressionOut.print(usuarioInstance?.unidadeId?.encodeAsHTML())
})
invokeTag('link','g',110,['controller':("unidade"),'action':("show"),'id':(usuarioInstance?.unidadeId?.id)],3)
printHtmlPart(22)
}
printHtmlPart(19)
if(true && (usuarioInstance?.username)) {
printHtmlPart(37)
invokeTag('message','g',117,['code':("usuario.username.label"),'default':("Username")],-1)
printHtmlPart(38)
invokeTag('fieldValue','g',119,['bean':(usuarioInstance),'field':("username")],-1)
printHtmlPart(22)
}
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
createTagBody(3, {->
invokeTag('message','g',127,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',127,['class':("edit"),'action':("edit"),'resource':(usuarioInstance)],3)
printHtmlPart(41)
invokeTag('actionSubmit','g',128,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(42)
})
invokeTag('form','g',130,['url':([resource:usuarioInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',132,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266822336L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
