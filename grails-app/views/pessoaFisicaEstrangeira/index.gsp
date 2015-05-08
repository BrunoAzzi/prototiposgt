
<%@ page import="formulariosgt.clientes.PessoaFisicaEstrangeira" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pessoaFisicaEstrangeira.label', default: 'PessoaFisicaEstrangeira')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-pessoaFisicaEstrangeira" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-pessoaFisicaEstrangeira" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="pessoaFisicaEstrangeira.cliente.label" default="Cliente" /></th>
					
						<g:sortableColumn property="email" title="${message(code: 'pessoaFisicaEstrangeira.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="nomeCompleto" title="${message(code: 'pessoaFisicaEstrangeira.nomeCompleto.label', default: 'Nome Completo')}" />
					
						<g:sortableColumn property="numeroPassaporte" title="${message(code: 'pessoaFisicaEstrangeira.numeroPassaporte.label', default: 'Numero Passaporte')}" />
					
						<g:sortableColumn property="telefone" title="${message(code: 'pessoaFisicaEstrangeira.telefone.label', default: 'Telefone')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${pessoaFisicaEstrangeiraInstanceList}" status="i" var="pessoaFisicaEstrangeiraInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${pessoaFisicaEstrangeiraInstance.id}">${fieldValue(bean: pessoaFisicaEstrangeiraInstance, field: "cliente")}</g:link></td>
					
						<td>${fieldValue(bean: pessoaFisicaEstrangeiraInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: pessoaFisicaEstrangeiraInstance, field: "nomeCompleto")}</td>
					
						<td>${fieldValue(bean: pessoaFisicaEstrangeiraInstance, field: "numeroPassaporte")}</td>
					
						<td>${fieldValue(bean: pessoaFisicaEstrangeiraInstance, field: "telefone")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${pessoaFisicaEstrangeiraInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
