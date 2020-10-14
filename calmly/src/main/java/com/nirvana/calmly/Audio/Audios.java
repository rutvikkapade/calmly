package com.nirvana.calmly.Audio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Audios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String category;
    private String audioApi;


    public Audios(String title, String category, String audioApi) {
        super();
        this.title = title;
        this.category = category;
        this.audioApi = audioApi;
    }
    public Audios(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAudioApi() {
        return audioApi;
    }

    public void setAudioApi(String audioApi) {
        this.audioApi = audioApi;
    }
}
