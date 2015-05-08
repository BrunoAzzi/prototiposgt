import formulariosgt.atendimento.AtendimentoStatus
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_atendimentoStatus_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/atendimentoStatus/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: atendimentoStatusInstance, field: 'atendimentos', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("atendimentoStatus.atendimentos.label"),'default':("Atendimentos")],-1)
printHtmlPart(2)
for( a in (atendimentoStatusInstance?.atendimentos) ) {
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
invokeTag('link','g',16,['controller':("atendimento"),'action':("create"),'params':(['atendimentoStatus.id': atendimentoStatusInstance?.id])],1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: atendimentoStatusInstance, field: 'descricao', 'error'))
printHtmlPart(7)
invokeTag('message','g',25,['code':("atendimentoStatus.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(8)
invokeTag('textField','g',28,['name':("descricao"),'required':(""),'value':(atendimentoStatusInstance?.descricao)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266007679L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
