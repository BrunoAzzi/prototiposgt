
<%@ page import="formulariosgt.clientes.PessoaJuridicaEstrangeira" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pessoaJuridicaEstrangeira.label', default: 'PessoaJuridicaEstrangeira')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-pessoaJuridicaEstrangeira" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-pessoaJuridicaEstrangeira" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list pessoaJuridicaEstrangeira">
			
				<g:if test="${pessoaJuridicaEstrangeiraInstance?.cliente}">
				<li class="fieldcontain">
					<span id="cliente-label" class="property-label"><g:message code="pessoaJuridicaEstrangeira.cliente.label" default="Cliente" /></span>
					
						<span class="property-value" aria-labelledby="cliente-label"><g:link controller="cliente" action="show" id="${pessoaJuridicaEstrangeiraInstance?.cliente?.id}">${pessoaJuridicaEstrangeiraInstance?.cliente?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaEstrangeiraInstance?.documentoEmpresaEstrangeira}">
				<li class="fieldcontain">
					<span id="documentoEmpresaEstrangeira-label" class="property-label"><g:message code="pessoaJuridicaEstrangeira.documentoEmpresaEstrangeira.label" default="Documento Empresa Estrangeira" /></span>
					
						<span class="property-value" aria-labelledby="documentoEmpresaEstrangeira-label"><g:fieldValue bean="${pessoaJuridicaEstrangeiraInstance}" field="documentoEmpresaEstrangeira"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaEstrangeiraInstance?.equivalenteRazaoSocial}">
				<li class="fieldcontain">
					<span id="equivalenteRazaoSocial-label" class="property-label"><g:message code="pessoaJuridicaEstrangeira.equivalenteRazaoSocial.label" default="Equivalente Razao Social" /></span>
					
						<span class="property-value" aria-labelledby="equivalenteRazaoSocial-label"><g:fieldValue bean="${pessoaJuridicaEstrangeiraInstance}" field="equivalenteRazaoSocial"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaEstrangeiraInstance?.nomeFantasia}">
				<li class="fieldcontain">
					<span id="nomeFantasia-label" class="property-label"><g:message code="pessoaJuridicaEstrangeira.nomeFantasia.label" default="Nome Fantasia" /></span>
					
						<span class="property-value" aria-labelledby="nomeFantasia-label"><g:fieldValue bean="${pessoaJuridicaEstrangeiraInstance}" field="nomeFantasia"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaEstrangeiraInstance?.numeroDeFuncionarios}">
				<li class="fieldcontain">
					<span id="numeroDeFuncionarios-label" class="property-label"><g:message code="pessoaJuridicaEstrangeira.numeroDeFuncionarios.label" default="Numero De Funcionarios" /></span>
					
						<span class="property-value" aria-labelledby="numeroDeFuncionarios-label"><g:fieldValue bean="${pessoaJuridicaEstrangeiraInstance}" field="numeroDeFuncionarios"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:pessoaJuridicaEstrangeiraInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${pessoaJuridicaEstrangeiraInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
