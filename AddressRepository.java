package net.codejava.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.Address;

public interface  AddressRepository extends JpaRepository<Address, Long> {

	void deleteById(long id);

	Object findById(long id);
	 
	}
