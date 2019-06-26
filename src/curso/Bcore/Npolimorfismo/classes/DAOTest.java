package curso.Bcore.Npolimorfismo.classes;
// Aula 66 - polimorfimsmo com interface
public class DAOTest {
    public static void main(String[] args) {
        
        GenericDAO genDAO = new ArquivoDAOImpl();
        genDAO.save();
    }
}
