
<%@ page import="formulariosgt.produto.ProdutoCategoria" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'produtoCategoria.label', default: 'ProdutoCategoria')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-produtoCategoria" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-produtoCategoria" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list produtoCategoria">
			
				<g:if test="${produtoCategoriaInstance?.descricao}">
				<li class="fieldcontain">
					<span id="descricao-label" class="property-label"><g:message code="produtoCategoria.descricao.label" default="Descricao" /></span>
					
						<span class="property-value" aria-labelledby="descricao-label"><g:fieldValue bean="${produtoCategoriaInstance}" field="descricao"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoCategoriaInstance?.numeroCentroDeResponsabilidade}">
				<li class="fieldcontain">
					<span id="numeroCentroDeResponsabilidade-label" class="property-label"><g:message code="produtoCategoria.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" /></span>
					
						<span class="property-value" aria-labelledby="numeroCentroDeResponsabilidade-label"><g:fieldValue bean="${produtoCategoriaInstance}" field="numeroCentroDeResponsabilidade"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoCategoriaInstance?.produtoLinhaId}">
				<li class="fieldcontain">
					<span id="produtoLinhaId-label" class="property-label"><g:message code="produtoCategoria.produtoLinhaId.label" default="Produto Linha Id" /></span>
					
						<span class="property-value" aria-labelledby="produtoLinhaId-label"><g:link controller="produtoLinha" action="show" id="${produtoCategoriaInstance?.produtoLinhaId?.id}">${produtoCategoriaInstance?.produtoLinhaId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoCategoriaInstance?.produtosNacionais}">
				<li class="fieldcontain">
					<span id="produtosNacionais-label" class="property-label"><g:message code="produtoCategoria.produtosNacionais.label" default="Produtos Nacionais" /></span>
					
						<g:each in="${produtoCategoriaInstance.produtosNacionais}" var="p">
						<span class="property-value" aria-labelledby="produtosNacionais-label"><g:link controller="produtoNacional" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:produtoCategoriaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${produtoCategoriaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
