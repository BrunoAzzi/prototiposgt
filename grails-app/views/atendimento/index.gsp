
<%@ page import="formulariosgt.atendimento.Atendimento" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'atendimento.label', default: 'Atendimento')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-atendimento" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-atendimento" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="atendimento.atendente.label" default="Atendente" /></th>
					
						<th><g:message code="atendimento.cliente.label" default="Cliente" /></th>
					
						<g:sortableColumn property="dataEmissao" title="${message(code: 'atendimento.dataEmissao.label', default: 'Data Emissao')}" />
					
						<g:sortableColumn property="descricao" title="${message(code: 'atendimento.descricao.label', default: 'Descricao')}" />
					
						<g:sortableColumn property="numeroDeProducaoEstimada" title="${message(code: 'atendimento.numeroDeProducaoEstimada.label', default: 'Numero De Producao Estimada')}" />
					
						<g:sortableColumn property="numeroDeReceitaEstimada" title="${message(code: 'atendimento.numeroDeReceitaEstimada.label', default: 'Numero De Receita Estimada')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${atendimentoInstanceList}" status="i" var="atendimentoInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${atendimentoInstance.id}">${fieldValue(bean: atendimentoInstance, field: "atendente")}</g:link></td>
					
						<td>${fieldValue(bean: atendimentoInstance, field: "cliente")}</td>
					
						<td><g:formatDate date="${atendimentoInstance.dataEmissao}" /></td>
					
						<td>${fieldValue(bean: atendimentoInstance, field: "descricao")}</td>
					
						<td>${fieldValue(bean: atendimentoInstance, field: "numeroDeProducaoEstimada")}</td>
					
						<td>${fieldValue(bean: atendimentoInstance, field: "numeroDeReceitaEstimada")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${atendimentoInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
