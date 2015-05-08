
<%@ page import="formulariosgt.apropriacao.ProducaoApropriada" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'producaoApropriada.label', default: 'ProducaoApropriada')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-producaoApropriada" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-producaoApropriada" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="producaoApropriada.apropriador.label" default="Apropriador" /></th>
					
						<th><g:message code="producaoApropriada.atendimento.label" default="Atendimento" /></th>
					
						<g:sortableColumn property="dataDeApropriacao" title="${message(code: 'producaoApropriada.dataDeApropriacao.label', default: 'Data De Apropriacao')}" />
					
						<g:sortableColumn property="quantidadeApropriada" title="${message(code: 'producaoApropriada.quantidadeApropriada.label', default: 'Quantidade Apropriada')}" />
					
						<th><g:message code="producaoApropriada.receitaApropriada.label" default="Receita Apropriada" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${producaoApropriadaInstanceList}" status="i" var="producaoApropriadaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${producaoApropriadaInstance.id}">${fieldValue(bean: producaoApropriadaInstance, field: "apropriador")}</g:link></td>
					
						<td>${fieldValue(bean: producaoApropriadaInstance, field: "atendimento")}</td>
					
						<td><g:formatDate date="${producaoApropriadaInstance.dataDeApropriacao}" /></td>
					
						<td>${fieldValue(bean: producaoApropriadaInstance, field: "quantidadeApropriada")}</td>
					
						<td>${fieldValue(bean: producaoApropriadaInstance, field: "receitaApropriada")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${producaoApropriadaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
