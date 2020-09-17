package org.acme.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Pets extends PanacheEntity {
  
	public String name;
	
    @Column(name = "birth_date")
	// @DateTimeFormat(pattern = "yyyy-MM-dd")
	public LocalDate birthDate;

	@ManyToOne
	@JoinColumn(name = "type_id")
	public PetType type;

	@ManyToOne
	@JoinColumn(name = "owner_id")
	public Owners owners;

	@Transient
	public List<Visits> visits;
    
    public Pets() {}

}