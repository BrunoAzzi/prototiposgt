<%@ page import="formulariosgt.usuarios.Usuario" %>



<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'atendimentos', 'error')} ">
	<label for="atendimentos">
		<g:message code="usuario.atendimentos.label" default="Atendimentos" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${usuarioInstance?.atendimentos?}" var="a">
    <li><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="atendimento" action="create" params="['usuario.id': usuarioInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'colaborador', 'error')} required">
	<label for="colaborador">
		<g:message code="usuario.colaborador.label" default="Colaborador" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="colaborador" name="colaborador.id" from="${formulariosgt.colaboradores.Colaborador.list()}" optionKey="id" required="" value="${usuarioInstance?.colaborador?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'isAtivo', 'error')} ">
	<label for="isAtivo">
		<g:message code="usuario.isAtivo.label" default="Is Ativo" />
		
	</label>
	<g:checkBox name="isAtivo" value="${usuarioInstance?.isAtivo}" />

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'loginEmail', 'error')} required">
	<label for="loginEmail">
		<g:message code="usuario.loginEmail.label" default="Login Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="loginEmail" required="" value="${usuarioInstance?.loginEmail}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'permissoes', 'error')} ">
	<label for="permissoes">
		<g:message code="usuario.permissoes.label" default="Permissoes" />
		
	</label>
	<g:select name="permissoes" from="${formulariosgt.permissoes.Permissao.list()}" multiple="multiple" optionKey="id" size="5" value="${usuarioInstance?.permissoes*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'producaoApropriada', 'error')} ">
	<label for="producaoApropriada">
		<g:message code="usuario.producaoApropriada.label" default="Producao Apropriada" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${usuarioInstance?.producaoApropriada?}" var="p">
    <li><g:link controller="producaoApropriada" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="producaoApropriada" action="create" params="['usuario.id': usuarioInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'producaoApropriada.label', default: 'ProducaoApropriada')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'receitaApropriada', 'error')} ">
	<label for="receitaApropriada">
		<g:message code="usuario.receitaApropriada.label" default="Receita Apropriada" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${usuarioInstance?.receitaApropriada?}" var="r">
    <li><g:link controller="receitaApropriada" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="receitaApropriada" action="create" params="['usuario.id': usuarioInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'receitaApropriada.label', default: 'ReceitaApropriada')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'senha', 'error')} required">
	<label for="senha">
		<g:message code="usuario.senha.label" default="Senha" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="senha" required="" value="${usuarioInstance?.senha}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'unidadeId', 'error')} required">
	<label for="unidadeId">
		<g:message code="usuario.unidadeId.label" default="Unidade Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="unidadeId" name="unidadeId.id" from="${formulariosgt.unidades.Unidade.list()}" optionKey="id" required="" value="${usuarioInstance?.unidadeId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="usuario.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${usuarioInstance?.username}"/>

</div>

