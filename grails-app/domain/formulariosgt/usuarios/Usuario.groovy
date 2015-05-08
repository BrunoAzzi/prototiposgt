package formulariosgt.usuarios

import formulariosgt.unidades.Unidade
import formulariosgt.colaboradores.Colaborador
import formulariosgt.permissoes.Permissao
import formulariosgt.atendimento.Atendimento
import formulariosgt.apropriacao.ProducaoApropriada
import formulariosgt.apropriacao.ReceitaApropriada

class Usuario {
    
    String loginEmail;
    String senha;
    String username;
    boolean isAtivo;
    
    static hasOne = [unidadeId: Unidade,
        colaborador: Colaborador]
    
    static hasMany = [permissoes: Permissao, 
        atendimentos: Atendimento,
        producaoApropriada: ProducaoApropriada,
        receitaApropriada: ReceitaApropriada]

    static constraints = {
    }
    
    String toString(){
        return username;
    }
}
