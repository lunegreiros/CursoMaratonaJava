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
// Aula de arrays multidimensional com tamanhos diferentes
public class Aula22 {

    public static void main(String[] args) {
        // variaveis array multidmensional
        int[][] dias = new int[3][];
        //inicializar cada array com tamanhos diferentes
        dias[0] = new int[2];
        dias[1] = new int[]{1, 2, 3};
        dias[2] = new int[4];

        //exibir cada array com seus valores inteiros
        for (int[] ref : dias) {
            for (int aux : ref) {
                System.out.print(" " + aux);
            }
            System.out.println("");
        }
        
        // outra forma de inicializar a array multidimensional
        int[][] novoArray = {{0,0},{1,2,3},{0,0,0,0}};
        // perg: qual o valor na posicao [1][2]? =3
        System.out.println("O valor na posicao 1-2 eh: "+novoArray[1][2]);
    }
}
