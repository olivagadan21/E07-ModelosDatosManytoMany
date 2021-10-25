package com.salesianos.triana.dam.modelodedatos.repos;

import com.salesianos.triana.dam.modelodedatos.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
