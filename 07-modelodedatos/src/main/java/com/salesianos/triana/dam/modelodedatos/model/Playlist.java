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
public class Playlist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Lob
    private String description;

    @Builder.Default
    @ManyToMany(mappedBy = "playlists",fetch = FetchType.EAGER)
    private List<Song> songs = new ArrayList<>();

}
