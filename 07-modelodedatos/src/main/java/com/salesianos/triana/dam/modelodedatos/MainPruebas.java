package com.salesianos.triana.dam.modelodedatos;

import com.salesianos.triana.dam.modelodedatos.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainPruebas {

    private final SongService songService;

}
