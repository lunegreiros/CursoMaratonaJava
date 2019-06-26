package curso.Bcore.Npolimorfismo.classes;

//Aula 66 - polimorfimsom com interface
public class ArquivoDAOImpl implements GenericDAO{

    @Override
    public void save() {
        System.out.println("Dentro dos Arquivos DAO");
    }
    
}
