package net.codejava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	 private Long id;
	    private String firstName;
	    private String lastName;
	    
	    public Person()
	    {
	    	
	    }
		public Person(Long id, String firstName, String lastName) {
			this.id=id;
			this.firstName=firstName;
			this.lastName=lastName;
			// TODO Auto-generated constructor stub
		}
		/**
		 * @return the id
		 */

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}
		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}
	   
}
