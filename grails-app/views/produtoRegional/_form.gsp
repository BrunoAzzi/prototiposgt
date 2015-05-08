<%@ page import="formulariosgt.produto.ProdutoRegional" %>



<div class="fieldcontain ${hasErrors(bean: produtoRegionalInstance, field: 'atendimentos', 'error')} ">
	<label for="atendimentos">
		<g:message code="produtoRegional.atendimentos.label" default="Atendimentos" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${produtoRegionalInstance?.atendimentos?}" var="a">
    <li><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="atendimento" action="create" params="['produtoRegional.id': produtoRegionalInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: produtoRegionalInstance, field: 'colaboradoresAtendentes', 'error')} ">
	<label for="colaboradoresAtendentes">
		<g:message code="produtoRegional.colaboradoresAtendentes.label" default="Colaboradores Atendentes" />
		
	</label>
	

</div>

<div class="fieldcontain ${hasErrors(bean: produtoRegionalInstance, field: 'isAtivo', 'error')} ">
	<label for="isAtivo">
		<g:message code="produtoRegional.isAtivo.label" default="Is Ativo" />
		
	</label>
	<g:checkBox name="isAtivo" value="${produtoRegionalInstance?.isAtivo}" />

</div>

<div class="fieldcontain ${hasErrors(bean: produtoRegionalInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="produtoRegional.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${produtoRegionalInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoRegionalInstance, field: 'numeroCentroDeResponsabilidade', 'error')} required">
	<label for="numeroCentroDeResponsabilidade">
		<g:message code="produtoRegional.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numeroCentroDeResponsabilidade" type="number" value="${produtoRegionalInstance.numeroCentroDeResponsabilidade}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoRegionalInstance, field: 'numeroCentroDeResponsabilidadeLivre', 'error')} required">
	<label for="numeroCentroDeResponsabilidadeLivre">
		<g:message code="produtoRegional.numeroCentroDeResponsabilidadeLivre.label" default="Numero Centro De Responsabilidade Livre" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numeroCentroDeResponsabilidadeLivre" type="number" value="${produtoRegionalInstance.numeroCentroDeResponsabilidadeLivre}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoRegionalInstance, field: 'produtoNacionalId', 'error')} required">
	<label for="produtoNacionalId">
		<g:message code="produtoRegional.produtoNacionalId.label" default="Produto Nacional Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="produtoNacionalId" name="produtoNacionalId.id" from="${formulariosgt.produto.ProdutoNacional.list()}" optionKey="id" required="" value="${produtoRegionalInstance?.produtoNacionalId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoRegionalInstance, field: 'unidade', 'error')} required">
	<label for="unidade">
		<g:message code="produtoRegional.unidade.label" default="Unidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="unidade" name="unidade.id" from="${formulariosgt.unidades.Unidade.list()}" optionKey="id" required="" value="${produtoRegionalInstance?.unidade?.id}" class="many-to-one"/>

</div>

