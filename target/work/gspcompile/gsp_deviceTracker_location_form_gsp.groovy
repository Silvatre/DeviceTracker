import pl.polsl.minwo.Location
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deviceTracker_location_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/location/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: locationInstance, field: 'device', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("location.device.label"),'default':("Device")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("device"),'name':("device.id"),'from':(pl.polsl.minwo.Device.list()),'optionKey':("id"),'required':(""),'value':(locationInstance?.device?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'latitude', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("location.latitude.label"),'default':("Latitude")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("latitude"),'value':(fieldValue(bean: locationInstance, field: 'latitude')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'latitudeDirection', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("location.latitudeDirection.label"),'default':("Latitude Direction")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['name':("latitudeDirection"),'from':(locationInstance.constraints.latitudeDirection.inList),'required':(""),'value':(locationInstance?.latitudeDirection),'valueMessagePrefix':("location.latitudeDirection")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'longitude', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("location.longitude.label"),'default':("Longitude")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("longitude"),'value':(fieldValue(bean: locationInstance, field: 'longitude')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'longitudeDirection', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("location.longitudeDirection.label"),'default':("Longitude Direction")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['name':("longitudeDirection"),'from':(locationInstance.constraints.longitudeDirection.inList),'required':(""),'value':(locationInstance?.longitudeDirection),'valueMessagePrefix':("location.longitudeDirection")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'date', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("location.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',55,['name':("date"),'precision':("minute"),'value':(locationInstance?.date)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402620839019L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
