package com.salesianos.triana.dam.modelodedatos.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title, album, year;

    @ManyToOne
    private Artist artista;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Playlist> playlists = new ArrayList<>();

}
