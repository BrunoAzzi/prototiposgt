<%@ page import="formulariosgt.clientes.Cliente" %>



<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'atendimentos', 'error')} ">
	<label for="atendimentos">
		<g:message code="cliente.atendimentos.label" default="Atendimentos" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${clienteInstance?.atendimentos?}" var="a">
    <li><g:link controller="atendimento" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="atendimento" action="create" params="['cliente.id': clienteInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'atendimento.label', default: 'Atendimento')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'contatos', 'error')} ">
	<label for="contatos">
		<g:message code="cliente.contatos.label" default="Contatos" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${clienteInstance?.contatos?}" var="c">
    <li><g:link controller="contato" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="contato" action="create" params="['cliente.id': clienteInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'contato.label', default: 'Contato')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'enderecos', 'error')} ">
	<label for="enderecos">
		<g:message code="cliente.enderecos.label" default="Enderecos" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${clienteInstance?.enderecos?}" var="e">
    <li><g:link controller="endereco" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="endereco" action="create" params="['cliente.id': clienteInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'endereco.label', default: 'Endereco')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'isAtivo', 'error')} ">
	<label for="isAtivo">
		<g:message code="cliente.isAtivo.label" default="Is Ativo" />
		
	</label>
	<g:checkBox name="isAtivo" value="${clienteInstance?.isAtivo}" />

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'pessoasFisicas', 'error')} required">
	<label for="pessoasFisicas">
		<g:message code="cliente.pessoasFisicas.label" default="Pessoas Fisicas" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="pessoasFisicas" name="pessoasFisicas.id" from="${formulariosgt.clientes.PessoaFisica.list()}" optionKey="id" required="" value="${clienteInstance?.pessoasFisicas?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'pessoasFisicasEstrangeiras', 'error')} required">
	<label for="pessoasFisicasEstrangeiras">
		<g:message code="cliente.pessoasFisicasEstrangeiras.label" default="Pessoas Fisicas Estrangeiras" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="pessoasFisicasEstrangeiras" name="pessoasFisicasEstrangeiras.id" from="${formulariosgt.clientes.PessoaFisicaEstrangeira.list()}" optionKey="id" required="" value="${clienteInstance?.pessoasFisicasEstrangeiras?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'pessoasJuridicas', 'error')} required">
	<label for="pessoasJuridicas">
		<g:message code="cliente.pessoasJuridicas.label" default="Pessoas Juridicas" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="pessoasJuridicas" name="pessoasJuridicas.id" from="${formulariosgt.clientes.PessoaJuridica.list()}" optionKey="id" required="" value="${clienteInstance?.pessoasJuridicas?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'pessoasJuridicasEstrangeiras', 'error')} required">
	<label for="pessoasJuridicasEstrangeiras">
		<g:message code="cliente.pessoasJuridicasEstrangeiras.label" default="Pessoas Juridicas Estrangeiras" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="pessoasJuridicasEstrangeiras" name="pessoasJuridicasEstrangeiras.id" from="${formulariosgt.clientes.PessoaJuridicaEstrangeira.list()}" optionKey="id" required="" value="${clienteInstance?.pessoasJuridicasEstrangeiras?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'tipocliente', 'error')} required">
	<label for="tipocliente">
		<g:message code="cliente.tipocliente.label" default="Tipocliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="tipocliente" name="tipocliente.id" from="${formulariosgt.clientes.TipoCliente.list()}" optionKey="id" required="" value="${clienteInstance?.tipocliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: clienteInstance, field: 'ultimaAtualizacao', 'error')} required">
	<label for="ultimaAtualizacao">
		<g:message code="cliente.ultimaAtualizacao.label" default="Ultima Atualizacao" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="ultimaAtualizacao" precision="day"  value="${clienteInstance?.ultimaAtualizacao}"  />

</div>

