/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.AintroducaoClasses.teste;
// esse pacote teve que ser importado
import curso.Bcore.AintroducaoClasses.classes.Estudante;

/**
 *
 * @author Visitante
 */
//Aula 24: Testando o OBJETO da classe 'Estudante'
public class EstudanteTeste {
    public static void main(String[] args) {
        // pra criar um OBJETO, primeiros voce deve chamar a classe
        // a 'classe' se comporta como uma variavel especial, customizada
        // assim: <Estudante> eh o tipo da variavel de referencia;
        // <joao> eh o nome da variavel, eh o identificador;
        // <=> faz referencia a...
        // <new> eh a inicializacao de um novo OBJETOS, cria um obj. na memoria;
        // <Estudante()> obj. do tipo Estudante();
        Estudante joao = new Estudante();
        // acessando cada atributo da classe estudante
        joao.nome = "Joao Almeida";
        joao.idade = 18;
        joao.matricula = "as23";
        
        System.out.println(joao.nome + ", com idade: " + joao.idade + ", possui a matricula: " + joao.matricula);
    }
    
    
    // detalhe: um OBJETO pode ser de um tipo e a 'variavel de referencia'
    // ser de outro tipo; isso eh polimorfismo
    
}
