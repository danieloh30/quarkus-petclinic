package org.acme.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@MappedSuperclass
public class Person extends PanacheEntity {

	@Column(name = "first_name")
	@NotEmpty
	public String firstName;

	@Column(name = "last_name")
	@NotEmpty
	public String lastName;

	public Person() {}

}
