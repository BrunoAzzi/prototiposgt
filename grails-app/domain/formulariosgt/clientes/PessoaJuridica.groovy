package formulariosgt.clientes

class PessoaJuridica {
    
    String cnpj;
    String inscricaoEstadual;
    String razaoSocial;
    String nomeFantasia;
    String cnae;
    int numeroDeFuncionarios;
    String enderecoFaturamento;
    String enderecoCobranca;
    
    static hasOne = [cliente: Cliente]

    static constraints = {
    }
    
    String toString(){
        return nomeFantasia;
    }
}
