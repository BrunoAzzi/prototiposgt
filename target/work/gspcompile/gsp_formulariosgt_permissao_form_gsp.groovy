import formulariosgt.permissoes.Permissao
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_permissao_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/permissao/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: permissaoInstance, field: 'descricao', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("permissao.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("descricao"),'required':(""),'value':(permissaoInstance?.descricao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: permissaoInstance, field: 'features', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("permissao.features.label"),'default':("Features")],-1)
printHtmlPart(5)
invokeTag('select','g',19,['name':("features"),'from':(formulariosgt.permissoes.Feature.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(permissaoInstance?.features*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: permissaoInstance, field: 'usuarios', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("permissao.usuarios.label"),'default':("Usuarios")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266765682L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
