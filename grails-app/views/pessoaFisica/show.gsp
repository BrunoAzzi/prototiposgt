
<%@ page import="formulariosgt.clientes.PessoaFisica" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pessoaFisica.label', default: 'PessoaFisica')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-pessoaFisica" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-pessoaFisica" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list pessoaFisica">
			
				<g:if test="${pessoaFisicaInstance?.cliente}">
				<li class="fieldcontain">
					<span id="cliente-label" class="property-label"><g:message code="pessoaFisica.cliente.label" default="Cliente" /></span>
					
						<span class="property-value" aria-labelledby="cliente-label"><g:link controller="cliente" action="show" id="${pessoaFisicaInstance?.cliente?.id}">${pessoaFisicaInstance?.cliente?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaFisicaInstance?.cpf}">
				<li class="fieldcontain">
					<span id="cpf-label" class="property-label"><g:message code="pessoaFisica.cpf.label" default="Cpf" /></span>
					
						<span class="property-value" aria-labelledby="cpf-label"><g:fieldValue bean="${pessoaFisicaInstance}" field="cpf"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaFisicaInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="pessoaFisica.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${pessoaFisicaInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaFisicaInstance?.nomeCompleto}">
				<li class="fieldcontain">
					<span id="nomeCompleto-label" class="property-label"><g:message code="pessoaFisica.nomeCompleto.label" default="Nome Completo" /></span>
					
						<span class="property-value" aria-labelledby="nomeCompleto-label"><g:fieldValue bean="${pessoaFisicaInstance}" field="nomeCompleto"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaFisicaInstance?.telefone}">
				<li class="fieldcontain">
					<span id="telefone-label" class="property-label"><g:message code="pessoaFisica.telefone.label" default="Telefone" /></span>
					
						<span class="property-value" aria-labelledby="telefone-label"><g:fieldValue bean="${pessoaFisicaInstance}" field="telefone"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:pessoaFisicaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${pessoaFisicaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
