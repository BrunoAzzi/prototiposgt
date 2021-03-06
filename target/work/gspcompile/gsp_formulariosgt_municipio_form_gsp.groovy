import formulariosgt.unidades.Municipio
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_formulariosgt_municipio_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/municipio/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: municipioInstance, field: 'descricao', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("municipio.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("descricao"),'required':(""),'value':(municipioInstance?.descricao)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: municipioInstance, field: 'unidadeFederativa', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("municipio.unidadeFederativa.label"),'default':("Unidade Federativa")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("unidadeFederativa"),'required':(""),'value':(municipioInstance?.unidadeFederativa)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: municipioInstance, field: 'regiao', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("municipio.regiao.label"),'default':("Regiao")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("regiao"),'name':("regiao.id"),'from':(formulariosgt.unidades.Regiao.list()),'optionKey':("id"),'required':(""),'value':(municipioInstance?.regiao?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: municipioInstance, field: 'unidades', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("municipio.unidades.label"),'default':("Unidades")],-1)
printHtmlPart(7)
for( u in (municipioInstance?.unidades) ) {
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(u?.encodeAsHTML())
})
invokeTag('link','g',40,['controller':("unidade"),'action':("show"),'id':(u.id)],2)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'unidade.label', default: 'Unidade')]))
})
invokeTag('link','g',43,['controller':("unidade"),'action':("create"),'params':(['municipio.id': municipioInstance?.id])],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430266795051L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
