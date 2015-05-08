package formulariosgt.clientes

class PessoaJuridicaEstrangeira {
    
    String documentoEmpresaEstrangeira;
    String equivalenteRazaoSocial;
    String nomeFantasia;
    int numeroDeFuncionarios;
    
    static hasOne = [cliente: Cliente]

    static constraints = {
    }
    
    String toString(){
        return nomeFantasia;
    }
}
