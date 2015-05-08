import formulariosgt.colaboradores.Colaborador
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_colaborador_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/colaborador/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'cpf', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("colaborador.cpf.label"),'default':("Cpf")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("cpf"),'required':(""),'value':(colaboradorInstance?.cpf)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'email', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("colaborador.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("email"),'required':(""),'value':(colaboradorInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'formacaoColaboradorId', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("colaborador.formacaoColaboradorId.label"),'default':("Formacao Colaborador Id")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("formacaoColaboradorId"),'name':("formacaoColaboradorId.id"),'from':(formulariosgt.colaboradores.FormacaoColaborador.list()),'optionKey':("id"),'required':(""),'value':(colaboradorInstance?.formacaoColaboradorId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'isAtivo', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("colaborador.isAtivo.label"),'default':("Is Ativo")],-1)
printHtmlPart(7)
invokeTag('checkBox','g',37,['name':("isAtivo"),'value':(colaboradorInstance?.isAtivo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'linkCurriculumVitae', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("colaborador.linkCurriculumVitae.label"),'default':("Link Curriculum Vitae")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("linkCurriculumVitae"),'required':(""),'value':(colaboradorInstance?.linkCurriculumVitae)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'nomeCompleto', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("colaborador.nomeCompleto.label"),'default':("Nome Completo")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("nomeCompleto"),'required':(""),'value':(colaboradorInstance?.nomeCompleto)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'numeroCentroDeResponsabilidade', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("colaborador.numeroCentroDeResponsabilidade.label"),'default':("Numero Centro De Responsabilidade")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("numeroCentroDeResponsabilidade"),'required':(""),'value':(colaboradorInstance?.numeroCentroDeResponsabilidade)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'numeroDeHorasDeTrabalho', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("colaborador.numeroDeHorasDeTrabalho.label"),'default':("Numero De Horas De Trabalho")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("numeroDeHorasDeTrabalho"),'type':("number"),'value':(colaboradorInstance.numeroDeHorasDeTrabalho),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'produtosRegionais', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("colaborador.produtosRegionais.label"),'default':("Produtos Regionais")],-1)
printHtmlPart(7)
invokeTag('select','g',82,['name':("produtosRegionais"),'from':(formulariosgt.produto.ProdutoRegional.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(colaboradorInstance?.produtosRegionais*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'skills', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("colaborador.skills.label"),'default':("Skills")],-1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'telefone', 'error'))
printHtmlPart(15)
invokeTag('message','g',97,['code':("colaborador.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(2)
invokeTag('textField','g',100,['name':("telefone"),'required':(""),'value':(colaboradorInstance?.telefone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'tipoContratoColaboradorId', 'error'))
printHtmlPart(16)
invokeTag('message','g',106,['code':("colaborador.tipoContratoColaboradorId.label"),'default':("Tipo Contrato Colaborador Id")],-1)
printHtmlPart(2)
invokeTag('select','g',109,['id':("tipoContratoColaboradorId"),'name':("tipoContratoColaboradorId.id"),'from':(formulariosgt.colaboradores.TipoContratoColaborador.list()),'optionKey':("id"),'required':(""),'value':(colaboradorInstance?.tipoContratoColaboradorId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: colaboradorInstance, field: 'usuario', 'error'))
printHtmlPart(17)
invokeTag('message','g',115,['code':("colaborador.usuario.label"),'default':("Usuario")],-1)
printHtmlPart(2)
invokeTag('select','g',118,['id':("usuario"),'name':("usuario.id"),'from':(formulariosgt.usuarios.Usuario.list()),'optionKey':("id"),'required':(""),'value':(colaboradorInstance?.usuario?.id),'class':("many-to-one")],-1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266400300L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
