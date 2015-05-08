
<%@ page import="formulariosgt.clientes.PessoaJuridica" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pessoaJuridica.label', default: 'PessoaJuridica')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-pessoaJuridica" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-pessoaJuridica" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="pessoaJuridica.cliente.label" default="Cliente" /></th>
					
						<g:sortableColumn property="cnae" title="${message(code: 'pessoaJuridica.cnae.label', default: 'Cnae')}" />
					
						<g:sortableColumn property="cnpj" title="${message(code: 'pessoaJuridica.cnpj.label', default: 'Cnpj')}" />
					
						<g:sortableColumn property="enderecoCobranca" title="${message(code: 'pessoaJuridica.enderecoCobranca.label', default: 'Endereco Cobranca')}" />
					
						<g:sortableColumn property="enderecoFaturamento" title="${message(code: 'pessoaJuridica.enderecoFaturamento.label', default: 'Endereco Faturamento')}" />
					
						<g:sortableColumn property="inscricaoEstadual" title="${message(code: 'pessoaJuridica.inscricaoEstadual.label', default: 'Inscricao Estadual')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${pessoaJuridicaInstanceList}" status="i" var="pessoaJuridicaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${pessoaJuridicaInstance.id}">${fieldValue(bean: pessoaJuridicaInstance, field: "cliente")}</g:link></td>
					
						<td>${fieldValue(bean: pessoaJuridicaInstance, field: "cnae")}</td>
					
						<td>${fieldValue(bean: pessoaJuridicaInstance, field: "cnpj")}</td>
					
						<td>${fieldValue(bean: pessoaJuridicaInstance, field: "enderecoCobranca")}</td>
					
						<td>${fieldValue(bean: pessoaJuridicaInstance, field: "enderecoFaturamento")}</td>
					
						<td>${fieldValue(bean: pessoaJuridicaInstance, field: "inscricaoEstadual")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${pessoaJuridicaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
