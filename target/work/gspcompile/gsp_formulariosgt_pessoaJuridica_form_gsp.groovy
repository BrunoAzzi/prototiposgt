import formulariosgt.clientes.PessoaJuridica
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_pessoaJuridica_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pessoaJuridica/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: pessoaJuridicaInstance, field: 'cliente', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("pessoaJuridica.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("cliente"),'name':("cliente.id"),'from':(formulariosgt.clientes.Cliente.list()),'optionKey':("id"),'required':(""),'value':(pessoaJuridicaInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaInstance, field: 'cnae', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("pessoaJuridica.cnae.label"),'default':("Cnae")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("cnae"),'required':(""),'value':(pessoaJuridicaInstance?.cnae)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaInstance, field: 'cnpj', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("pessoaJuridica.cnpj.label"),'default':("Cnpj")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("cnpj"),'required':(""),'value':(pessoaJuridicaInstance?.cnpj)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaInstance, field: 'enderecoCobranca', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("pessoaJuridica.enderecoCobranca.label"),'default':("Endereco Cobranca")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("enderecoCobranca"),'required':(""),'value':(pessoaJuridicaInstance?.enderecoCobranca)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaInstance, field: 'enderecoFaturamento', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("pessoaJuridica.enderecoFaturamento.label"),'default':("Endereco Faturamento")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("enderecoFaturamento"),'required':(""),'value':(pessoaJuridicaInstance?.enderecoFaturamento)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaInstance, field: 'inscricaoEstadual', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("pessoaJuridica.inscricaoEstadual.label"),'default':("Inscricao Estadual")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("inscricaoEstadual"),'required':(""),'value':(pessoaJuridicaInstance?.inscricaoEstadual)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaInstance, field: 'nomeFantasia', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("pessoaJuridica.nomeFantasia.label"),'default':("Nome Fantasia")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("nomeFantasia"),'required':(""),'value':(pessoaJuridicaInstance?.nomeFantasia)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaInstance, field: 'numeroDeFuncionarios', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("pessoaJuridica.numeroDeFuncionarios.label"),'default':("Numero De Funcionarios")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("numeroDeFuncionarios"),'type':("number"),'value':(pessoaJuridicaInstance.numeroDeFuncionarios),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pessoaJuridicaInstance, field: 'razaoSocial', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("pessoaJuridica.razaoSocial.label"),'default':("Razao Social")],-1)
printHtmlPart(2)
invokeTag('textField','g',82,['name':("razaoSocial"),'required':(""),'value':(pessoaJuridicaInstance?.razaoSocial)],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266194855L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
