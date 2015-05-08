
<%@ page import="formulariosgt.produto.ProdutoRegional" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'produtoRegional.label', default: 'ProdutoRegional')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-produtoRegional" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-produtoRegional" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="isAtivo" title="${message(code: 'produtoRegional.isAtivo.label', default: 'Is Ativo')}" />
					
						<g:sortableColumn property="nome" title="${message(code: 'produtoRegional.nome.label', default: 'Nome')}" />
					
						<g:sortableColumn property="numeroCentroDeResponsabilidade" title="${message(code: 'produtoRegional.numeroCentroDeResponsabilidade.label', default: 'Numero Centro De Responsabilidade')}" />
					
						<g:sortableColumn property="numeroCentroDeResponsabilidadeLivre" title="${message(code: 'produtoRegional.numeroCentroDeResponsabilidadeLivre.label', default: 'Numero Centro De Responsabilidade Livre')}" />
					
						<th><g:message code="produtoRegional.produtoNacionalId.label" default="Produto Nacional Id" /></th>
					
						<th><g:message code="produtoRegional.unidade.label" default="Unidade" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${produtoRegionalInstanceList}" status="i" var="produtoRegionalInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${produtoRegionalInstance.id}">${fieldValue(bean: produtoRegionalInstance, field: "isAtivo")}</g:link></td>
					
						<td>${fieldValue(bean: produtoRegionalInstance, field: "nome")}</td>
					
						<td>${fieldValue(bean: produtoRegionalInstance, field: "numeroCentroDeResponsabilidade")}</td>
					
						<td>${fieldValue(bean: produtoRegionalInstance, field: "numeroCentroDeResponsabilidadeLivre")}</td>
					
						<td>${fieldValue(bean: produtoRegionalInstance, field: "produtoNacionalId")}</td>
					
						<td>${fieldValue(bean: produtoRegionalInstance, field: "unidade")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${produtoRegionalInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
