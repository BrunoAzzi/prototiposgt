package formulariosgt.produto

import formulariosgt.atendimento.Atendimento
import formulariosgt.colaboradores.Colaborador
import formulariosgt.unidades.Unidade

class ProdutoRegional {
    
    String nome;
    boolean isAtivo;
    int numeroCentroDeResponsabilidade;
    int numeroCentroDeResponsabilidadeLivre;
    static hasMany = [atendimentos: Atendimento,
                    colaboradoresAtendentes: Colaborador];
    static hasOne = [produtoNacionalId: ProdutoNacional,
                    unidade: Unidade];
                
    static belongsTo = Colaborador

    static constraints = {
    }
    
    String toString(){
        return nome;
    }
}
