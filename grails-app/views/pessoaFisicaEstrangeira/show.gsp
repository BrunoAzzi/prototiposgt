
<%@ page import="formulariosgt.clientes.PessoaFisicaEstrangeira" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pessoaFisicaEstrangeira.label', default: 'PessoaFisicaEstrangeira')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-pessoaFisicaEstrangeira" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-pessoaFisicaEstrangeira" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list pessoaFisicaEstrangeira">
			
				<g:if test="${pessoaFisicaEstrangeiraInstance?.cliente}">
				<li class="fieldcontain">
					<span id="cliente-label" class="property-label"><g:message code="pessoaFisicaEstrangeira.cliente.label" default="Cliente" /></span>
					
						<span class="property-value" aria-labelledby="cliente-label"><g:link controller="cliente" action="show" id="${pessoaFisicaEstrangeiraInstance?.cliente?.id}">${pessoaFisicaEstrangeiraInstance?.cliente?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaFisicaEstrangeiraInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="pessoaFisicaEstrangeira.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${pessoaFisicaEstrangeiraInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaFisicaEstrangeiraInstance?.nomeCompleto}">
				<li class="fieldcontain">
					<span id="nomeCompleto-label" class="property-label"><g:message code="pessoaFisicaEstrangeira.nomeCompleto.label" default="Nome Completo" /></span>
					
						<span class="property-value" aria-labelledby="nomeCompleto-label"><g:fieldValue bean="${pessoaFisicaEstrangeiraInstance}" field="nomeCompleto"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaFisicaEstrangeiraInstance?.numeroPassaporte}">
				<li class="fieldcontain">
					<span id="numeroPassaporte-label" class="property-label"><g:message code="pessoaFisicaEstrangeira.numeroPassaporte.label" default="Numero Passaporte" /></span>
					
						<span class="property-value" aria-labelledby="numeroPassaporte-label"><g:fieldValue bean="${pessoaFisicaEstrangeiraInstance}" field="numeroPassaporte"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaFisicaEstrangeiraInstance?.telefone}">
				<li class="fieldcontain">
					<span id="telefone-label" class="property-label"><g:message code="pessoaFisicaEstrangeira.telefone.label" default="Telefone" /></span>
					
						<span class="property-value" aria-labelledby="telefone-label"><g:fieldValue bean="${pessoaFisicaEstrangeiraInstance}" field="telefone"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:pessoaFisicaEstrangeiraInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${pessoaFisicaEstrangeiraInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
