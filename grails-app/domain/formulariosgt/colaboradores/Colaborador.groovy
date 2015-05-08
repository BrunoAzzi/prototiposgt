package formulariosgt.colaboradores

import formulariosgt.usuarios.Usuario
import formulariosgt.produto.ProdutoRegional

class Colaborador {
    
    String cpf;
    String nomeCompleto;
    String numeroCentroDeResponsabilidade;
    String telefone;
    String email;
    String linkCurriculumVitae;
    int numeroDeHorasDeTrabalho;
    boolean isAtivo;
    
    static hasOne = [formacaoColaboradorId: FormacaoColaborador , 
        tipoContratoColaboradorId: TipoContratoColaborador,
        usuario: Usuario]
    
    static hasMany = [skills: Skill,
        produtosRegionais: ProdutoRegional]
    
    static belongsTo = Skill
    

    static constraints = {
    }
    
    String toString(){
        return nomeCompleto;
    }
}
