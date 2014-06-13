<%@ page import="pl.polsl.minwo.Location" %>



<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'device', 'error')} required">
	<label for="device">
		<g:message code="location.device.label" default="Device" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="device" name="device.id" from="${pl.polsl.minwo.Device.list()}" optionKey="id" required="" value="${locationInstance?.device?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'latitude', 'error')} required">
	<label for="latitude">
		<g:message code="location.latitude.label" default="Latitude" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="latitude" value="${fieldValue(bean: locationInstance, field: 'latitude')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'latitudeDirection', 'error')} required">
	<label for="latitudeDirection">
		<g:message code="location.latitudeDirection.label" default="Latitude Direction" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="latitudeDirection" from="${locationInstance.constraints.latitudeDirection.inList}" required="" value="${locationInstance?.latitudeDirection}" valueMessagePrefix="location.latitudeDirection"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'longitude', 'error')} required">
	<label for="longitude">
		<g:message code="location.longitude.label" default="Longitude" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="longitude" value="${fieldValue(bean: locationInstance, field: 'longitude')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'longitudeDirection', 'error')} required">
	<label for="longitudeDirection">
		<g:message code="location.longitudeDirection.label" default="Longitude Direction" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="longitudeDirection" from="${locationInstance.constraints.longitudeDirection.inList}" required="" value="${locationInstance?.longitudeDirection}" valueMessagePrefix="location.longitudeDirection"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'date', 'error')} required">
	<label for="date">
		<g:message code="location.date.label" default="Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="date" precision="minute" value="${locationInstance?.date}"  />

</div>

