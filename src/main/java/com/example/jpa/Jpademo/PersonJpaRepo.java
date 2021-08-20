package com.example.jpa.Jpademo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


//repository
//Transcation management//insert update delete it becomes import
// whenever there are 3-4 steps or updates transcations are important
//either all fail or all successful
@Repository
@Transactional
public class PersonJpaRepo {
	//all operations performed into a particular session are stored inside your entity manager
	//all operations are stored in persistence context which is the interface of entity manager
	@PersistenceContext
	EntityManager entityManager;
	
	//connect to database
	//JPQL
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery=entityManager.createNamedQuery("find_all_persons",Person.class);
		return namedQuery.getResultList();
		
		
		
	}
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
		
	}

	// if you want update or insert you have to use entityManager.merge
	public Person update(Person person) {
		return entityManager.merge(person);
		
	}
	public Person insert(Person person) {
		return entityManager.merge(person);
		
	}
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
		
	}
public Person findById(int id) {
		return entityManager.find(Person.class, id);
		
	}

	public void deleteById(int id) {
		Person person=findById(id);
		 entityManager.remove(person);
		
	}
	
}
