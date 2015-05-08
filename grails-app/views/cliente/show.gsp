
<%@ page import="formulariosgt.clientes.Cliente" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'cliente.label', default: 'Cliente')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-cliente" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-cliente" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list cliente">
			
				<g:if test="${clienteInstance?.atendimentos}">
				<li class="fieldcontain">
					<span id="atendimentos-label" class="property-label"><g:message code="cliente.atendimentos.label" default="Atendimentos" /></span>
					
						<g:each in="${clienteInstance.atendimentos}" var="a">
						<span class="property-value" aria-labelledby="atendimentos-label"><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${clienteInstance?.contatos}">
				<li class="fieldcontain">
					<span id="contatos-label" class="property-label"><g:message code="cliente.contatos.label" default="Contatos" /></span>
					
						<g:each in="${clienteInstance.contatos}" var="c">
						<span class="property-value" aria-labelledby="contatos-label"><g:link controller="contato" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${clienteInstance?.enderecos}">
				<li class="fieldcontain">
					<span id="enderecos-label" class="property-label"><g:message code="cliente.enderecos.label" default="Enderecos" /></span>
					
						<g:each in="${clienteInstance.enderecos}" var="e">
						<span class="property-value" aria-labelledby="enderecos-label"><g:link controller="endereco" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${clienteInstance?.isAtivo}">
				<li class="fieldcontain">
					<span id="isAtivo-label" class="property-label"><g:message code="cliente.isAtivo.label" default="Is Ativo" /></span>
					
						<span class="property-value" aria-labelledby="isAtivo-label"><g:formatBoolean boolean="${clienteInstance?.isAtivo}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${clienteInstance?.pessoasFisicas}">
				<li class="fieldcontain">
					<span id="pessoasFisicas-label" class="property-label"><g:message code="cliente.pessoasFisicas.label" default="Pessoas Fisicas" /></span>
					
						<span class="property-value" aria-labelledby="pessoasFisicas-label"><g:link controller="pessoaFisica" action="show" id="${clienteInstance?.pessoasFisicas?.id}">${clienteInstance?.pessoasFisicas?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${clienteInstance?.pessoasFisicasEstrangeiras}">
				<li class="fieldcontain">
					<span id="pessoasFisicasEstrangeiras-label" class="property-label"><g:message code="cliente.pessoasFisicasEstrangeiras.label" default="Pessoas Fisicas Estrangeiras" /></span>
					
						<span class="property-value" aria-labelledby="pessoasFisicasEstrangeiras-label"><g:link controller="pessoaFisicaEstrangeira" action="show" id="${clienteInstance?.pessoasFisicasEstrangeiras?.id}">${clienteInstance?.pessoasFisicasEstrangeiras?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${clienteInstance?.pessoasJuridicas}">
				<li class="fieldcontain">
					<span id="pessoasJuridicas-label" class="property-label"><g:message code="cliente.pessoasJuridicas.label" default="Pessoas Juridicas" /></span>
					
						<span class="property-value" aria-labelledby="pessoasJuridicas-label"><g:link controller="pessoaJuridica" action="show" id="${clienteInstance?.pessoasJuridicas?.id}">${clienteInstance?.pessoasJuridicas?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${clienteInstance?.pessoasJuridicasEstrangeiras}">
				<li class="fieldcontain">
					<span id="pessoasJuridicasEstrangeiras-label" class="property-label"><g:message code="cliente.pessoasJuridicasEstrangeiras.label" default="Pessoas Juridicas Estrangeiras" /></span>
					
						<span class="property-value" aria-labelledby="pessoasJuridicasEstrangeiras-label"><g:link controller="pessoaJuridicaEstrangeira" action="show" id="${clienteInstance?.pessoasJuridicasEstrangeiras?.id}">${clienteInstance?.pessoasJuridicasEstrangeiras?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${clienteInstance?.tipocliente}">
				<li class="fieldcontain">
					<span id="tipocliente-label" class="property-label"><g:message code="cliente.tipocliente.label" default="Tipocliente" /></span>
					
						<span class="property-value" aria-labelledby="tipocliente-label"><g:link controller="tipoCliente" action="show" id="${clienteInstance?.tipocliente?.id}">${clienteInstance?.tipocliente?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${clienteInstance?.ultimaAtualizacao}">
				<li class="fieldcontain">
					<span id="ultimaAtualizacao-label" class="property-label"><g:message code="cliente.ultimaAtualizacao.label" default="Ultima Atualizacao" /></span>
					
						<span class="property-value" aria-labelledby="ultimaAtualizacao-label"><g:formatDate date="${clienteInstance?.ultimaAtualizacao}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:clienteInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${clienteInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
