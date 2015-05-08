
<%@ page import="formulariosgt.colaboradores.Colaborador" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'colaborador.label', default: 'Colaborador')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-colaborador" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-colaborador" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="cpf" title="${message(code: 'colaborador.cpf.label', default: 'Cpf')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'colaborador.email.label', default: 'Email')}" />
					
						<th><g:message code="colaborador.formacaoColaboradorId.label" default="Formacao Colaborador Id" /></th>
					
						<g:sortableColumn property="isAtivo" title="${message(code: 'colaborador.isAtivo.label', default: 'Is Ativo')}" />
					
						<g:sortableColumn property="linkCurriculumVitae" title="${message(code: 'colaborador.linkCurriculumVitae.label', default: 'Link Curriculum Vitae')}" />
					
						<g:sortableColumn property="nomeCompleto" title="${message(code: 'colaborador.nomeCompleto.label', default: 'Nome Completo')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${colaboradorInstanceList}" status="i" var="colaboradorInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${colaboradorInstance.id}">${fieldValue(bean: colaboradorInstance, field: "cpf")}</g:link></td>
					
						<td>${fieldValue(bean: colaboradorInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: colaboradorInstance, field: "formacaoColaboradorId")}</td>
					
						<td><g:formatBoolean boolean="${colaboradorInstance.isAtivo}" /></td>
					
						<td>${fieldValue(bean: colaboradorInstance, field: "linkCurriculumVitae")}</td>
					
						<td>${fieldValue(bean: colaboradorInstance, field: "nomeCompleto")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${colaboradorInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
