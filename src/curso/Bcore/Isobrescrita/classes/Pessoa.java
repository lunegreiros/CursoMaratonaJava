package curso.Bcore.Isobrescrita.classes;
//Aula 55 - sobrescrita de METODOS
public class Pessoa {
    private String nome;
    private int idade;

    // sobrescrita do METODO toString da SUPERCLASSE OBJECT
    @Override
    public String toString() {
        return "nome = " + nome + ", idade = " + idade;
    }
    
    
    //METODO get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
