package com.salesianos.triana.dam.modelodedatos.repos;

import com.salesianos.triana.dam.modelodedatos.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
