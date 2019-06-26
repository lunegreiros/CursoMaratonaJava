package curso.Bcore.Kenum.classes;

//Aula 57 - Enumeracoes
public class Cliente {
    // a enumeracao pode ser numa classe ENUM separado
    // ou dentro da classe como um METODO chamado ENUM, como esse abaixo:
    public enum TipoPagamento {
        // TODOS os atributos daqui serao considerados CONSTANTES (final)
        A_VISTA, A_PRAZO;
    }
    private String nome;
    //tenho um 'tipo' chamando o enum
    private TipoCliente tipo;
    private TipoPagamento pagamento;

    // SOBRESCRITA toString
    @Override
    public String toString() {
        return "nome: "+nome+ ", tipo: "+tipo+ ", pagamento: "+pagamento
                +", numero: "+ tipo.getTipo();
    }

    //CONSTRUTOR cheio
    public Cliente(String nome, TipoCliente tipo, TipoPagamento pagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.pagamento = pagamento;
    }

    //METODO get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

}
