package org.acme.model;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity(name = "types")
@Cacheable
public class PetType extends PanacheEntity {
  
    public String name;
    public PetType() {}
    
}