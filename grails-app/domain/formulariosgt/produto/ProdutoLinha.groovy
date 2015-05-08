package formulariosgt.produto

class ProdutoLinha {
    
    String descricao;
    String numeroCentroDeResponsabilidade;
    static hasMany = [produtosCategorias: ProdutoCategoria]

    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
}
