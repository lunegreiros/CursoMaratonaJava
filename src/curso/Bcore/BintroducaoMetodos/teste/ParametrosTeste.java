/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.BintroducaoMetodos.teste;

import curso.Bcore.BintroducaoMetodos.classes.Parametros;

/**
 *
 * @author Visitante
 */
//Aula 31 parametros via copia e via referencia
public class ParametrosTeste {
    public static void main(String[] args) {
        // chamar METODO e criar objeto
        Parametros param = new Parametros();
        
        int a = 5;
        int b = 6;
        param.alteraNumeros(a, b);
        System.out.println("numeros dentro do main: "+a+", "+b);
    }
    
}
