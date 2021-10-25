package com.salesianos.triana.dam.modelodedatos.repos;

import com.salesianos.triana.dam.modelodedatos.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
