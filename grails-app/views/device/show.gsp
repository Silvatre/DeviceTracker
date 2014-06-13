
<%@ page import="pl.polsl.minwo.Device" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'device.label', default: 'Device')}" />
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
		<div id="show-device" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list device">
			
				<g:if test="${deviceInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="device.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${deviceInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${deviceInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="device.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${deviceInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${deviceInstance?.locations}">
				<li class="fieldcontain">
					<span id="locations-label" class="property-label"><g:message code="device.locations.label" default="Locations" /></span>
					
						<g:each in="${deviceInstance.locations}" var="l">
						<span class="property-value" aria-labelledby="locations-label"><g:link controller="location" action="show" id="${l.id}">${l?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:deviceInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${deviceInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
