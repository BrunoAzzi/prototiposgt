package formulariosgt.permissoes

class Feature {
    
    String descricao;
    static hasMany = [permissoes: Permissao]
    static belongsTo = Permissao

    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
}
