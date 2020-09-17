package org.acme.model;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;

@Entity
@Cacheable
public class Owners extends Person {
  
    public String address;
    public String city;

    @NotEmpty
	@Digits(fraction = 0, integer = 10)
    public String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owners")
	private List<Pets> pets;

    public Owners() {}

}