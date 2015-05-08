
<%@ page import="formulariosgt.produto.ProdutoRegional" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'produtoRegional.label', default: 'ProdutoRegional')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-produtoRegional" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-produtoRegional" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list produtoRegional">
			
				<g:if test="${produtoRegionalInstance?.atendimentos}">
				<li class="fieldcontain">
					<span id="atendimentos-label" class="property-label"><g:message code="produtoRegional.atendimentos.label" default="Atendimentos" /></span>
					
						<g:each in="${produtoRegionalInstance.atendimentos}" var="a">
						<span class="property-value" aria-labelledby="atendimentos-label"><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${produtoRegionalInstance?.colaboradoresAtendentes}">
				<li class="fieldcontain">
					<span id="colaboradoresAtendentes-label" class="property-label"><g:message code="produtoRegional.colaboradoresAtendentes.label" default="Colaboradores Atendentes" /></span>
					
						<g:each in="${produtoRegionalInstance.colaboradoresAtendentes}" var="c">
						<span class="property-value" aria-labelledby="colaboradoresAtendentes-label"><g:link controller="colaborador" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${produtoRegionalInstance?.isAtivo}">
				<li class="fieldcontain">
					<span id="isAtivo-label" class="property-label"><g:message code="produtoRegional.isAtivo.label" default="Is Ativo" /></span>
					
						<span class="property-value" aria-labelledby="isAtivo-label"><g:formatBoolean boolean="${produtoRegionalInstance?.isAtivo}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoRegionalInstance?.nome}">
				<li class="fieldcontain">
					<span id="nome-label" class="property-label"><g:message code="produtoRegional.nome.label" default="Nome" /></span>
					
						<span class="property-value" aria-labelledby="nome-label"><g:fieldValue bean="${produtoRegionalInstance}" field="nome"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoRegionalInstance?.numeroCentroDeResponsabilidade}">
				<li class="fieldcontain">
					<span id="numeroCentroDeResponsabilidade-label" class="property-label"><g:message code="produtoRegional.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" /></span>
					
						<span class="property-value" aria-labelledby="numeroCentroDeResponsabilidade-label"><g:fieldValue bean="${produtoRegionalInstance}" field="numeroCentroDeResponsabilidade"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoRegionalInstance?.numeroCentroDeResponsabilidadeLivre}">
				<li class="fieldcontain">
					<span id="numeroCentroDeResponsabilidadeLivre-label" class="property-label"><g:message code="produtoRegional.numeroCentroDeResponsabilidadeLivre.label" default="Numero Centro De Responsabilidade Livre" /></span>
					
						<span class="property-value" aria-labelledby="numeroCentroDeResponsabilidadeLivre-label"><g:fieldValue bean="${produtoRegionalInstance}" field="numeroCentroDeResponsabilidadeLivre"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoRegionalInstance?.produtoNacionalId}">
				<li class="fieldcontain">
					<span id="produtoNacionalId-label" class="property-label"><g:message code="produtoRegional.produtoNacionalId.label" default="Produto Nacional Id" /></span>
					
						<span class="property-value" aria-labelledby="produtoNacionalId-label"><g:link controller="produtoNacional" action="show" id="${produtoRegionalInstance?.produtoNacionalId?.id}">${produtoRegionalInstance?.produtoNacionalId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoRegionalInstance?.unidade}">
				<li class="fieldcontain">
					<span id="unidade-label" class="property-label"><g:message code="produtoRegional.unidade.label" default="Unidade" /></span>
					
						<span class="property-value" aria-labelledby="unidade-label"><g:link controller="unidade" action="show" id="${produtoRegionalInstance?.unidade?.id}">${produtoRegionalInstance?.unidade?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:produtoRegionalInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${produtoRegionalInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
