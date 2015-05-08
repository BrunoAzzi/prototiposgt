
<%@ page import="formulariosgt.atendimento.Atendimento" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'atendimento.label', default: 'Atendimento')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-atendimento" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-atendimento" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list atendimento">
			
				<g:if test="${atendimentoInstance?.atendente}">
				<li class="fieldcontain">
					<span id="atendente-label" class="property-label"><g:message code="atendimento.atendente.label" default="Atendente" /></span>
					
						<span class="property-value" aria-labelledby="atendente-label"><g:link controller="usuario" action="show" id="${atendimentoInstance?.atendente?.id}">${atendimentoInstance?.atendente?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.cliente}">
				<li class="fieldcontain">
					<span id="cliente-label" class="property-label"><g:message code="atendimento.cliente.label" default="Cliente" /></span>
					
						<span class="property-value" aria-labelledby="cliente-label"><g:link controller="cliente" action="show" id="${atendimentoInstance?.cliente?.id}">${atendimentoInstance?.cliente?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.dataEmissao}">
				<li class="fieldcontain">
					<span id="dataEmissao-label" class="property-label"><g:message code="atendimento.dataEmissao.label" default="Data Emissao" /></span>
					
						<span class="property-value" aria-labelledby="dataEmissao-label"><g:formatDate date="${atendimentoInstance?.dataEmissao}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.descricao}">
				<li class="fieldcontain">
					<span id="descricao-label" class="property-label"><g:message code="atendimento.descricao.label" default="Descricao" /></span>
					
						<span class="property-value" aria-labelledby="descricao-label"><g:fieldValue bean="${atendimentoInstance}" field="descricao"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.numeroDeProducaoEstimada}">
				<li class="fieldcontain">
					<span id="numeroDeProducaoEstimada-label" class="property-label"><g:message code="atendimento.numeroDeProducaoEstimada.label" default="Numero De Producao Estimada" /></span>
					
						<span class="property-value" aria-labelledby="numeroDeProducaoEstimada-label"><g:fieldValue bean="${atendimentoInstance}" field="numeroDeProducaoEstimada"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.numeroDeReceitaEstimada}">
				<li class="fieldcontain">
					<span id="numeroDeReceitaEstimada-label" class="property-label"><g:message code="atendimento.numeroDeReceitaEstimada.label" default="Numero De Receita Estimada" /></span>
					
						<span class="property-value" aria-labelledby="numeroDeReceitaEstimada-label"><g:fieldValue bean="${atendimentoInstance}" field="numeroDeReceitaEstimada"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.prodicoesApropriadas}">
				<li class="fieldcontain">
					<span id="prodicoesApropriadas-label" class="property-label"><g:message code="atendimento.prodicoesApropriadas.label" default="Prodicoes Apropriadas" /></span>
					
						<g:each in="${atendimentoInstance.prodicoesApropriadas}" var="p">
						<span class="property-value" aria-labelledby="prodicoesApropriadas-label"><g:link controller="producaoApropriada" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.produtoRegional}">
				<li class="fieldcontain">
					<span id="produtoRegional-label" class="property-label"><g:message code="atendimento.produtoRegional.label" default="Produto Regional" /></span>
					
						<span class="property-value" aria-labelledby="produtoRegional-label"><g:link controller="produtoRegional" action="show" id="${atendimentoInstance?.produtoRegional?.id}">${atendimentoInstance?.produtoRegional?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.proposta}">
				<li class="fieldcontain">
					<span id="proposta-label" class="property-label"><g:message code="atendimento.proposta.label" default="Proposta" /></span>
					
						<span class="property-value" aria-labelledby="proposta-label"><g:link controller="proposta" action="show" id="${atendimentoInstance?.proposta?.id}">${atendimentoInstance?.proposta?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="atendimento.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:link controller="atendimentoStatus" action="show" id="${atendimentoInstance?.status?.id}">${atendimentoInstance?.status?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${atendimentoInstance?.versao}">
				<li class="fieldcontain">
					<span id="versao-label" class="property-label"><g:message code="atendimento.versao.label" default="Versao" /></span>
					
						<span class="property-value" aria-labelledby="versao-label"><g:fieldValue bean="${atendimentoInstance}" field="versao"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:atendimentoInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${atendimentoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
