/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.CsobrecargaMetodos.classes;

/**
 *
 * @author Visitante
 */
//Aula 38 - sobrecarga de metodos
//Aula 39 - construtor e sobrecarga de construtor
public class Funcionario {
    // artibutos privados
    private String nome;
    private String cpf;
    private double salario;
    private String rg;
    
    // CONSTRUTORES
    // um construtor eh quem 'constroe' o objeto baseado na classe especificada
    // o construtor NAO TEM RETORNO
    // IMP: o construtor eh o primeiro codigo a ser executado!!!
    // somente <modficador_acesso><nome_classe>
    public Funcionario(String nome, String cpf, double salario, String rg){
        // o construtor pode definir REGRAS para a classe ou valores padrao
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }
    // ou sobrecarga de construtores
    // nesse caso, um construtor sem parametros
    public Funcionario(){
    }
    
    // METODO para imprimir
    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }
    
    // METODO para inicializar todos os atributos
    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    // SOBRECARGA de METODO eh quando temos um OUTRO metodo com o MESMO NOME
    // porem os PARAMETROS sao DIFERENTES
    // NOTA: o modificador de acesso e o retorno NAO IMPORTAM: podem ser iguais
    // ou diferentes que nao significa 'sobrecarga de metodo'
    public void init(String nome, String cpf, double salario, String rg){
        // chamar o METODO original:
        init(nome, cpf, salario);
        // para depois acrescentar o novo atributo
        this.rg = rg;
    }
    
    //-------------------------------------------
    // METODOS SETs
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    // METODOS GETs
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public double getSalario(){
        return this.salario;
    }
}
