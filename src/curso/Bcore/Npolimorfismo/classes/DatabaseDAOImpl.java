package curso.Bcore.Npolimorfismo.classes;

//Aula 66 - polimorfismo com interface
public class DatabaseDAOImpl implements GenericDAO{
    @Override
    public void save(){
        System.out.println("Dentro do Database DAO");
    }
    
}
