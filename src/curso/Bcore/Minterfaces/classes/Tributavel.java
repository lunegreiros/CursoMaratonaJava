package curso.Bcore.Minterfaces.classes;

//
public interface Tributavel {
    // todos atributos sao PUBLIC STATIC FINAL
    public static final double IMPOSTO = 0.2;
    
    // todos os METODOS da INTERFACE SAO ABSTRACT, como abaixo:
    // portanto 'public abstract' aqui e redundante, pode ou nao aparecer
    // lembrando: se for ABSTRACT  nao tem codigo em { ... }
    public abstract void calcularImposto();
}
