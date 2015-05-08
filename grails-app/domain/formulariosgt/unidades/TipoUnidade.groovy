package formulariosgt.unidades

class TipoUnidade {
    
    String descricao;
    static hasMany = [unidades: Unidade]

    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
}
