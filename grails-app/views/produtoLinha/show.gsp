
<%@ page import="formulariosgt.produto.ProdutoLinha" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'produtoLinha.label', default: 'ProdutoLinha')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-produtoLinha" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-produtoLinha" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list produtoLinha">
			
				<g:if test="${produtoLinhaInstance?.descricao}">
				<li class="fieldcontain">
					<span id="descricao-label" class="property-label"><g:message code="produtoLinha.descricao.label" default="Descricao" /></span>
					
						<span class="property-value" aria-labelledby="descricao-label"><g:fieldValue bean="${produtoLinhaInstance}" field="descricao"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoLinhaInstance?.numeroCentroDeResponsabilidade}">
				<li class="fieldcontain">
					<span id="numeroCentroDeResponsabilidade-label" class="property-label"><g:message code="produtoLinha.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" /></span>
					
						<span class="property-value" aria-labelledby="numeroCentroDeResponsabilidade-label"><g:fieldValue bean="${produtoLinhaInstance}" field="numeroCentroDeResponsabilidade"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoLinhaInstance?.produtosCategorias}">
				<li class="fieldcontain">
					<span id="produtosCategorias-label" class="property-label"><g:message code="produtoLinha.produtosCategorias.label" default="Produtos Categorias" /></span>
					
						<g:each in="${produtoLinhaInstance.produtosCategorias}" var="p">
						<span class="property-value" aria-labelledby="produtosCategorias-label"><g:link controller="produtoCategoria" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:produtoLinhaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${produtoLinhaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
