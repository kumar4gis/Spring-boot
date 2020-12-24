package net.codejava;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  PersonRepository extends JpaRepository<Person, Long> {

	void deleteById(long id);

	Object findById(long id);
	 
	}
