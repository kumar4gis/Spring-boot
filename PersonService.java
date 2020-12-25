package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.Person;
import net.codejava.respository.PersonRepository;

public class PersonService {

	@Autowired
    private PersonRepository repo;
     
    public List<Person> listAll() {
        return repo.findAll();
    }
     
    public void save(Person person) {
        repo.save(person);
    }
     
    public Object get(long id) {
        return repo.findById(id);
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
