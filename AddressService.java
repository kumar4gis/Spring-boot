package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.Address;
import net.codejava.respository.AddressRepository;

public class AddressService {

	@Autowired
    private AddressRepository repo;
     
    public List<Address> listAll() {
        return repo.findAll();
    }
     
    public void save(Address address) {
        repo.save(address);
    }
     
    public Object get(long id) {
        return repo.findById(id);
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
