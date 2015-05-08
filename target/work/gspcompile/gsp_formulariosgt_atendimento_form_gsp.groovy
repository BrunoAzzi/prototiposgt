import formulariosgt.atendimento.Atendimento
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_atendimento_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/atendimento/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'atendente', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("atendimento.atendente.label"),'default':("Atendente")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("atendente"),'name':("atendente.id"),'from':(formulariosgt.usuarios.Usuario.list()),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.atendente?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'cliente', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("atendimento.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("cliente"),'name':("cliente.id"),'from':(formulariosgt.clientes.Cliente.list()),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'dataEmissao', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("atendimento.dataEmissao.label"),'default':("Data Emissao")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("dataEmissao"),'precision':("day"),'value':(atendimentoInstance?.dataEmissao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'descricao', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("atendimento.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("descricao"),'required':(""),'value':(atendimentoInstance?.descricao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'numeroDeProducaoEstimada', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("atendimento.numeroDeProducaoEstimada.label"),'default':("Numero De Producao Estimada")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("numeroDeProducaoEstimada"),'type':("number"),'value':(atendimentoInstance.numeroDeProducaoEstimada),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'numeroDeReceitaEstimada', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("atendimento.numeroDeReceitaEstimada.label"),'default':("Numero De Receita Estimada")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("numeroDeReceitaEstimada"),'type':("number"),'value':(atendimentoInstance.numeroDeReceitaEstimada),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'prodicoesApropriadas', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("atendimento.prodicoesApropriadas.label"),'default':("Prodicoes Apropriadas")],-1)
printHtmlPart(10)
for( p in (atendimentoInstance?.prodicoesApropriadas) ) {
printHtmlPart(11)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',67,['controller':("producaoApropriada"),'action':("show"),'id':(p.id)],2)
printHtmlPart(12)
}
printHtmlPart(13)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'producaoApropriada.label', default: 'ProducaoApropriada')]))
})
invokeTag('link','g',70,['controller':("producaoApropriada"),'action':("create"),'params':(['atendimento.id': atendimentoInstance?.id])],1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'produtoRegional', 'error'))
printHtmlPart(15)
invokeTag('message','g',79,['code':("atendimento.produtoRegional.label"),'default':("Produto Regional")],-1)
printHtmlPart(2)
invokeTag('select','g',82,['id':("produtoRegional"),'name':("produtoRegional.id"),'from':(formulariosgt.produto.ProdutoRegional.list()),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.produtoRegional?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'proposta', 'error'))
printHtmlPart(16)
invokeTag('message','g',88,['code':("atendimento.proposta.label"),'default':("Proposta")],-1)
printHtmlPart(2)
invokeTag('select','g',91,['id':("proposta"),'name':("proposta.id"),'from':(formulariosgt.atendimento.Proposta.list()),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.proposta?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'status', 'error'))
printHtmlPart(17)
invokeTag('message','g',97,['code':("atendimento.status.label"),'default':("Status")],-1)
printHtmlPart(2)
invokeTag('select','g',100,['id':("status"),'name':("status.id"),'from':(formulariosgt.atendimento.AtendimentoStatus.list()),'optionKey':("id"),'required':(""),'value':(atendimentoInstance?.status?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: atendimentoInstance, field: 'versao', 'error'))
printHtmlPart(18)
invokeTag('message','g',106,['code':("atendimento.versao.label"),'default':("Versao")],-1)
printHtmlPart(2)
invokeTag('field','g',109,['name':("versao"),'type':("number"),'value':(atendimentoInstance.versao),'required':("")],-1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430265983443L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
