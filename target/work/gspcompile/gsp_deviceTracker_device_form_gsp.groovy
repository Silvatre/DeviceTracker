import pl.polsl.minwo.Device
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deviceTracker_device_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/device/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: deviceInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("device.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'required':(""),'value':(deviceInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: deviceInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("device.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("description"),'required':(""),'value':(deviceInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: deviceInstance, field: 'locations', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("device.locations.label"),'default':("Locations")],-1)
printHtmlPart(6)
for( l in (deviceInstance?.locations) ) {
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(l?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("location"),'action':("show"),'id':(l.id)],2)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'location.label', default: 'Location')]))
})
invokeTag('link','g',34,['controller':("location"),'action':("create"),'params':(['device.id': deviceInstance?.id])],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402617306720L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
