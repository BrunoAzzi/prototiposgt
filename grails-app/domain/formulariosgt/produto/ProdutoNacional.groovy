package formulariosgt.produto

class ProdutoNacional {
    
    String descricao;
    static hasOne = [produtoCategoriaId: ProdutoCategoria]
    static hasMany = [produtosRegionais: ProdutoRegional]

    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
}
