package formulariosgt.permissoes

import formulariosgt.usuarios.Usuario

class Permissao {
    
    String descricao;
    static hasMany = [features: Feature, 
        usuarios: Usuario]            
    static belongsTo = Usuario

    static constraints = {
    }
    
    String toString(){
        return descricao;
    }
}
