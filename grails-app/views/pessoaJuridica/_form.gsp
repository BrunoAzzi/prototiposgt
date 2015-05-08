<%@ page import="formulariosgt.clientes.PessoaJuridica" %>



<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="pessoaJuridica.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${formulariosgt.clientes.Cliente.list()}" optionKey="id" required="" value="${pessoaJuridicaInstance?.cliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaInstance, field: 'cnae', 'error')} required">
	<label for="cnae">
		<g:message code="pessoaJuridica.cnae.label" default="Cnae" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cnae" required="" value="${pessoaJuridicaInstance?.cnae}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaInstance, field: 'cnpj', 'error')} required">
	<label for="cnpj">
		<g:message code="pessoaJuridica.cnpj.label" default="Cnpj" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cnpj" required="" value="${pessoaJuridicaInstance?.cnpj}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaInstance, field: 'enderecoCobranca', 'error')} required">
	<label for="enderecoCobranca">
		<g:message code="pessoaJuridica.enderecoCobranca.label" default="Endereco Cobranca" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="enderecoCobranca" required="" value="${pessoaJuridicaInstance?.enderecoCobranca}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaInstance, field: 'enderecoFaturamento', 'error')} required">
	<label for="enderecoFaturamento">
		<g:message code="pessoaJuridica.enderecoFaturamento.label" default="Endereco Faturamento" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="enderecoFaturamento" required="" value="${pessoaJuridicaInstance?.enderecoFaturamento}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaInstance, field: 'inscricaoEstadual', 'error')} required">
	<label for="inscricaoEstadual">
		<g:message code="pessoaJuridica.inscricaoEstadual.label" default="Inscricao Estadual" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="inscricaoEstadual" required="" value="${pessoaJuridicaInstance?.inscricaoEstadual}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaInstance, field: 'nomeFantasia', 'error')} required">
	<label for="nomeFantasia">
		<g:message code="pessoaJuridica.nomeFantasia.label" default="Nome Fantasia" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nomeFantasia" required="" value="${pessoaJuridicaInstance?.nomeFantasia}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaInstance, field: 'numeroDeFuncionarios', 'error')} required">
	<label for="numeroDeFuncionarios">
		<g:message code="pessoaJuridica.numeroDeFuncionarios.label" default="Numero De Funcionarios" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numeroDeFuncionarios" type="number" value="${pessoaJuridicaInstance.numeroDeFuncionarios}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaInstance, field: 'razaoSocial', 'error')} required">
	<label for="razaoSocial">
		<g:message code="pessoaJuridica.razaoSocial.label" default="Razao Social" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="razaoSocial" required="" value="${pessoaJuridicaInstance?.razaoSocial}"/>

</div>

