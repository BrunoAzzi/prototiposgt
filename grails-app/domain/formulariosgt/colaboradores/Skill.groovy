package formulariosgt.colaboradores

class Skill {
    
    String descricao;
    static hasMany = [colaboradorId: Colaborador]

    static constraints = {
        descricao(blank: false)
    }
    
    String toString(){
        return descricao;
    }
}
