<%@ page import="formulariosgt.atendimento.AtendimentoStatus" %>



<div class="fieldcontain ${hasErrors(bean: atendimentoStatusInstance, field: 'atendimentos', 'error')} ">
	<label for="atendimentos">
		<g:message code="atendimentoStatus.atendimentos.label" default="Atendimentos" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${atendimentoStatusInstance?.atendimentos?}" var="a">
    <li><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="atendimento" action="create" params="['atendimentoStatus.id': atendimentoStatusInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoStatusInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="atendimentoStatus.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${atendimentoStatusInstance?.descricao}"/>

</div>

