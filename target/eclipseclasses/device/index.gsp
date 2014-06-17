
<%@ page import="pl.polsl.minwo.Device" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'device.label', default: 'Device')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div class="nav navbar-top-links navbar-right">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-device" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table class="table table-bordered table-hover table-striped">
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'device.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="description" title="${message(code: 'device.description.label', default: 'Description')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${deviceInstanceList}" status="i" var="deviceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${deviceInstance.id}">${fieldValue(bean: deviceInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: deviceInstance, field: "description")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${deviceInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
