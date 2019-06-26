package curso.Bcore.Jmodificadrofinal.classes;
//Aula 56 - modificador final
public class Carro {
    // modificadores FINAIS de ATRIBUTOS
    // eh obrigado INICIALIZAR
    private static final double VELOCIDADE_FINAL = 120; // aka CONSTANTE  
    private String nome;
    private String marca;
    
    @Override
    public String toString(){
        return "nome: "+nome+", marca: "+marca;
    }
    
    //METODOS get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static double getVELOCIDADE_FINAL() {
        return VELOCIDADE_FINAL;
    }
    
}
