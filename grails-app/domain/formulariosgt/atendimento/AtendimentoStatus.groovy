package formulariosgt.atendimento

class AtendimentoStatus {
    
    String descricao;
    static hasMany = [atendimentos: Atendimento]

    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
    
}
