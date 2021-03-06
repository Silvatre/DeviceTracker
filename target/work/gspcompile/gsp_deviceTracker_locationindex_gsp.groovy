import pl.polsl.minwo.Location
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deviceTracker_locationindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/location/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'location.label', default: 'Location'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',13,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',18,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',26,['property':("device"),'title':(message(code: 'location.device.label', default: 'Device'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',28,['property':("latitude"),'title':(message(code: 'location.latitude.label', default: 'Latitude'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',30,['property':("latitudeDirection"),'title':(message(code: 'location.latitudeDirection.label', default: 'Latitude Direction'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',32,['property':("longitude"),'title':(message(code: 'location.longitude.label', default: 'Longitude'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',34,['property':("longitudeDirection"),'title':(message(code: 'location.longitudeDirection.label', default: 'Longitude Direction'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',36,['property':("date"),'title':(message(code: 'location.date.label', default: 'Date'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( locationInstance in (locationInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: locationInstance, field: "device"))
})
invokeTag('link','g',44,['action':("show"),'id':(locationInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: locationInstance, field: "latitude"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: locationInstance, field: "latitudeDirection"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: locationInstance, field: "longitude"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: locationInstance, field: "longitudeDirection"))
printHtmlPart(17)
invokeTag('formatDate','g',54,['date':(locationInstance.date)],-1)
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',61,['total':(locationInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',64,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402625202367L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
