package org.acme.model;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Specialties extends PanacheEntity {
  
    public String name;

    @ManyToMany(mappedBy = "specialties")
    public List<Vets> vets;

    public Specialties() {}

}