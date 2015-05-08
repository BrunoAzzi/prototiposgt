
<%@ page import="formulariosgt.usuarios.Usuario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'usuario.label', default: 'Usuario')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-usuario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-usuario" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="usuario.colaborador.label" default="Colaborador" /></th>
					
						<g:sortableColumn property="isAtivo" title="${message(code: 'usuario.isAtivo.label', default: 'Is Ativo')}" />
					
						<g:sortableColumn property="loginEmail" title="${message(code: 'usuario.loginEmail.label', default: 'Login Email')}" />
					
						<g:sortableColumn property="senha" title="${message(code: 'usuario.senha.label', default: 'Senha')}" />
					
						<th><g:message code="usuario.unidadeId.label" default="Unidade Id" /></th>
					
						<g:sortableColumn property="username" title="${message(code: 'usuario.username.label', default: 'Username')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${usuarioInstanceList}" status="i" var="usuarioInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${usuarioInstance.id}">${fieldValue(bean: usuarioInstance, field: "colaborador")}</g:link></td>
					
						<td><g:formatBoolean boolean="${usuarioInstance.isAtivo}" /></td>
					
						<td>${fieldValue(bean: usuarioInstance, field: "loginEmail")}</td>
					
						<td>${fieldValue(bean: usuarioInstance, field: "senha")}</td>
					
						<td>${fieldValue(bean: usuarioInstance, field: "unidadeId")}</td>
					
						<td>${fieldValue(bean: usuarioInstance, field: "username")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${usuarioInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
