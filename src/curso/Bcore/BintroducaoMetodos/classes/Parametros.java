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
//Aula 31 - passagem de parametros via copia e via referencia
public class Parametros {
    // metodo que altera dois numeros via copia
    public void alteraNumeros(int c, int d){
        c = 20;
        d = 50;
        System.out.println("numeros dentro do metodo: "+c+", "+d);
    }
    
}
