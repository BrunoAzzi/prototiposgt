<%@ page import="formulariosgt.colaboradores.Skill" %>



<div class="fieldcontain ${hasErrors(bean: skillInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="skill.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${skillInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: skillInstance, field: 'colaboradorId', 'error')} ">
	<label for="colaboradorId">
		<g:message code="skill.colaboradorId.label" default="Colaborador Id" />
		
	</label>
	<g:select name="colaboradorId" from="${formulariosgt.colaboradores.Colaborador.list()}" multiple="multiple" optionKey="id" size="5" value="${skillInstance?.colaboradorId*.id}" class="many-to-many"/>

</div>

