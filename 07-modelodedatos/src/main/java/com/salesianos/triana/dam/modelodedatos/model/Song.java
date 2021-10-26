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

    @OneToMany( mappedBy = "song", fetch = FetchType.EAGER)
    private List<AddedTo> addedToList = new ArrayList<>();

    public void addToSong(List<Song> s, Artist a) {
        for (int i = 0; i < s.size(); i++) {
            setArtista(a);
        }
    }

}
