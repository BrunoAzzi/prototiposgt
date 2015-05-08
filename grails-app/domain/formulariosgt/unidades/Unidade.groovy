package formulariosgt.unidades

import formulariosgt.produto.ProdutoRegional
import formulariosgt.usuarios.Usuario

class Unidade {
    
    String descricao;
    int numeroCentroDeResponsabilidade;
    
    static hasOne = [municipio: Municipio,
        tipoUnidade: TipoUnidade]
    
    static hasMany = [produtosRegionais: ProdutoRegional,
        usuarios: Usuario]

    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
}
