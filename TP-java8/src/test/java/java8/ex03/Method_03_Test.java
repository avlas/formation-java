package java8.ex03;

import java.util.List;

import org.junit.Test;

import java8.data.Data;
import java8.data.Person;

/**
 * Exercice 03 - Méthode statique
 */
public class Method_03_Test {

    // tag::IDao[]
    interface IDao {
        List<Person> findAll();

        // TODO créer une méthode statique IDao getDefaultInstance()
        // TODO cette méthode retourne une instance de la classe DaoA
    }
    // end::IDao[]

    class DaoA implements IDao {

        List<Person> people = Data.buildPersonList(20);

        @Override
        public List<Person> findAll() {
            return people;
        }

    }

    @Test
    public void test_getDefaultInstance() throws Exception {
        // TODO invoquer la méthode getDefaultInstance() pour que le test soit passant
        IDao result = null;

        assert result.findAll().size() == 20;
    }
}
