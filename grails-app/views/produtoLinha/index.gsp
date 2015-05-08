
<%@ page import="formulariosgt.produto.ProdutoLinha" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'produtoLinha.label', default: 'ProdutoLinha')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-produtoLinha" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-produtoLinha" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="descricao" title="${message(code: 'produtoLinha.descricao.label', default: 'Descricao')}" />
					
						<g:sortableColumn property="numeroCentroDeResponsabilidade" title="${message(code: 'produtoLinha.numeroCentroDeResponsabilidade.label', default: 'Numero Centro De Responsabilidade')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${produtoLinhaInstanceList}" status="i" var="produtoLinhaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${produtoLinhaInstance.id}">${fieldValue(bean: produtoLinhaInstance, field: "descricao")}</g:link></td>
					
						<td>${fieldValue(bean: produtoLinhaInstance, field: "numeroCentroDeResponsabilidade")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${produtoLinhaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
