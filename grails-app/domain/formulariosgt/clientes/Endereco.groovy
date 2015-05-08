package formulariosgt.clientes

class Endereco {
    
    String logradouro;
    String bairro;
    String localidade;
    String uf;
    String cep;
    
    static hasOne = [cliente: Cliente]

    static constraints = {
    }
}
