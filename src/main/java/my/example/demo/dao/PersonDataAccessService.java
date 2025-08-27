package my.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import my.example.demo.model.Person;

@Repository("postgress")
public class PersonDataAccessService implements PersonDao{

	@Override
	public int insertPerson(UUID id, Person name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Person> selectAllPeople() {
		// TODO Auto-generated method stub
		return List.of(new Person(UUID.randomUUID(), "FROM POSTGRESS DB"));
	}

	@Override
	public Optional<Person> selectPersonById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int deletePersonById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePersonById(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

}
