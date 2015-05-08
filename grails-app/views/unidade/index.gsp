
<%@ page import="formulariosgt.unidades.Unidade" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'unidade.label', default: 'Unidade')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-unidade" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-unidade" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="descricao" title="${message(code: 'unidade.descricao.label', default: 'Descricao')}" />
					
						<th><g:message code="unidade.municipio.label" default="Municipio" /></th>
					
						<g:sortableColumn property="numeroCentroDeResponsabilidade" title="${message(code: 'unidade.numeroCentroDeResponsabilidade.label', default: 'Numero Centro De Responsabilidade')}" />
					
						<th><g:message code="unidade.tipoUnidade.label" default="Tipo Unidade" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${unidadeInstanceList}" status="i" var="unidadeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${unidadeInstance.id}">${fieldValue(bean: unidadeInstance, field: "descricao")}</g:link></td>
					
						<td>${fieldValue(bean: unidadeInstance, field: "municipio")}</td>
					
						<td>${fieldValue(bean: unidadeInstance, field: "numeroCentroDeResponsabilidade")}</td>
					
						<td>${fieldValue(bean: unidadeInstance, field: "tipoUnidade")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${unidadeInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
