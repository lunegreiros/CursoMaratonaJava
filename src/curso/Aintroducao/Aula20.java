/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Aintroducao;

/**
 *
 * @author Visitante
 */
// Aula de array unidimensional
public class Aula20 {
    public static void main(String[] args) {
        // variaveis do tipo array de inteiros
        int[] numero = new int[5]; // obrigado a indicar o tamanho do array
        int[] numero2 = {1,2,3,4,5};
        int[] numero3 = new int[]{1,2,3,4,5};
        
        // usando o for each para percorrer todo o array
        for(int aux : numero2){
            System.out.println(aux);
        }
        
        // array de Strings
        String[] nomes = {"Joao","Maria","Josefina","Clara"};
        
        // for each para acessar todos os elementos do array
        for (String imprimir : nomes){
            // a var imprimir do tipo String eh LOCAL. 
            //so funciona DENTRO desse for
            System.out.println(imprimir);
        }
    }
    
}
