package formulariosgt.apropriacao

import formulariosgt.usuarios.Usuario

class ReceitaApropriada {
    
    int quantidadeApropriada;
    float receitaApropriada;
    Date dataDeApropriacao;
    
    static hasOne = [apropriador: Usuario]
    static hasMany =[producoesApropriadas: ProducaoApropriada]

    static constraints = {
    }
    
    String toString() {
        return this.id.toString();
    }
}
