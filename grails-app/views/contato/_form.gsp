<%@ page import="formulariosgt.clientes.Contato" %>



<div class="fieldcontain ${hasErrors(bean: contatoInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="contato.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${formulariosgt.clientes.Cliente.list()}" optionKey="id" required="" value="${contatoInstance?.cliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: contatoInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="contato.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${contatoInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: contatoInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="contato.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${contatoInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: contatoInstance, field: 'setor', 'error')} required">
	<label for="setor">
		<g:message code="contato.setor.label" default="Setor" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="setor" required="" value="${contatoInstance?.setor}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: contatoInstance, field: 'telefone', 'error')} required">
	<label for="telefone">
		<g:message code="contato.telefone.label" default="Telefone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefone" required="" value="${contatoInstance?.telefone}"/>

</div>

