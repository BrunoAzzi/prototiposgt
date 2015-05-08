package formulariosgt.produto

class ProdutoCategoria {
    
    String descricao;
    String numeroCentroDeResponsabilidade;
    static hasOne = [produtoLinhaId: ProdutoLinha]
    static hasMany = [produtosNacionais: ProdutoNacional]

    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
}
