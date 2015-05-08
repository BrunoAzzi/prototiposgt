
<%@ page import="formulariosgt.usuarios.Usuario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'usuario.label', default: 'Usuario')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-usuario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-usuario" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list usuario">
			
				<g:if test="${usuarioInstance?.atendimentos}">
				<li class="fieldcontain">
					<span id="atendimentos-label" class="property-label"><g:message code="usuario.atendimentos.label" default="Atendimentos" /></span>
					
						<g:each in="${usuarioInstance.atendimentos}" var="a">
						<span class="property-value" aria-labelledby="atendimentos-label"><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.colaborador}">
				<li class="fieldcontain">
					<span id="colaborador-label" class="property-label"><g:message code="usuario.colaborador.label" default="Colaborador" /></span>
					
						<span class="property-value" aria-labelledby="colaborador-label"><g:link controller="colaborador" action="show" id="${usuarioInstance?.colaborador?.id}">${usuarioInstance?.colaborador?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.isAtivo}">
				<li class="fieldcontain">
					<span id="isAtivo-label" class="property-label"><g:message code="usuario.isAtivo.label" default="Is Ativo" /></span>
					
						<span class="property-value" aria-labelledby="isAtivo-label"><g:formatBoolean boolean="${usuarioInstance?.isAtivo}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.loginEmail}">
				<li class="fieldcontain">
					<span id="loginEmail-label" class="property-label"><g:message code="usuario.loginEmail.label" default="Login Email" /></span>
					
						<span class="property-value" aria-labelledby="loginEmail-label"><g:fieldValue bean="${usuarioInstance}" field="loginEmail"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.permissoes}">
				<li class="fieldcontain">
					<span id="permissoes-label" class="property-label"><g:message code="usuario.permissoes.label" default="Permissoes" /></span>
					
						<g:each in="${usuarioInstance.permissoes}" var="p">
						<span class="property-value" aria-labelledby="permissoes-label"><g:link controller="permissao" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.producaoApropriada}">
				<li class="fieldcontain">
					<span id="producaoApropriada-label" class="property-label"><g:message code="usuario.producaoApropriada.label" default="Producao Apropriada" /></span>
					
						<g:each in="${usuarioInstance.producaoApropriada}" var="p">
						<span class="property-value" aria-labelledby="producaoApropriada-label"><g:link controller="producaoApropriada" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.receitaApropriada}">
				<li class="fieldcontain">
					<span id="receitaApropriada-label" class="property-label"><g:message code="usuario.receitaApropriada.label" default="Receita Apropriada" /></span>
					
						<g:each in="${usuarioInstance.receitaApropriada}" var="r">
						<span class="property-value" aria-labelledby="receitaApropriada-label"><g:link controller="receitaApropriada" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.senha}">
				<li class="fieldcontain">
					<span id="senha-label" class="property-label"><g:message code="usuario.senha.label" default="Senha" /></span>
					
						<span class="property-value" aria-labelledby="senha-label"><g:fieldValue bean="${usuarioInstance}" field="senha"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.unidadeId}">
				<li class="fieldcontain">
					<span id="unidadeId-label" class="property-label"><g:message code="usuario.unidadeId.label" default="Unidade Id" /></span>
					
						<span class="property-value" aria-labelledby="unidadeId-label"><g:link controller="unidade" action="show" id="${usuarioInstance?.unidadeId?.id}">${usuarioInstance?.unidadeId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.username}">
				<li class="fieldcontain">
					<span id="username-label" class="property-label"><g:message code="usuario.username.label" default="Username" /></span>
					
						<span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${usuarioInstance}" field="username"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:usuarioInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${usuarioInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
