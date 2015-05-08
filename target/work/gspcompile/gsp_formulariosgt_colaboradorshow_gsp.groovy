import formulariosgt.colaboradores.Colaborador
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_colaboradorshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/colaborador/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'colaborador.label', default: 'Colaborador'))],-1)
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
if(true && (colaboradorInstance?.cpf)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("colaborador.cpf.label"),'default':("Cpf")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(colaboradorInstance),'field':("cpf")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.email)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("colaborador.email.label"),'default':("Email")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(colaboradorInstance),'field':("email")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.formacaoColaboradorId)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("colaborador.formacaoColaboradorId.label"),'default':("Formacao Colaborador Id")],-1)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(colaboradorInstance?.formacaoColaboradorId?.encodeAsHTML())
})
invokeTag('link','g',48,['controller':("formacaoColaborador"),'action':("show"),'id':(colaboradorInstance?.formacaoColaboradorId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.isAtivo)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("colaborador.isAtivo.label"),'default':("Is Ativo")],-1)
printHtmlPart(23)
invokeTag('formatBoolean','g',57,['boolean':(colaboradorInstance?.isAtivo)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.linkCurriculumVitae)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("colaborador.linkCurriculumVitae.label"),'default':("Link Curriculum Vitae")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(colaboradorInstance),'field':("linkCurriculumVitae")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.nomeCompleto)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("colaborador.nomeCompleto.label"),'default':("Nome Completo")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(colaboradorInstance),'field':("nomeCompleto")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.numeroCentroDeResponsabilidade)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("colaborador.numeroCentroDeResponsabilidade.label"),'default':("Numero Centro De Responsabilidade")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(colaboradorInstance),'field':("numeroCentroDeResponsabilidade")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.numeroDeHorasDeTrabalho)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("colaborador.numeroDeHorasDeTrabalho.label"),'default':("Numero De Horas De Trabalho")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(colaboradorInstance),'field':("numeroDeHorasDeTrabalho")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.produtosRegionais)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("colaborador.produtosRegionais.label"),'default':("Produtos Regionais")],-1)
printHtmlPart(33)
for( p in (colaboradorInstance.produtosRegionais) ) {
printHtmlPart(34)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',103,['controller':("produtoRegional"),'action':("show"),'id':(p.id)],4)
printHtmlPart(35)
}
printHtmlPart(36)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.skills)) {
printHtmlPart(37)
invokeTag('message','g',111,['code':("colaborador.skills.label"),'default':("Skills")],-1)
printHtmlPart(33)
for( s in (colaboradorInstance.skills) ) {
printHtmlPart(38)
createTagBody(4, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',114,['controller':("skill"),'action':("show"),'id':(s.id)],4)
printHtmlPart(35)
}
printHtmlPart(36)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.telefone)) {
printHtmlPart(39)
invokeTag('message','g',122,['code':("colaborador.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(40)
invokeTag('fieldValue','g',124,['bean':(colaboradorInstance),'field':("telefone")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.tipoContratoColaboradorId)) {
printHtmlPart(41)
invokeTag('message','g',131,['code':("colaborador.tipoContratoColaboradorId.label"),'default':("Tipo Contrato Colaborador Id")],-1)
printHtmlPart(42)
createTagBody(3, {->
expressionOut.print(colaboradorInstance?.tipoContratoColaboradorId?.encodeAsHTML())
})
invokeTag('link','g',133,['controller':("tipoContratoColaborador"),'action':("show"),'id':(colaboradorInstance?.tipoContratoColaboradorId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (colaboradorInstance?.usuario)) {
printHtmlPart(43)
invokeTag('message','g',140,['code':("colaborador.usuario.label"),'default':("Usuario")],-1)
printHtmlPart(44)
createTagBody(3, {->
expressionOut.print(colaboradorInstance?.usuario?.encodeAsHTML())
})
invokeTag('link','g',142,['controller':("usuario"),'action':("show"),'id':(colaboradorInstance?.usuario?.id)],3)
printHtmlPart(16)
}
printHtmlPart(45)
createTagBody(2, {->
printHtmlPart(46)
createTagBody(3, {->
invokeTag('message','g',150,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',150,['class':("edit"),'action':("edit"),'resource':(colaboradorInstance)],3)
printHtmlPart(47)
invokeTag('actionSubmit','g',151,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(48)
})
invokeTag('form','g',153,['url':([resource:colaboradorInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(49)
})
invokeTag('captureBody','sitemesh',155,[:],1)
printHtmlPart(50)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266399619L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
