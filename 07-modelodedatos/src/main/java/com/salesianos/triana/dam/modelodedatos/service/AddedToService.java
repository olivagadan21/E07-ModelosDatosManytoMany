package com.salesianos.triana.dam.modelodedatos.service;
import com.salesianos.triana.dam.modelodedatos.model.AddedTo;
import com.salesianos.triana.dam.modelodedatos.model.AddedToPk;
import com.salesianos.triana.dam.modelodedatos.model.Playlist;
import com.salesianos.triana.dam.modelodedatos.model.Song;
import com.salesianos.triana.dam.modelodedatos.repos.AddedToRepository;
import com.salesianos.triana.dam.modelodedatos.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService extends BaseService<AddedTo, AddedToPk, AddedToRepository> {

    public Song addSongToPlaylist(Song s, Playlist p) {

        p.getSongs().forEach(a -> {
            AddedTo added = AddedTo.builder()
                    .playlist(p)
                    .song(s)
                    .build();
            save(added);
        });

        return s;

    }

}
