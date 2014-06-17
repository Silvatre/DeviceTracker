import pl.polsl.minwo.Location
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deviceTracker_locationshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/location/show.gsp" }
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
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',13,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("index")],2)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (locationInstance?.device)) {
printHtmlPart(13)
invokeTag('message','g',27,['code':("location.device.label"),'default':("Device")],-1)
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(locationInstance?.device?.encodeAsHTML())
})
invokeTag('link','g',29,['controller':("device"),'action':("show"),'id':(locationInstance?.device?.id)],3)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.latitude)) {
printHtmlPart(17)
invokeTag('message','g',36,['code':("location.latitude.label"),'default':("Latitude")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',38,['bean':(locationInstance),'field':("latitude")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.latitudeDirection)) {
printHtmlPart(19)
invokeTag('message','g',45,['code':("location.latitudeDirection.label"),'default':("Latitude Direction")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',47,['bean':(locationInstance),'field':("latitudeDirection")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.longitude)) {
printHtmlPart(21)
invokeTag('message','g',54,['code':("location.longitude.label"),'default':("Longitude")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',56,['bean':(locationInstance),'field':("longitude")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.longitudeDirection)) {
printHtmlPart(23)
invokeTag('message','g',63,['code':("location.longitudeDirection.label"),'default':("Longitude Direction")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',65,['bean':(locationInstance),'field':("longitudeDirection")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.date)) {
printHtmlPart(25)
invokeTag('message','g',72,['code':("location.date.label"),'default':("Date")],-1)
printHtmlPart(26)
invokeTag('formatDate','g',74,['date':(locationInstance?.date)],-1)
printHtmlPart(15)
}
printHtmlPart(27)
createTagBody(2, {->
printHtmlPart(28)
createTagBody(3, {->
invokeTag('message','g',82,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',82,['class':("edit"),'action':("edit"),'resource':(locationInstance)],3)
printHtmlPart(29)
invokeTag('actionSubmit','g',83,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(30)
})
invokeTag('form','g',85,['url':([resource:locationInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',87,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402618416495L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
