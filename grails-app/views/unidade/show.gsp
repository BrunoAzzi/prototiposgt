
<%@ page import="formulariosgt.unidades.Unidade" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'unidade.label', default: 'Unidade')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-unidade" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-unidade" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list unidade">
			
				<g:if test="${unidadeInstance?.descricao}">
				<li class="fieldcontain">
					<span id="descricao-label" class="property-label"><g:message code="unidade.descricao.label" default="Descricao" /></span>
					
						<span class="property-value" aria-labelledby="descricao-label"><g:fieldValue bean="${unidadeInstance}" field="descricao"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${unidadeInstance?.municipio}">
				<li class="fieldcontain">
					<span id="municipio-label" class="property-label"><g:message code="unidade.municipio.label" default="Municipio" /></span>
					
						<span class="property-value" aria-labelledby="municipio-label"><g:link controller="municipio" action="show" id="${unidadeInstance?.municipio?.id}">${unidadeInstance?.municipio?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${unidadeInstance?.numeroCentroDeResponsabilidade}">
				<li class="fieldcontain">
					<span id="numeroCentroDeResponsabilidade-label" class="property-label"><g:message code="unidade.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" /></span>
					
						<span class="property-value" aria-labelledby="numeroCentroDeResponsabilidade-label"><g:fieldValue bean="${unidadeInstance}" field="numeroCentroDeResponsabilidade"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${unidadeInstance?.produtosRegionais}">
				<li class="fieldcontain">
					<span id="produtosRegionais-label" class="property-label"><g:message code="unidade.produtosRegionais.label" default="Produtos Regionais" /></span>
					
						<g:each in="${unidadeInstance.produtosRegionais}" var="p">
						<span class="property-value" aria-labelledby="produtosRegionais-label"><g:link controller="produtoRegional" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${unidadeInstance?.tipoUnidade}">
				<li class="fieldcontain">
					<span id="tipoUnidade-label" class="property-label"><g:message code="unidade.tipoUnidade.label" default="Tipo Unidade" /></span>
					
						<span class="property-value" aria-labelledby="tipoUnidade-label"><g:link controller="tipoUnidade" action="show" id="${unidadeInstance?.tipoUnidade?.id}">${unidadeInstance?.tipoUnidade?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${unidadeInstance?.usuarios}">
				<li class="fieldcontain">
					<span id="usuarios-label" class="property-label"><g:message code="unidade.usuarios.label" default="Usuarios" /></span>
					
						<g:each in="${unidadeInstance.usuarios}" var="u">
						<span class="property-value" aria-labelledby="usuarios-label"><g:link controller="usuario" action="show" id="${u.id}">${u?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:unidadeInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${unidadeInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
