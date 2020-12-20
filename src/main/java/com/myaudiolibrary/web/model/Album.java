package com.myaudiolibrary.web.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Album {


    private Long AlbumId;
    private String Title;
    private Long ArtistId;




    public Long getAlbumId() {
        return AlbumId;
    }

    public void setAlbumId(Long albumId) {
        AlbumId = albumId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Long getArtistId() {
        return ArtistId;
    }

    public void setArtistId(Long artistId) {
        ArtistId = artistId;
    }

    @Override
    public String toString() {
        return "Album{" +
                "AlbumId=" + AlbumId +
                ", Title='" + Title + '\'' +
                ", ArtistId=" + ArtistId +
                '}';
    }
}
