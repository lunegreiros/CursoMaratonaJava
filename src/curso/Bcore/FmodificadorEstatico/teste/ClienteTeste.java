/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.FmodificadorEstatico.teste;

import curso.Bcore.FmodificadorEstatico.classes.Cliente;

/**
 *
 * @author Visitante
 */
//Aula 41 - bloco de inicializacao
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        
        //
        for(int aux : c.getParcelas()){
            System.out.print(aux + " ");    
        }
        System.out.println("\ntamanho das parcelas: "+Cliente.getParcelas().length);
    }
    
}
