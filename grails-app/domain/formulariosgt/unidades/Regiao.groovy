package formulariosgt.unidades

class Regiao {
    
    String descricao;
    
    static hasMany = [municipios: Municipio]

    static constraints = {
        descricao(nullable: false)
    }
    
    String toString(){
        return descricao;
    }
}
