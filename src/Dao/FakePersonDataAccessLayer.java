package Dao;

import Model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessLayer implements PersonDao {
    private static List<Person> Db = new ArrayList();
    @Override
    public int insertPerson(UUID id, Person person) {
         Db.add(new Person(id, person.getName()));
         return 1;
    }
}
