package formulariosgt.atendimento

class Proposta {
    
    String descricao;
    static hasMany = [atendimentos: Atendimento]

    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
}
