package my.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import my.example.demo.dao.PersonDao;
import my.example.demo.model.Person;

@Service
public class PersonService {

	private final PersonDao persondao;
	
	@Autowired
	public PersonService(@Qualifier("fakeDao") PersonDao persondao) { //@Qualifier("postgress") to use the PersonDataAccessService class instead
		this.persondao = persondao;
	}
	
	public int addPerson(Person person) {
		return persondao.insertPerson(person);
	}
	
	public List<Person> getAllPeople() {
		return persondao.selectAllPeople();
		
	}
	
	public Optional<Person> getPersonById(UUID id) {
		return persondao.selectPersonById(id);
	}
	
	public int deletePersonById(UUID id) {
		return persondao.deletePersonById(id);
	}
	
	public int updatePersonById(UUID id, Person person) {
		return persondao.updatePersonById(id, person);
	}
}
