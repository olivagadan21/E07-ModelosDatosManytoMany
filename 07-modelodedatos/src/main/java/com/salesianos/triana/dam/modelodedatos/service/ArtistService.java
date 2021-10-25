package com.salesianos.triana.dam.modelodedatos.service;

import com.salesianos.triana.dam.modelodedatos.model.Artist;
import com.salesianos.triana.dam.modelodedatos.repos.ArtistRepository;
import com.salesianos.triana.dam.modelodedatos.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist, Long, ArtistRepository> {
}
