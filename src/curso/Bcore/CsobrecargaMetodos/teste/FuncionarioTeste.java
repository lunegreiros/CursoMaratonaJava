/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.CsobrecargaMetodos.teste;

import curso.Bcore.CsobrecargaMetodos.classes.Funcionario;

/**
 *
 * @author Visitante
 */
//Aula 38 - sobrecarga de metodos
//Aula 39 - construtor e sobrecarga de construtor
public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario emp = new Funcionario
        ("Maria", "23.456.789-0", 2340, "4567.678-10");//emp = empregado
        Funcionario emp2 = new Funcionario();

        // inicializar os atributos pelo METODO
        emp.setNome("Maria de Lurdes");
        emp.setCpf("23.456.789-34");
        emp.setSalario(2400);

        emp.imprimir();
        emp2.imprimir();
    }

}
