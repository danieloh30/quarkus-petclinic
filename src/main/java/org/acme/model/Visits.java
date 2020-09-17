package org.acme.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Visits extends PanacheEntity {
  
	@Column(name = "pet_id")
	public Integer petId;

    @Column(name = "visit_date")
	// @DateTimeFormat(pattern = "yyyy-MM-dd")
	public LocalDate date;

	@NotEmpty
	public String description;
    
    public Visits() {}

}