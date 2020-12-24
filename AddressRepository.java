package net.codejava;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  AddressRepository extends JpaRepository<Address, Long> {

	void deleteById(long id);

	Object findById(long id);
	 
	}
