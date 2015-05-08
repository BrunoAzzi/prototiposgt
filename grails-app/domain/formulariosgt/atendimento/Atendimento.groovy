package formulariosgt.atendimento

import formulariosgt.usuarios.Usuario
import formulariosgt.clientes.Cliente
import formulariosgt.produto.ProdutoRegional
import formulariosgt.apropriacao.ProducaoApropriada

class Atendimento {
    
    String descricao
    Date dataEmissao;
    int numeroDeProducaoEstimada
    int numeroDeReceitaEstimada
    int versao;
    static hasOne = [status: AtendimentoStatus,
        atendente: Usuario,
        cliente: Cliente,
        produtoRegional: ProdutoRegional,
        proposta: Proposta]
    static hasMany = [prodicoesApropriadas: ProducaoApropriada]
    
    static constraints = {
    }
    
    String toString() {
        return descricao;
    }
}
