
<%@ page import="formulariosgt.produto.ProdutoCategoria" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'produtoCategoria.label', default: 'ProdutoCategoria')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-produtoCategoria" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-produtoCategoria" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="descricao" title="${message(code: 'produtoCategoria.descricao.label', default: 'Descricao')}" />
					
						<g:sortableColumn property="numeroCentroDeResponsabilidade" title="${message(code: 'produtoCategoria.numeroCentroDeResponsabilidade.label', default: 'Numero Centro De Responsabilidade')}" />
					
						<th><g:message code="produtoCategoria.produtoLinhaId.label" default="Produto Linha Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${produtoCategoriaInstanceList}" status="i" var="produtoCategoriaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${produtoCategoriaInstance.id}">${fieldValue(bean: produtoCategoriaInstance, field: "descricao")}</g:link></td>
					
						<td>${fieldValue(bean: produtoCategoriaInstance, field: "numeroCentroDeResponsabilidade")}</td>
					
						<td>${fieldValue(bean: produtoCategoriaInstance, field: "produtoLinhaId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${produtoCategoriaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
