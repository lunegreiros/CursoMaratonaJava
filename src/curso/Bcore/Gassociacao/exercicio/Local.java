/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Bcore.Gassociacao.exercicio;

/**
 *
 * @author Visitante
 */
public class Local {

    private String rua;
    private String bairro;

    // os CONSTRUTORES com todos os atributos e um vazio
    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local() {
    }
    
    // METODO para print
    public void print(){
        System.out.println(this.rua);
        System.out.println(this.bairro);
    }

    //METODOS set e get
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
