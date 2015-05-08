<%@ page import="formulariosgt.clientes.PessoaFisica" %>



<div class="fieldcontain ${hasErrors(bean: pessoaFisicaInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="pessoaFisica.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${formulariosgt.clientes.Cliente.list()}" optionKey="id" required="" value="${pessoaFisicaInstance?.cliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaFisicaInstance, field: 'cpf', 'error')} required">
	<label for="cpf">
		<g:message code="pessoaFisica.cpf.label" default="Cpf" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cpf" required="" value="${pessoaFisicaInstance?.cpf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaFisicaInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="pessoaFisica.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${pessoaFisicaInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaFisicaInstance, field: 'nomeCompleto', 'error')} required">
	<label for="nomeCompleto">
		<g:message code="pessoaFisica.nomeCompleto.label" default="Nome Completo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nomeCompleto" required="" value="${pessoaFisicaInstance?.nomeCompleto}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaFisicaInstance, field: 'telefone', 'error')} required">
	<label for="telefone">
		<g:message code="pessoaFisica.telefone.label" default="Telefone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefone" required="" value="${pessoaFisicaInstance?.telefone}"/>

</div>

