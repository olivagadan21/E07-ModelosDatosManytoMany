package com.salesianos.triana.dam.modelodedatos.service;

import com.salesianos.triana.dam.modelodedatos.model.Song;
import com.salesianos.triana.dam.modelodedatos.repos.SongRepository;
import com.salesianos.triana.dam.modelodedatos.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
