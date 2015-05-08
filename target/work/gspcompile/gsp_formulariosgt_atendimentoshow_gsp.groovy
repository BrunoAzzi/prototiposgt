import formulariosgt.atendimento.Atendimento
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_atendimentoshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/atendimento/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'atendimento.label', default: 'Atendimento'))],-1)
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
if(true && (atendimentoInstance?.atendente)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("atendimento.atendente.label"),'default':("Atendente")],-1)
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(atendimentoInstance?.atendente?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("usuario"),'action':("show"),'id':(atendimentoInstance?.atendente?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.cliente)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("atendimento.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(atendimentoInstance?.cliente?.encodeAsHTML())
})
invokeTag('link','g',39,['controller':("cliente"),'action':("show"),'id':(atendimentoInstance?.cliente?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.dataEmissao)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("atendimento.dataEmissao.label"),'default':("Data Emissao")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',48,['date':(atendimentoInstance?.dataEmissao)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.descricao)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("atendimento.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(atendimentoInstance),'field':("descricao")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.numeroDeProducaoEstimada)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("atendimento.numeroDeProducaoEstimada.label"),'default':("Numero De Producao Estimada")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(atendimentoInstance),'field':("numeroDeProducaoEstimada")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.numeroDeReceitaEstimada)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("atendimento.numeroDeReceitaEstimada.label"),'default':("Numero De Receita Estimada")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(atendimentoInstance),'field':("numeroDeReceitaEstimada")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.prodicoesApropriadas)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("atendimento.prodicoesApropriadas.label"),'default':("Prodicoes Apropriadas")],-1)
printHtmlPart(29)
for( p in (atendimentoInstance.prodicoesApropriadas) ) {
printHtmlPart(30)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',85,['controller':("producaoApropriada"),'action':("show"),'id':(p.id)],4)
printHtmlPart(31)
}
printHtmlPart(32)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.produtoRegional)) {
printHtmlPart(33)
invokeTag('message','g',93,['code':("atendimento.produtoRegional.label"),'default':("Produto Regional")],-1)
printHtmlPart(34)
createTagBody(3, {->
expressionOut.print(atendimentoInstance?.produtoRegional?.encodeAsHTML())
})
invokeTag('link','g',95,['controller':("produtoRegional"),'action':("show"),'id':(atendimentoInstance?.produtoRegional?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.proposta)) {
printHtmlPart(35)
invokeTag('message','g',102,['code':("atendimento.proposta.label"),'default':("Proposta")],-1)
printHtmlPart(36)
createTagBody(3, {->
expressionOut.print(atendimentoInstance?.proposta?.encodeAsHTML())
})
invokeTag('link','g',104,['controller':("proposta"),'action':("show"),'id':(atendimentoInstance?.proposta?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.status)) {
printHtmlPart(37)
invokeTag('message','g',111,['code':("atendimento.status.label"),'default':("Status")],-1)
printHtmlPart(38)
createTagBody(3, {->
expressionOut.print(atendimentoInstance?.status?.encodeAsHTML())
})
invokeTag('link','g',113,['controller':("atendimentoStatus"),'action':("show"),'id':(atendimentoInstance?.status?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (atendimentoInstance?.versao)) {
printHtmlPart(39)
invokeTag('message','g',120,['code':("atendimento.versao.label"),'default':("Versao")],-1)
printHtmlPart(40)
invokeTag('fieldValue','g',122,['bean':(atendimentoInstance),'field':("versao")],-1)
printHtmlPart(16)
}
printHtmlPart(41)
createTagBody(2, {->
printHtmlPart(42)
createTagBody(3, {->
invokeTag('message','g',130,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',130,['class':("edit"),'action':("edit"),'resource':(atendimentoInstance)],3)
printHtmlPart(43)
invokeTag('actionSubmit','g',131,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(44)
})
invokeTag('form','g',133,['url':([resource:atendimentoInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(45)
})
invokeTag('captureBody','sitemesh',135,[:],1)
printHtmlPart(46)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430265983139L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
