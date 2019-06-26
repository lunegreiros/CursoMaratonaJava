/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.DsobrecargaConstrutores.teste;

import curso.Bcore.DsobrecargaConstrutores.classes.Estudante;

/**
 *
 * @author Visitante
 */
public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante aluno = new Estudante
        ("23456", "Marcos Eugenio", new double[]{7,9,10}, "1 3/07/1978");
        
        // chamar METODO imprime
        aluno.imprime();
    }
}
