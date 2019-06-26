/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.EblocoInicializa.classes;

/**
 *
 * @author Visitante
 */
//Aula 41 - bloco de inicializacao
public class Cliente {

    // 1 - alocado espaco na memoria para o obj que sera criado
    // 2 - cada atributo eh inicializado com valorp adrao ou explicito
    // 3 - bloco de inicializacao eh excutado
    // 4 - o construtor eh executado
    private int[] parcelas;

    // como criar um bloco de inicializacao
    {
        parcelas = new int[10];
        System.out.println("dentro do bloco de inicializacao");
        for (int i = 1; i <= 10; i++) {
            parcelas[i-1] = i;
        }
    }

    // construtor padrao
    public Cliente() {
    }

    // METODOS get e set
    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

}
