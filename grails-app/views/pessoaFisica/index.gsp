
<%@ page import="formulariosgt.clientes.PessoaFisica" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pessoaFisica.label', default: 'PessoaFisica')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-pessoaFisica" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-pessoaFisica" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="pessoaFisica.cliente.label" default="Cliente" /></th>
					
						<g:sortableColumn property="cpf" title="${message(code: 'pessoaFisica.cpf.label', default: 'Cpf')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'pessoaFisica.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="nomeCompleto" title="${message(code: 'pessoaFisica.nomeCompleto.label', default: 'Nome Completo')}" />
					
						<g:sortableColumn property="telefone" title="${message(code: 'pessoaFisica.telefone.label', default: 'Telefone')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${pessoaFisicaInstanceList}" status="i" var="pessoaFisicaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${pessoaFisicaInstance.id}">${fieldValue(bean: pessoaFisicaInstance, field: "cliente")}</g:link></td>
					
						<td>${fieldValue(bean: pessoaFisicaInstance, field: "cpf")}</td>
					
						<td>${fieldValue(bean: pessoaFisicaInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: pessoaFisicaInstance, field: "nomeCompleto")}</td>
					
						<td>${fieldValue(bean: pessoaFisicaInstance, field: "telefone")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${pessoaFisicaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
