package curso.Bcore.Minterfaces.classes;

//Aula 62 - interfaces
public class Produto implements Tributavel, Transportavel{
    private String nome;
    private double peso;
    private double preco;
    //
    private double precoFinal;
    private double valorFrete;

    
    //CONSTRUTOR cheio
    public Produto(String nome, double peso, double preco){
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }
    
    // essa classe 'produto' usa implements; como toda interface possui METODOS
    // ABSTRACTS, aqui eh OBRIGATORIO SUBESCREVER o METODO tb ABSTRACT
    // (aqui da classe 'Tributavel')
    @Override
    public void calcularImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }
    // (e aqui da classe 'Transportavel')
    @Override
    public void calculaFrete(){
        this.valorFrete = this.preco/peso * 0.01;
    }
    
    //SOBRESCREVER o toString
    @Override
    public String toString(){
        return "nome: "+nome+", Peso: "+peso+", Preco: "+preco+
                ", Preco com imposto: "+precoFinal+", Frete: "+valorFrete;
    }
    // METODOS get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    // APENAS os METODOS gets
    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
