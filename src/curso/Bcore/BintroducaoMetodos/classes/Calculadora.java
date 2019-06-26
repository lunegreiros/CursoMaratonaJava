/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.BintroducaoMetodos.classes;

/**
 *
 * @author Visitante
 */
// Aula 27 e 28 metodos sem e com passagem de parametros
public class Calculadora {
    // criar metodos
    // <modificador_acesso> <retorno> <nome_metodo>
    public void somaDoisNumeros (){
        System.out.println(5+5);
    }
    public void subtraiDoisNumeros (){
        System.out.println(5-5);
    }
    public void multiplicaDoisNumeros (int a, int b){
        System.out.println(a*b);
    }
    // metodo com retorno
    public double divideDoisNumeros(double a, double b){
        return a/b;
    }
    
    // criar um METODO para somar varios numeros
    // que recebe PARAMETROS ma array de int
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    



//
}
