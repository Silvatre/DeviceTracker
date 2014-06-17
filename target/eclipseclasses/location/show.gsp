
<%@ page import="pl.polsl.minwo.Location" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'location.label', default: 'Location')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<div class="nav navbar-top-links navbar-right">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-location" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list location">
			
				<g:if test="${locationInstance?.device}">
				<li class="fieldcontain">
					<span id="device-label" class="property-label"><g:message code="location.device.label" default="Device" /></span>
					
						<span class="property-value" aria-labelledby="device-label"><g:link controller="device" action="show" id="${locationInstance?.device?.id}">${locationInstance?.device?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${locationInstance?.latitude}">
				<li class="fieldcontain">
					<span id="latitude-label" class="property-label"><g:message code="location.latitude.label" default="Latitude" /></span>
					
						<span class="property-value" aria-labelledby="latitude-label"><g:fieldValue bean="${locationInstance}" field="latitude"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${locationInstance?.latitudeDirection}">
				<li class="fieldcontain">
					<span id="latitudeDirection-label" class="property-label"><g:message code="location.latitudeDirection.label" default="Latitude Direction" /></span>
					
						<span class="property-value" aria-labelledby="latitudeDirection-label"><g:fieldValue bean="${locationInstance}" field="latitudeDirection"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${locationInstance?.longitude}">
				<li class="fieldcontain">
					<span id="longitude-label" class="property-label"><g:message code="location.longitude.label" default="Longitude" /></span>
					
						<span class="property-value" aria-labelledby="longitude-label"><g:fieldValue bean="${locationInstance}" field="longitude"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${locationInstance?.longitudeDirection}">
				<li class="fieldcontain">
					<span id="longitudeDirection-label" class="property-label"><g:message code="location.longitudeDirection.label" default="Longitude Direction" /></span>
					
						<span class="property-value" aria-labelledby="longitudeDirection-label"><g:fieldValue bean="${locationInstance}" field="longitudeDirection"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${locationInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="location.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:formatDate date="${locationInstance?.date}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:locationInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${locationInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
