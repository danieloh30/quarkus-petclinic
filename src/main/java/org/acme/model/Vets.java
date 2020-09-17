package org.acme.model;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Cacheable
public class Vets extends Person {

	@ManyToMany
	@JoinTable(
		name = "vet_Specialties",
		joinColumns = @JoinColumn(name = "vet_id"), 
  		inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    public List<Specialties> specialties;
	
	public Vets() {}

}
