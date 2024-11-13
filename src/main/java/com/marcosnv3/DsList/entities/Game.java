package com.marcosnv3.DsList.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "game_year")
    private Integer year;

    private Double score;

    private String genre;

    private String platforms;

    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game(){

    }

    public Game(String title, Integer year, String genre, String platforms, Double score,
                String imgUrl, String shortDescription, String longDescription, Long id) {

        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titulo) {
        this.title = titulo;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer ano) {
        this.year = ano;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genero) {
        this.genre = genero;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String plataforma) {
        this.platforms = plataforma;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgURL) {
        this.imgUrl = imgURL;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String descricaoCurta) {
        this.shortDescription = descricaoCurta;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String descricaoLonga) {
        this.longDescription = descricaoLonga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id) && Objects.equals(title, game.title) && Objects.equals(year, game.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year);
    }
}
