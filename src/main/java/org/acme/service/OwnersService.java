package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.model.Owners;

import io.quarkus.panache.common.Sort;

@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OwnersService {
   
    public List<Owners> getAll() {
        return Owners.listAll();
    }

    public List<Owners> findByLastName(String lastName) {

        if (lastName != null && !lastName.isEmpty()) {
            Sort sort = Sort.ascending("owner.firstName");
            return Owners.find("SELECT DISTINCT owner FROM Owners owner left join fetch owner.pets where LOWER(owner.lastName) LIKE LOWER(?1)", sort, "%" + lastName + "%").list();
        } else {
            return Owners.listAll();
        }        
 
    }
}
