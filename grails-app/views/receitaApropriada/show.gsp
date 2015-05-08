
<%@ page import="formulariosgt.apropriacao.ReceitaApropriada" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'receitaApropriada.label', default: 'ReceitaApropriada')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-receitaApropriada" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-receitaApropriada" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list receitaApropriada">
			
				<g:if test="${receitaApropriadaInstance?.apropriador}">
				<li class="fieldcontain">
					<span id="apropriador-label" class="property-label"><g:message code="receitaApropriada.apropriador.label" default="Apropriador" /></span>
					
						<span class="property-value" aria-labelledby="apropriador-label"><g:link controller="usuario" action="show" id="${receitaApropriadaInstance?.apropriador?.id}">${receitaApropriadaInstance?.apropriador?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${receitaApropriadaInstance?.dataDeApropriacao}">
				<li class="fieldcontain">
					<span id="dataDeApropriacao-label" class="property-label"><g:message code="receitaApropriada.dataDeApropriacao.label" default="Data De Apropriacao" /></span>
					
						<span class="property-value" aria-labelledby="dataDeApropriacao-label"><g:formatDate date="${receitaApropriadaInstance?.dataDeApropriacao}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${receitaApropriadaInstance?.producoesApropriadas}">
				<li class="fieldcontain">
					<span id="producoesApropriadas-label" class="property-label"><g:message code="receitaApropriada.producoesApropriadas.label" default="Producoes Apropriadas" /></span>
					
						<g:each in="${receitaApropriadaInstance.producoesApropriadas}" var="p">
						<span class="property-value" aria-labelledby="producoesApropriadas-label"><g:link controller="producaoApropriada" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${receitaApropriadaInstance?.quantidadeApropriada}">
				<li class="fieldcontain">
					<span id="quantidadeApropriada-label" class="property-label"><g:message code="receitaApropriada.quantidadeApropriada.label" default="Quantidade Apropriada" /></span>
					
						<span class="property-value" aria-labelledby="quantidadeApropriada-label"><g:fieldValue bean="${receitaApropriadaInstance}" field="quantidadeApropriada"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${receitaApropriadaInstance?.receitaApropriada}">
				<li class="fieldcontain">
					<span id="receitaApropriada-label" class="property-label"><g:message code="receitaApropriada.receitaApropriada.label" default="Receita Apropriada" /></span>
					
						<span class="property-value" aria-labelledby="receitaApropriada-label"><g:fieldValue bean="${receitaApropriadaInstance}" field="receitaApropriada"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:receitaApropriadaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${receitaApropriadaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
