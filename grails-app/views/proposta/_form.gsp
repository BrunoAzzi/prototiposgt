<%@ page import="formulariosgt.atendimento.Proposta" %>



<div class="fieldcontain ${hasErrors(bean: propostaInstance, field: 'atendimentos', 'error')} ">
	<label for="atendimentos">
		<g:message code="proposta.atendimentos.label" default="Atendimentos" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${propostaInstance?.atendimentos?}" var="a">
    <li><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="atendimento" action="create" params="['proposta.id': propostaInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: propostaInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="proposta.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${propostaInstance?.descricao}"/>

</div>

