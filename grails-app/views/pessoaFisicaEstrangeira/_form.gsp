<%@ page import="formulariosgt.clientes.PessoaFisicaEstrangeira" %>



<div class="fieldcontain ${hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="pessoaFisicaEstrangeira.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${formulariosgt.clientes.Cliente.list()}" optionKey="id" required="" value="${pessoaFisicaEstrangeiraInstance?.cliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="pessoaFisicaEstrangeira.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${pessoaFisicaEstrangeiraInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'nomeCompleto', 'error')} required">
	<label for="nomeCompleto">
		<g:message code="pessoaFisicaEstrangeira.nomeCompleto.label" default="Nome Completo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nomeCompleto" required="" value="${pessoaFisicaEstrangeiraInstance?.nomeCompleto}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'numeroPassaporte', 'error')} required">
	<label for="numeroPassaporte">
		<g:message code="pessoaFisicaEstrangeira.numeroPassaporte.label" default="Numero Passaporte" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="numeroPassaporte" required="" value="${pessoaFisicaEstrangeiraInstance?.numeroPassaporte}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaFisicaEstrangeiraInstance, field: 'telefone', 'error')} required">
	<label for="telefone">
		<g:message code="pessoaFisicaEstrangeira.telefone.label" default="Telefone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefone" required="" value="${pessoaFisicaEstrangeiraInstance?.telefone}"/>

</div>

