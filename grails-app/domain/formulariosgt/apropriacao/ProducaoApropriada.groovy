package formulariosgt.apropriacao

import formulariosgt.atendimento.Atendimento
import formulariosgt.usuarios.Usuario

class ProducaoApropriada {
    
    int quantidadeApropriada;
    Date dataDeApropriacao;
    static hasOne = [atendimento: Atendimento,
        apropriador: Usuario,
        receitaApropriada: ReceitaApropriada]

    static constraints = {
    }
    
    String toString() {
        return this.id.toString();
    }
}
