<%@ page import="formulariosgt.atendimento.Atendimento" %>



<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'atendente', 'error')} required">
	<label for="atendente">
		<g:message code="atendimento.atendente.label" default="Atendente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="atendente" name="atendente.id" from="${formulariosgt.usuarios.Usuario.list()}" optionKey="id" required="" value="${atendimentoInstance?.atendente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="atendimento.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${formulariosgt.clientes.Cliente.list()}" optionKey="id" required="" value="${atendimentoInstance?.cliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'dataEmissao', 'error')} required">
	<label for="dataEmissao">
		<g:message code="atendimento.dataEmissao.label" default="Data Emissao" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dataEmissao" precision="day"  value="${atendimentoInstance?.dataEmissao}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="atendimento.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${atendimentoInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'numeroDeProducaoEstimada', 'error')} required">
	<label for="numeroDeProducaoEstimada">
		<g:message code="atendimento.numeroDeProducaoEstimada.label" default="Numero De Producao Estimada" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numeroDeProducaoEstimada" type="number" value="${atendimentoInstance.numeroDeProducaoEstimada}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'numeroDeReceitaEstimada', 'error')} required">
	<label for="numeroDeReceitaEstimada">
		<g:message code="atendimento.numeroDeReceitaEstimada.label" default="Numero De Receita Estimada" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numeroDeReceitaEstimada" type="number" value="${atendimentoInstance.numeroDeReceitaEstimada}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'prodicoesApropriadas', 'error')} ">
	<label for="prodicoesApropriadas">
		<g:message code="atendimento.prodicoesApropriadas.label" default="Prodicoes Apropriadas" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${atendimentoInstance?.prodicoesApropriadas?}" var="p">
    <li><g:link controller="producaoApropriada" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="producaoApropriada" action="create" params="['atendimento.id': atendimentoInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'producaoApropriada.label', default: 'ProducaoApropriada')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'produtoRegional', 'error')} required">
	<label for="produtoRegional">
		<g:message code="atendimento.produtoRegional.label" default="Produto Regional" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="produtoRegional" name="produtoRegional.id" from="${formulariosgt.produto.ProdutoRegional.list()}" optionKey="id" required="" value="${atendimentoInstance?.produtoRegional?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'proposta', 'error')} required">
	<label for="proposta">
		<g:message code="atendimento.proposta.label" default="Proposta" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="proposta" name="proposta.id" from="${formulariosgt.atendimento.Proposta.list()}" optionKey="id" required="" value="${atendimentoInstance?.proposta?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="atendimento.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="status" name="status.id" from="${formulariosgt.atendimento.AtendimentoStatus.list()}" optionKey="id" required="" value="${atendimentoInstance?.status?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: atendimentoInstance, field: 'versao', 'error')} required">
	<label for="versao">
		<g:message code="atendimento.versao.label" default="Versao" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="versao" type="number" value="${atendimentoInstance.versao}" required=""/>

</div>

