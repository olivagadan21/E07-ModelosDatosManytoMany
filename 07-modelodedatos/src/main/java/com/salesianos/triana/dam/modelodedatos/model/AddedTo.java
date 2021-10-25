package com.salesianos.triana.dam.modelodedatos.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPk id = new AddedToPk();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    private String datetime;
    private int order;

    //HELPERS
/*
    public void addToAlumno(Alumno a) {
        alumno = a;
        a.getNotas().add(this);
    }

    public void removeFromAlumno(Alumno a) {
        a.getNotas().remove(this);
        alumno = null;
    }

    public void addToAsignatura(Asignatura a) {
        asignatura = a;
        a.getNotas().add(this);
    }

    public void removeFromAsignatura(Asignatura a) {
        a.getNotas().remove(this);
        asignatura = null;
    }

    public void addAsignaturaAlumno(Asignatura asignatura, Alumno alumno) {
        addToAlumno(alumno);
        addToAsignatura(asignatura);
    }

    public void removeAsignaturaAlumno(Asignatura asignatura, Alumno alumno) {
        removeFromAlumno(alumno);
        removeFromAsignatura(asignatura);
    }
*/
}
