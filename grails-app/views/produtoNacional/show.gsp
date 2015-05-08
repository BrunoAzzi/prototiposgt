
<%@ page import="formulariosgt.produto.ProdutoNacional" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'produtoNacional.label', default: 'ProdutoNacional')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-produtoNacional" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-produtoNacional" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list produtoNacional">
			
				<g:if test="${produtoNacionalInstance?.descricao}">
				<li class="fieldcontain">
					<span id="descricao-label" class="property-label"><g:message code="produtoNacional.descricao.label" default="Descricao" /></span>
					
						<span class="property-value" aria-labelledby="descricao-label"><g:fieldValue bean="${produtoNacionalInstance}" field="descricao"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoNacionalInstance?.produtoCategoriaId}">
				<li class="fieldcontain">
					<span id="produtoCategoriaId-label" class="property-label"><g:message code="produtoNacional.produtoCategoriaId.label" default="Produto Categoria Id" /></span>
					
						<span class="property-value" aria-labelledby="produtoCategoriaId-label"><g:link controller="produtoCategoria" action="show" id="${produtoNacionalInstance?.produtoCategoriaId?.id}">${produtoNacionalInstance?.produtoCategoriaId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${produtoNacionalInstance?.produtosRegionais}">
				<li class="fieldcontain">
					<span id="produtosRegionais-label" class="property-label"><g:message code="produtoNacional.produtosRegionais.label" default="Produtos Regionais" /></span>
					
						<g:each in="${produtoNacionalInstance.produtosRegionais}" var="p">
						<span class="property-value" aria-labelledby="produtosRegionais-label"><g:link controller="produtoRegional" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:produtoNacionalInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${produtoNacionalInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
