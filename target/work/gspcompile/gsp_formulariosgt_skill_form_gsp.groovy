import formulariosgt.colaboradores.Skill
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_skill_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/skill/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: skillInstance, field: 'descricao', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("skill.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("descricao"),'required':(""),'value':(skillInstance?.descricao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: skillInstance, field: 'colaboradorId', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("skill.colaboradorId.label"),'default':("Colaborador Id")],-1)
printHtmlPart(5)
invokeTag('select','g',19,['name':("colaboradorId"),'from':(formulariosgt.colaboradores.Colaborador.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(skillInstance?.colaboradorId*.id),'class':("many-to-many")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266408438L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
