package curso.Bcore.FmodificadorEstatico.classes;

// Aula 42 e 43 STATIC em atributos e metodos
public class Carro {

    // volocidade limite deve ser 240km/h
    private String nome;
    private double veloMax;
    // para tranformar um atributo que PERTENCE A CLASSE e nao ao objeto
    // coloca o modificador STATIC
    private static double veloLim = 240;

    //construtor com os atributos (menos o velLimite, pq sera valor fixo)
    public Carro(String nome, double veloMax) {
        this.nome = nome;
        this.veloMax = veloMax;
    }

    //construtor padrao, ou seja, sem valores
    public Carro() {
    }

    // METODO para exibir os valores
    public void imprime() {
        System.out.println("-------------------");
        System.out.println("O " + this.nome + " atinge: " + this.veloMax + "km/h"
                + "com limite de: " + veloLim + "km/h");
        // repare que o 'veloLim' de cima NAO possui o THIS, pq agora ele eh
        // STATIC, ou seja, faz parte da classe e nao do objeto
    }

    //METODOS get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(double veloMax) {
        this.veloMax = veloMax;
    }

    public static void setVeloLim(double veloLim) {
        Carro.veloLim = veloLim;
    }

    public static double getVelLim() {
        return Carro.veloLim;
    }

}
