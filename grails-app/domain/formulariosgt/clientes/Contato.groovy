package formulariosgt.clientes

class Contato {
    
    String nome;
    String setor;
    String telefone;
    String email;
    
    static hasOne = [cliente: Cliente]

    static constraints = {
    }
    
    String toString(){
        return nome;
    }
}
