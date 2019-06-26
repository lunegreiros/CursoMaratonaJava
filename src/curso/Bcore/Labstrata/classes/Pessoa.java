package curso.Bcore.Labstrata.classes;

//
public abstract class Pessoa {
    protected String nome;
    
    //METODO ABSTRACT = sem codigo { ... }
    public abstract void print();
    
    //METODOS get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
