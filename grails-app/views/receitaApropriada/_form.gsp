<%@ page import="formulariosgt.apropriacao.ReceitaApropriada" %>



<div class="fieldcontain ${hasErrors(bean: receitaApropriadaInstance, field: 'apropriador', 'error')} required">
	<label for="apropriador">
		<g:message code="receitaApropriada.apropriador.label" default="Apropriador" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="apropriador" name="apropriador.id" from="${formulariosgt.usuarios.Usuario.list()}" optionKey="id" required="" value="${receitaApropriadaInstance?.apropriador?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: receitaApropriadaInstance, field: 'dataDeApropriacao', 'error')} required">
	<label for="dataDeApropriacao">
		<g:message code="receitaApropriada.dataDeApropriacao.label" default="Data De Apropriacao" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dataDeApropriacao" precision="day"  value="${receitaApropriadaInstance?.dataDeApropriacao}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: receitaApropriadaInstance, field: 'producoesApropriadas', 'error')} ">
	<label for="producoesApropriadas">
		<g:message code="receitaApropriada.producoesApropriadas.label" default="Producoes Apropriadas" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${receitaApropriadaInstance?.producoesApropriadas?}" var="p">
    <li><g:link controller="producaoApropriada" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="producaoApropriada" action="create" params="['receitaApropriada.id': receitaApropriadaInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'producaoApropriada.label', default: 'ProducaoApropriada')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: receitaApropriadaInstance, field: 'quantidadeApropriada', 'error')} required">
	<label for="quantidadeApropriada">
		<g:message code="receitaApropriada.quantidadeApropriada.label" default="Quantidade Apropriada" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="quantidadeApropriada" type="number" value="${receitaApropriadaInstance.quantidadeApropriada}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: receitaApropriadaInstance, field: 'receitaApropriada', 'error')} required">
	<label for="receitaApropriada">
		<g:message code="receitaApropriada.receitaApropriada.label" default="Receita Apropriada" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="receitaApropriada" value="${fieldValue(bean: receitaApropriadaInstance, field: 'receitaApropriada')}" required=""/>

</div>

