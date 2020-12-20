package com.myaudiolibrary.web.model;

import javax.persistence.Entity;

@Entity
public class Artist {


    private Long ArtistId;
    private String Name;

    public Long getArtistId() {
        return ArtistId;
    }

    public void setArtistId(Long artistId) {
        ArtistId = artistId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "ArtistId=" + ArtistId +
                ", Name='" + Name + '\'' +
                '}';
    }
}
