package com.salesianos.triana.dam.modelodedatos.service;

import com.salesianos.triana.dam.modelodedatos.model.Playlist;
import com.salesianos.triana.dam.modelodedatos.repos.PlaylistRepository;
import com.salesianos.triana.dam.modelodedatos.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist, Long, PlaylistRepository> {
}
