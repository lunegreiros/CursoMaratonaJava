/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.DsobrecargaConstrutores.classes;

/**
 *
 * @author Visitante
 */
//Aula 40 - sobrecarga de construtores
public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;
    
    // criar o construtor
    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    //criar uma SOBRECARGA de CONSTRUTOR
    public Estudante(String matricula, String nome, double[] notas, 
            String dataMatricula){
        //chama o construtor com esses parametros:
        this(matricula,nome,notas);
        //depois da sobrecarga no construtor com as infos adicionais
        this.dataMatricula = dataMatricula;
    }
    
    // cria-se um construtor sem valores para ser usado como CONSTR. PADRAO
    public Estudante(){ 
    }
    
    // METODO para imprimir valores
    public void imprime(){
        System.out.println(this.matricula + "\n" + this.nome);
        for(double nota : notas){
            System.out.print(nota +" ");
        }
        System.out.println("\n"+this.dataMatricula);
    }

    // todos os METODOS gets and setters
    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    


}
