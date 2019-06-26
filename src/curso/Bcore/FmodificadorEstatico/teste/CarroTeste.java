/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.FmodificadorEstatico.teste;

import curso.Bcore.FmodificadorEstatico.classes.Carro;

/**
 *
 * @author Visitante
 */
// Aula 42 e 43 STATIC em atributos e metodos
public class CarroTeste {

    public static void main(String[] args) {
        // criar tres carros
        Carro c1 = new Carro("Caravana", 180);
        Carro c2 = new Carro("Fusca", 240);
        Carro c3 = new Carro("Fiat1947", 190);
        
        // mudar o valor do atributo de classe 'static'
        Carro.setVeloLim(20);
        
        // imprimir os valores dos tres carros
        c1.imprime();
        c2.imprime();
        c3.imprime(); 
    }

}
