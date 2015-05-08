package formulariosgt.clientes

import formulariosgt.atendimento.Atendimento

class Cliente {
    
    Date ultimaAtualizacao;
    boolean isAtivo;
    
    static hasOne = [tipocliente: TipoCliente,
        pessoasFisicas: PessoaFisica,
        pessoasFisicasEstrangeiras: PessoaFisicaEstrangeira,
        pessoasJuridicas: PessoaJuridica,
        pessoasJuridicasEstrangeiras: PessoaJuridicaEstrangeira];
    
    static hasMany = [contatos: Contato,
        enderecos: Endereco,
        atendimentos: Atendimento]

    static constraints = {
    }
    
}
