package com.salesianos.triana.dam.modelodedatos;

import com.salesianos.triana.dam.modelodedatos.model.Artist;
import com.salesianos.triana.dam.modelodedatos.model.Playlist;
import com.salesianos.triana.dam.modelodedatos.model.Song;
import com.salesianos.triana.dam.modelodedatos.service.AddedToService;
import com.salesianos.triana.dam.modelodedatos.service.ArtistService;
import com.salesianos.triana.dam.modelodedatos.service.PlaylistService;
import com.salesianos.triana.dam.modelodedatos.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainPruebas {

    private final SongService songService;
    private final PlaylistService playlistService;
    private final ArtistService artistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void test() {

        Artist artist = Artist.builder()
                .name("J Balvin")
                .build();
        artistService.save(artist);

        List<Song> songs = List.of(
                Song.builder().title("Rojo").album("Colores").year("2020").build(),
                Song.builder().title("Morado").album("Colores").year("2020").build(),
                Song.builder().title("Negro").album("Colores").year("2020").build(),
                Song.builder().title("Rosa").album("Colores").year("2020").build()
        );

        songService.saveAll(songs);

        for (int i = 0; i < songs.size(); i++) {
            songs.get(i).addToSong(songs, artist);
        }

        Playlist playlist = Playlist.builder()
                .name("Reggaeton")
                .description("Playlist de reggaeton")
                .build();

        for (int i = 0; i < songs.size(); i++) {
            addedToService.addSongToPlaylist(songs.get(i));
        }

        playlistService.save(playlist);

    }

}
