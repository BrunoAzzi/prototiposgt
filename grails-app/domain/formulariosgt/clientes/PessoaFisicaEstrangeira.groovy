package formulariosgt.clientes

class PessoaFisicaEstrangeira {
    
    String numeroPassaporte;
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
