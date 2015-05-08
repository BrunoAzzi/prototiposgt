package formulariosgt.clientes

class PessoaFisica {
    
    String cpf;
    String nomeCompleto;
    String telefone;
    String email;
    
    static hasOne = [cliente: Cliente]

    static constraints = {
    }
    
    String toString(){
        return nomeCompleto;
    }
}
