package my.example.demo.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.example.demo.model.Person;
import my.example.demo.service.PersonService;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

	private final PersonService personservice;
	
	@Autowired
	public PersonController(PersonService personservice) {
		this.personservice = personservice;
	}
	
	@PostMapping
	public void addPerson(@RequestBody Person person) {
		personservice.addPerson(person);
	}
	
	@GetMapping
	public List<Person> getAllPeople(){
		return personservice.getAllPeople();
	}
	
	@GetMapping(path = "{id}")
	public Person getPersonById(@PathVariable("id") UUID id) {
		return personservice.getPersonById(id).orElse(null);
	}
	
	@DeleteMapping(path = "{id}")
	public void deletePersonById(@PathVariable("id") UUID id) {
		personservice.deletePersonById(id);
	}
	
	@PutMapping(path = "{id}")
	public int updatePersonById(@PathVariable("id") UUID id, @RequestBody Person person) {
		return personservice.updatePersonById(id, person);
	}
}
