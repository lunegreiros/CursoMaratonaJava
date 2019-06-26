/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.AintroducaoClasses.teste;

import curso.Bcore.AintroducaoClasses.classes.Carro;

/**
 *
 * @author Visitante
 */
//Aula 25: testando o OBJETO da classe 'Carro'
public class CarroTeste {
    public static void main(String[] args) {
        // leia-se: a variavel de referencia 'carro' 
        // do tipo 'Carro' esta referenciando
        // um OBJETO do tipo 'Carro()'
        Carro carro = new Carro();
        
        // inicializando os atributos / ou estados do objeto
        // aka VARIAVEIS DE INSTANCIA
        carro.modelo = "caravan";
        carro.placa = "ASD 2345";
        carro.velocidadeMax = 120f;
        
        //exibicao doa valores de cada estado / variavel de instancia
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMax);
    }
}
