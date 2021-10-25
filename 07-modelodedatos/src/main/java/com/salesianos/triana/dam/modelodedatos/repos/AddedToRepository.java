package com.salesianos.triana.dam.modelodedatos.repos;

import com.salesianos.triana.dam.modelodedatos.model.AddedTo;
import com.salesianos.triana.dam.modelodedatos.model.AddedToPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPk> {
}
