package my.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import my.example.demo.model.Person;

public interface PersonDao {
	
int insertPerson(UUID id, Person name);
	
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}
	
	List<Person> selectAllPeople();
	
	Optional<Person> selectPersonById(UUID id);
	
	int deletePersonById(UUID id);
	
	int updatePersonById(UUID id, Person person);
	
}
