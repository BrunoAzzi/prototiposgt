<%@ page import="formulariosgt.apropriacao.ProducaoApropriada" %>



<div class="fieldcontain ${hasErrors(bean: producaoApropriadaInstance, field: 'apropriador', 'error')} required">
	<label for="apropriador">
		<g:message code="producaoApropriada.apropriador.label" default="Apropriador" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="apropriador" name="apropriador.id" from="${formulariosgt.usuarios.Usuario.list()}" optionKey="id" required="" value="${producaoApropriadaInstance?.apropriador?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: producaoApropriadaInstance, field: 'atendimento', 'error')} required">
	<label for="atendimento">
		<g:message code="producaoApropriada.atendimento.label" default="Atendimento" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="atendimento" name="atendimento.id" from="${formulariosgt.atendimento.Atendimento.list()}" optionKey="id" required="" value="${producaoApropriadaInstance?.atendimento?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: producaoApropriadaInstance, field: 'dataDeApropriacao', 'error')} required">
	<label for="dataDeApropriacao">
		<g:message code="producaoApropriada.dataDeApropriacao.label" default="Data De Apropriacao" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dataDeApropriacao" precision="day"  value="${producaoApropriadaInstance?.dataDeApropriacao}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: producaoApropriadaInstance, field: 'quantidadeApropriada', 'error')} required">
	<label for="quantidadeApropriada">
		<g:message code="producaoApropriada.quantidadeApropriada.label" default="Quantidade Apropriada" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="quantidadeApropriada" type="number" value="${producaoApropriadaInstance.quantidadeApropriada}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: producaoApropriadaInstance, field: 'receitaApropriada', 'error')} required">
	<label for="receitaApropriada">
		<g:message code="producaoApropriada.receitaApropriada.label" default="Receita Apropriada" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="receitaApropriada" name="receitaApropriada.id" from="${formulariosgt.apropriacao.ReceitaApropriada.list()}" optionKey="id" required="" value="${producaoApropriadaInstance?.receitaApropriada?.id}" class="many-to-one"/>

</div>

