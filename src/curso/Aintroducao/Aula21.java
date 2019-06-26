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
// Aula de array multidimensional
public class Aula21 {

    public static void main(String[] args) {
        int[][] dias = new int[2][2]; // PRIMEIRO array eh obrigatorio o tamanho

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[1][0] = 34;
        dias[1][1] = 45;

        for (int i = 0; i < dias.length; i++) {
            //System.out.println(dias); // vai me fornecer o end de cada array
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------");
        // agora usando o for each
        // cuidado com a array que esta sendo referenciada 'ref'
        // ela eh do tipo array de inteiros 'int[]' e nao somente inteiros
        for (int[] ref : dias) {
            // o 'aux' percorre o 'ref' nomeado acima
            for (int aux : ref) {
                System.out.println(aux);
            }
        }
    }
}
