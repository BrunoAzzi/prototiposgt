
<%@ page import="formulariosgt.clientes.PessoaJuridica" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pessoaJuridica.label', default: 'PessoaJuridica')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-pessoaJuridica" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-pessoaJuridica" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list pessoaJuridica">
			
				<g:if test="${pessoaJuridicaInstance?.cliente}">
				<li class="fieldcontain">
					<span id="cliente-label" class="property-label"><g:message code="pessoaJuridica.cliente.label" default="Cliente" /></span>
					
						<span class="property-value" aria-labelledby="cliente-label"><g:link controller="cliente" action="show" id="${pessoaJuridicaInstance?.cliente?.id}">${pessoaJuridicaInstance?.cliente?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaInstance?.cnae}">
				<li class="fieldcontain">
					<span id="cnae-label" class="property-label"><g:message code="pessoaJuridica.cnae.label" default="Cnae" /></span>
					
						<span class="property-value" aria-labelledby="cnae-label"><g:fieldValue bean="${pessoaJuridicaInstance}" field="cnae"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaInstance?.cnpj}">
				<li class="fieldcontain">
					<span id="cnpj-label" class="property-label"><g:message code="pessoaJuridica.cnpj.label" default="Cnpj" /></span>
					
						<span class="property-value" aria-labelledby="cnpj-label"><g:fieldValue bean="${pessoaJuridicaInstance}" field="cnpj"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaInstance?.enderecoCobranca}">
				<li class="fieldcontain">
					<span id="enderecoCobranca-label" class="property-label"><g:message code="pessoaJuridica.enderecoCobranca.label" default="Endereco Cobranca" /></span>
					
						<span class="property-value" aria-labelledby="enderecoCobranca-label"><g:fieldValue bean="${pessoaJuridicaInstance}" field="enderecoCobranca"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaInstance?.enderecoFaturamento}">
				<li class="fieldcontain">
					<span id="enderecoFaturamento-label" class="property-label"><g:message code="pessoaJuridica.enderecoFaturamento.label" default="Endereco Faturamento" /></span>
					
						<span class="property-value" aria-labelledby="enderecoFaturamento-label"><g:fieldValue bean="${pessoaJuridicaInstance}" field="enderecoFaturamento"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaInstance?.inscricaoEstadual}">
				<li class="fieldcontain">
					<span id="inscricaoEstadual-label" class="property-label"><g:message code="pessoaJuridica.inscricaoEstadual.label" default="Inscricao Estadual" /></span>
					
						<span class="property-value" aria-labelledby="inscricaoEstadual-label"><g:fieldValue bean="${pessoaJuridicaInstance}" field="inscricaoEstadual"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaInstance?.nomeFantasia}">
				<li class="fieldcontain">
					<span id="nomeFantasia-label" class="property-label"><g:message code="pessoaJuridica.nomeFantasia.label" default="Nome Fantasia" /></span>
					
						<span class="property-value" aria-labelledby="nomeFantasia-label"><g:fieldValue bean="${pessoaJuridicaInstance}" field="nomeFantasia"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaInstance?.numeroDeFuncionarios}">
				<li class="fieldcontain">
					<span id="numeroDeFuncionarios-label" class="property-label"><g:message code="pessoaJuridica.numeroDeFuncionarios.label" default="Numero De Funcionarios" /></span>
					
						<span class="property-value" aria-labelledby="numeroDeFuncionarios-label"><g:fieldValue bean="${pessoaJuridicaInstance}" field="numeroDeFuncionarios"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pessoaJuridicaInstance?.razaoSocial}">
				<li class="fieldcontain">
					<span id="razaoSocial-label" class="property-label"><g:message code="pessoaJuridica.razaoSocial.label" default="Razao Social" /></span>
					
						<span class="property-value" aria-labelledby="razaoSocial-label"><g:fieldValue bean="${pessoaJuridicaInstance}" field="razaoSocial"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:pessoaJuridicaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${pessoaJuridicaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
