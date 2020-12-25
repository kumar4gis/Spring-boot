package net.codejava.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.Person;

public interface  PersonRepository extends JpaRepository<Person, Long> {

	void deleteById(long id);

	Object findById(long id);
	 
	}
