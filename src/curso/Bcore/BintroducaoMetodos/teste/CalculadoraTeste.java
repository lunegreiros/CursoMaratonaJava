/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.BintroducaoMetodos.teste;

import curso.Bcore.BintroducaoMetodos.classes.Calculadora;

/**
 *
 * @author Visitante
 */
public class CalculadoraTeste {
    // main para executar o codigo
    public static void main(String[] args) {
        //chamar a classe e criar um OBJETO para ele
        Calculadora calc = new Calculadora();
        
        // chamar o METODO de somar
        calc.somaDoisNumeros();
        // chamar o METODO de subtrair
        calc.subtraiDoisNumeros();
        // chamar o METODO de multiplicar com passagem de dois argumentos
        calc.multiplicaDoisNumeros(3, 4);
        // chamar o METODO com retorno de valor
        double resultado = calc.divideDoisNumeros(30.5, 2);
        System.out.println(resultado);
        
        
        System.out.println("Codigo depois de executado os metodos");
         
        // chamar o metodo 'somaArray'
        int[] numeros = {3,5,10,90,2};
        calc.somaArray(numeros);
    }
    
}
