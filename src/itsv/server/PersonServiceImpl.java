package itsv.server;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class PersonServiceImpl implements PersonService 
{
    private static Map<Integer,Person> persons;

    public PersonServiceImpl() {
        if (persons == null)
            persons = new HashMap<Integer,Person>();
    }
    @Override
    public boolean addPerson(Person p) {
        if (persons.get(p.getId()) != null)
            return false;
        persons.put(p.getId(), p);
        return true;
    }
    @Override
    public boolean deletePerson(int id) {
        if (persons.get(id) == null)
            return false;
        persons.remove(id);
        return true;
    }
    @Override
    public Person getPerson(int id) {
        return persons.get(id);
    }
    @Override
    public Person[] getPersons() {
        Set<Integer> ids = persons.keySet();
        Person[] p = new Person[ids.size()];
        int i = 0;
        for(Integer id : ids){
            p[i] = persons.get(id);
            i++;
        }
        return p;
    }
}