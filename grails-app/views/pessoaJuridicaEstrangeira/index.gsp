
<%@ page import="formulariosgt.clientes.PessoaJuridicaEstrangeira" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pessoaJuridicaEstrangeira.label', default: 'PessoaJuridicaEstrangeira')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-pessoaJuridicaEstrangeira" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-pessoaJuridicaEstrangeira" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="pessoaJuridicaEstrangeira.cliente.label" default="Cliente" /></th>
					
						<g:sortableColumn property="documentoEmpresaEstrangeira" title="${message(code: 'pessoaJuridicaEstrangeira.documentoEmpresaEstrangeira.label', default: 'Documento Empresa Estrangeira')}" />
					
						<g:sortableColumn property="equivalenteRazaoSocial" title="${message(code: 'pessoaJuridicaEstrangeira.equivalenteRazaoSocial.label', default: 'Equivalente Razao Social')}" />
					
						<g:sortableColumn property="nomeFantasia" title="${message(code: 'pessoaJuridicaEstrangeira.nomeFantasia.label', default: 'Nome Fantasia')}" />
					
						<g:sortableColumn property="numeroDeFuncionarios" title="${message(code: 'pessoaJuridicaEstrangeira.numeroDeFuncionarios.label', default: 'Numero De Funcionarios')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${pessoaJuridicaEstrangeiraInstanceList}" status="i" var="pessoaJuridicaEstrangeiraInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${pessoaJuridicaEstrangeiraInstance.id}">${fieldValue(bean: pessoaJuridicaEstrangeiraInstance, field: "cliente")}</g:link></td>
					
						<td>${fieldValue(bean: pessoaJuridicaEstrangeiraInstance, field: "documentoEmpresaEstrangeira")}</td>
					
						<td>${fieldValue(bean: pessoaJuridicaEstrangeiraInstance, field: "equivalenteRazaoSocial")}</td>
					
						<td>${fieldValue(bean: pessoaJuridicaEstrangeiraInstance, field: "nomeFantasia")}</td>
					
						<td>${fieldValue(bean: pessoaJuridicaEstrangeiraInstance, field: "numeroDeFuncionarios")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${pessoaJuridicaEstrangeiraInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
