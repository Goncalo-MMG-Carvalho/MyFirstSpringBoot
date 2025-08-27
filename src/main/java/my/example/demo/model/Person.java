package my.example.demo.model;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	
	private final UUID id;
	
	@NotBlank
	private final String name; 
	
	public Person(	@JsonProperty("id") UUID id,
					@JsonProperty("name") String name) {
		
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public UUID getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o == null)
			return false;
		
		if(!(o instanceof Person))
			return false;
		
		Person other = (Person) o;
		
		return this.id.equals(other.getId());
	}
}
