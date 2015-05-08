
<%@ page import="formulariosgt.unidades.Municipio" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'municipio.label', default: 'Municipio')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-municipio" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-municipio" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list municipio">
			
				<g:if test="${municipioInstance?.descricao}">
				<li class="fieldcontain">
					<span id="descricao-label" class="property-label"><g:message code="municipio.descricao.label" default="Descricao" /></span>
					
						<span class="property-value" aria-labelledby="descricao-label"><g:fieldValue bean="${municipioInstance}" field="descricao"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${municipioInstance?.unidadeFederativa}">
				<li class="fieldcontain">
					<span id="unidadeFederativa-label" class="property-label"><g:message code="municipio.unidadeFederativa.label" default="Unidade Federativa" /></span>
					
						<span class="property-value" aria-labelledby="unidadeFederativa-label"><g:fieldValue bean="${municipioInstance}" field="unidadeFederativa"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${municipioInstance?.regiao}">
				<li class="fieldcontain">
					<span id="regiao-label" class="property-label"><g:message code="municipio.regiao.label" default="Regiao" /></span>
					
						<span class="property-value" aria-labelledby="regiao-label"><g:link controller="regiao" action="show" id="${municipioInstance?.regiao?.id}">${municipioInstance?.regiao?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${municipioInstance?.unidades}">
				<li class="fieldcontain">
					<span id="unidades-label" class="property-label"><g:message code="municipio.unidades.label" default="Unidades" /></span>
					
						<g:each in="${municipioInstance.unidades}" var="u">
						<span class="property-value" aria-labelledby="unidades-label"><g:link controller="unidade" action="show" id="${u.id}">${u?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:municipioInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${municipioInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
