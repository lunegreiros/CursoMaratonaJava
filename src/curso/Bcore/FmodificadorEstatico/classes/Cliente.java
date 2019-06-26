/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.FmodificadorEstatico.classes;

/**
 *
 * @author Visitante
 */
//Aula 44 - bloco de inicializacao static
public class Cliente {
    // 0 - bloco de inicializacao STATIC eh executado uma UNICA vez
    // 1 - alocado espaco na memoria para o obj que sera criado
    // 2 - cada atributo eh inicializado com valorp adrao ou explicito
    // 3 - bloco de inicializacao eh excutado
    // 4 - o construtor eh executado
    private static int[] parcelas;

    // como criar um bloco de inicializacao STATIC
    static {
        parcelas = new int[10];
        System.out.println("Primeiro bloco de inicializacao STATIC");
        for (int i = 1; i <= 10; i++) {
            parcelas[i-1] = i;
        }
    }
static {
    System.out.println("Segundo bloco de inicializacao STATIC");
}

    // construtor padrao
    public Cliente() {
    }

    // METODOS get e set
    public static int[] getParcelas() {
        return parcelas;
    }

}
