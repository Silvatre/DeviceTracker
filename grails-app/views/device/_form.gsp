<%@ page import="pl.polsl.minwo.Device" %>



<div class="fieldcontain ${hasErrors(bean: deviceInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="device.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${deviceInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: deviceInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="device.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${deviceInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: deviceInstance, field: 'locations', 'error')} ">
	<label for="locations">
		<g:message code="device.locations.label" default="Locations" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${deviceInstance?.locations?}" var="l">
    <li><g:link controller="location" action="show" id="${l.id}">${l?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="location" action="create" params="['device.id': deviceInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'location.label', default: 'Location')])}</g:link>
</li>
</ul>


</div>

