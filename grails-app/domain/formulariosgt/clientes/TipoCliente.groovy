package formulariosgt.clientes

class TipoCliente {
    
    String descricao;
    
    static hasMany = [clientes: Cliente]
    
    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
}
