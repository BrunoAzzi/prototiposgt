
<%@ page import="formulariosgt.apropriacao.ReceitaApropriada" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'receitaApropriada.label', default: 'ReceitaApropriada')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-receitaApropriada" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-receitaApropriada" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="receitaApropriada.apropriador.label" default="Apropriador" /></th>
					
						<g:sortableColumn property="dataDeApropriacao" title="${message(code: 'receitaApropriada.dataDeApropriacao.label', default: 'Data De Apropriacao')}" />
					
						<g:sortableColumn property="quantidadeApropriada" title="${message(code: 'receitaApropriada.quantidadeApropriada.label', default: 'Quantidade Apropriada')}" />
					
						<g:sortableColumn property="receitaApropriada" title="${message(code: 'receitaApropriada.receitaApropriada.label', default: 'Receita Apropriada')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${receitaApropriadaInstanceList}" status="i" var="receitaApropriadaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${receitaApropriadaInstance.id}">${fieldValue(bean: receitaApropriadaInstance, field: "apropriador")}</g:link></td>
					
						<td><g:formatDate date="${receitaApropriadaInstance.dataDeApropriacao}" /></td>
					
						<td>${fieldValue(bean: receitaApropriadaInstance, field: "quantidadeApropriada")}</td>
					
						<td>${fieldValue(bean: receitaApropriadaInstance, field: "receitaApropriada")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${receitaApropriadaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
