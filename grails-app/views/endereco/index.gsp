
<%@ page import="formulariosgt.clientes.Endereco" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'endereco.label', default: 'Endereco')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-endereco" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-endereco" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="bairro" title="${message(code: 'endereco.bairro.label', default: 'Bairro')}" />
					
						<g:sortableColumn property="cep" title="${message(code: 'endereco.cep.label', default: 'Cep')}" />
					
						<th><g:message code="endereco.cliente.label" default="Cliente" /></th>
					
						<g:sortableColumn property="localidade" title="${message(code: 'endereco.localidade.label', default: 'Localidade')}" />
					
						<g:sortableColumn property="logradouro" title="${message(code: 'endereco.logradouro.label', default: 'Logradouro')}" />
					
						<g:sortableColumn property="uf" title="${message(code: 'endereco.uf.label', default: 'Uf')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${enderecoInstanceList}" status="i" var="enderecoInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${enderecoInstance.id}">${fieldValue(bean: enderecoInstance, field: "bairro")}</g:link></td>
					
						<td>${fieldValue(bean: enderecoInstance, field: "cep")}</td>
					
						<td>${fieldValue(bean: enderecoInstance, field: "cliente")}</td>
					
						<td>${fieldValue(bean: enderecoInstance, field: "localidade")}</td>
					
						<td>${fieldValue(bean: enderecoInstance, field: "logradouro")}</td>
					
						<td>${fieldValue(bean: enderecoInstance, field: "uf")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${enderecoInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
