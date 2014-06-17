import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_deviceTracker_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('set','g',5,['var':("locationName"),'value':(message(code: 'location.label', default: 'Location'))],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("deviceName"),'value':(message(code: 'device.label', default: 'Device'))],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(4)
createTagBody(2, {->
createClosureForHtmlPart(5, 3)
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(6)
expressionOut.print(request.contextPath)
printHtmlPart(7)
expressionOut.print(request.contextPath)
printHtmlPart(8)
expressionOut.print(request.contextPath)
printHtmlPart(9)
expressionOut.print(request.contextPath)
printHtmlPart(10)
expressionOut.print(request.contextPath)
printHtmlPart(11)
})
invokeTag('captureHead','sitemesh',24,[:],1)
printHtmlPart(12)
createTagBody(1, {->
printHtmlPart(13)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(14)
invokeTag('message','g',46,['code':("default.home.label")],-1)
printHtmlPart(15)
expressionOut.print(createLink(uri: '/device/index'))
printHtmlPart(16)
invokeTag('message','g',52,['code':("default.list.label"),'args':([deviceName])],-1)
printHtmlPart(17)
expressionOut.print(createLink(uri: '/device/create'))
printHtmlPart(16)
invokeTag('message','g',55,['code':("default.new.label"),'args':([deviceName])],-1)
printHtmlPart(18)
expressionOut.print(createLink(uri: '/location/index'))
printHtmlPart(16)
invokeTag('message','g',63,['code':("default.list.label"),'args':([locationName])],-1)
printHtmlPart(17)
expressionOut.print(createLink(uri: '/location/create'))
printHtmlPart(16)
invokeTag('message','g',66,['code':("default.new.label"),'args':([locationName])],-1)
printHtmlPart(19)
invokeTag('layoutBody','g',85,[:],-1)
printHtmlPart(20)
expressionOut.print(request.contextPath)
printHtmlPart(21)
expressionOut.print(request.contextPath)
printHtmlPart(22)
expressionOut.print(request.contextPath)
printHtmlPart(23)
expressionOut.print(request.contextPath)
printHtmlPart(24)
expressionOut.print(request.contextPath)
printHtmlPart(25)
expressionOut.print(request.contextPath)
printHtmlPart(26)
expressionOut.print(request.contextPath)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',114,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402624559292L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
