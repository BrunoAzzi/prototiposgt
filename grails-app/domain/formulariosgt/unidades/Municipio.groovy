package formulariosgt.unidades

class Municipio {
    
    String descricao;
    String unidadeFederativa;
    
    static hasOne = [regiao: Regiao]
    
    static hasMany = [unidades: Unidade]

    static constraints = {
        descricao(nullable: false)
        unidadeFederativa(nullable: false)
    }
    
    String toString(){
        return descricao;
    }
}
