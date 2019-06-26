package curso.Bcore.Kenum.classes;

//Aula 57 - Enumeracoes
public enum TipoCliente {
    // TODOS os atributos daqui serao considerados CONSTANTES (final)
    PESSOA_FISICA(1), PESSO_JURIDICA(2);
    
    // os atributos podem ser inseridos dentro de um ENUM
    // mas deve vir depois dos ENUMERADORES na primeira linha
    private int tipo;
    private TipoCliente(int tipo) {
        this.tipo = tipo;
    }
    
    //METODO get
    public int getTipo() {
        return tipo;
    }
    
}
