import formulariosgt.apropriacao.ProducaoApropriada
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_producaoApropriada_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/producaoApropriada/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: producaoApropriadaInstance, field: 'apropriador', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("producaoApropriada.apropriador.label"),'default':("Apropriador")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("apropriador"),'name':("apropriador.id"),'from':(formulariosgt.usuarios.Usuario.list()),'optionKey':("id"),'required':(""),'value':(producaoApropriadaInstance?.apropriador?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: producaoApropriadaInstance, field: 'atendimento', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("producaoApropriada.atendimento.label"),'default':("Atendimento")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("atendimento"),'name':("atendimento.id"),'from':(formulariosgt.atendimento.Atendimento.list()),'optionKey':("id"),'required':(""),'value':(producaoApropriadaInstance?.atendimento?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: producaoApropriadaInstance, field: 'dataDeApropriacao', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("producaoApropriada.dataDeApropriacao.label"),'default':("Data De Apropriacao")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("dataDeApropriacao"),'precision':("day"),'value':(producaoApropriadaInstance?.dataDeApropriacao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: producaoApropriadaInstance, field: 'quantidadeApropriada', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("producaoApropriada.quantidadeApropriada.label"),'default':("Quantidade Apropriada")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("quantidadeApropriada"),'type':("number"),'value':(producaoApropriadaInstance.quantidadeApropriada),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: producaoApropriadaInstance, field: 'receitaApropriada', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("producaoApropriada.receitaApropriada.label"),'default':("Receita Apropriada")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("receitaApropriada"),'name':("receitaApropriada.id"),'from':(formulariosgt.apropriacao.ReceitaApropriada.list()),'optionKey':("id"),'required':(""),'value':(producaoApropriadaInstance?.receitaApropriada?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430265961047L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
