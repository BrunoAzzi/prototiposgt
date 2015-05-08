import formulariosgt.apropriacao.ReceitaApropriada
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_receitaApropriada_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/receitaApropriada/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: receitaApropriadaInstance, field: 'apropriador', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("receitaApropriada.apropriador.label"),'default':("Apropriador")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("apropriador"),'name':("apropriador.id"),'from':(formulariosgt.usuarios.Usuario.list()),'optionKey':("id"),'required':(""),'value':(receitaApropriadaInstance?.apropriador?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: receitaApropriadaInstance, field: 'dataDeApropriacao', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("receitaApropriada.dataDeApropriacao.label"),'default':("Data De Apropriacao")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',19,['name':("dataDeApropriacao"),'precision':("day"),'value':(receitaApropriadaInstance?.dataDeApropriacao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: receitaApropriadaInstance, field: 'producoesApropriadas', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("receitaApropriada.producoesApropriadas.label"),'default':("Producoes Apropriadas")],-1)
printHtmlPart(6)
for( p in (receitaApropriadaInstance?.producoesApropriadas) ) {
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("producaoApropriada"),'action':("show"),'id':(p.id)],2)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'producaoApropriada.label', default: 'ProducaoApropriada')]))
})
invokeTag('link','g',34,['controller':("producaoApropriada"),'action':("create"),'params':(['receitaApropriada.id': receitaApropriadaInstance?.id])],1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: receitaApropriadaInstance, field: 'quantidadeApropriada', 'error'))
printHtmlPart(11)
invokeTag('message','g',43,['code':("receitaApropriada.quantidadeApropriada.label"),'default':("Quantidade Apropriada")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("quantidadeApropriada"),'type':("number"),'value':(receitaApropriadaInstance.quantidadeApropriada),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: receitaApropriadaInstance, field: 'receitaApropriada', 'error'))
printHtmlPart(12)
invokeTag('message','g',52,['code':("receitaApropriada.receitaApropriada.label"),'default':("Receita Apropriada")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("receitaApropriada"),'value':(fieldValue(bean: receitaApropriadaInstance, field: 'receitaApropriada')),'required':("")],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430265962477L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
