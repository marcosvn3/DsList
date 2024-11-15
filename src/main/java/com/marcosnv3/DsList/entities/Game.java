package com.marcosnv3.DsList.entities;


import jakarta.persistence.*;

import java.util.Objects;

/**
 * Entidade que representa um jogo.
 */
@Entity
@Table(name = "tb_game")
public class Game {

    /**
     * Identificador único do jogo.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Título do jogo.
     */
    private String title;

    /**
     * Ano de lançamento do jogo.
     */
    @Column(name = "game_year")
    private Integer year;

    /**
     * Pontuação do jogo.
     */
    private Double score;

    /**
     * Gênero do jogo.
     */
    private String genre;

    /**
     * Plataformas em que o jogo está disponível.
     */
    private String platforms;

    /**
     * URL da imagem do jogo.
     */
    private String imgUrl;

    /**
     * Descrição curta do jogo.
     */
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    /**
     * Descrição longa do jogo.
     */
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    /**
     * Construtor padrão.
     */
    public Game(){

    }

    /**
     * Construtor que inicializa os atributos.
     * @param title Título do jogo.
     * @param year Ano de lançamento do jogo.
     * @param genre Gênero do jogo.
     * @param platforms Plataformas em que o jogo está disponível.
     * @param score Pontuação do jogo.
     * @param imgUrl URL da imagem do jogo.
     * @param shortDescription Descrição curta do jogo.
     * @param longDescription Descrição longa do jogo.
     * @param id Identificador único do jogo.
     */
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


    /**
     * Retorna o identificador único do jogo.
     * @return Identificador único do jogo.
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o identificador único do jogo.
     * @param id Identificador único do jogo.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retorna o título do jogo.
     * @return Título do jogo.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o título do jogo.
     * @param titulo Título do jogo.
     */
    public void setTitle(String titulo) {
        this.title = titulo;
    }

    /**
     * Retorna a pontuação do jogo.
     * @return Pontuação do jogo.
     */
    public Double getScore() {
        return score;
    }

    /**
     * Define a pontuação do jogo.
     * @param score Pontuação do jogo.
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * Retorna o ano de lançamento do jogo.
     * @return Ano de lançamento do jogo.
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Define o ano de lançamento do jogo.
     * @param ano Ano de lançamento do jogo.
     */
    public void setYear(Integer ano) {
        this.year = ano;
    }

    /**
     * Retorna o gênero do jogo.
     * @return Gênero do jogo.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Define o gênero do jogo.
     * @param genero Gênero do jogo.
     */
    public void setGenre(String genero) {
        this.genre = genero;
    }

    /**
     * Retorna as plataformas em que o jogo está disponível.
     * @return Plataformas em que o jogo está disponível.
     */
    public String getPlatforms() {
        return platforms;
    }

    /**
     * Define as plataformas em que o jogo está disponível.
     * @param plataforma Plataformas em que o jogo está disponível.
     */
    public void setPlatforms(String plataforma) {
        this.platforms = plataforma;
    }

    /**
     * Retorna a URL da imagem do jogo.
     * @return URL da imagem do jogo.
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * Define a URL da imagem do jogo.
     * @param imgURL URL da imagem do jogo.
     */
    public void setImgUrl(String imgURL) {
        this.imgUrl = imgURL;
    }

    /**
     * Retorna a descrição curta do jogo.
     * @return Descrição curta do jogo.
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Define a descrição curta do jogo.
     * @param descricaoCurta Descrição curta do jogo.
     */
    public void setShortDescription(String descricaoCurta) {
        this.shortDescription = descricaoCurta;
    }

    /**
     * Retorna a descrição longa do jogo.
     * @return Descrição longa do jogo.
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Define a descrição longa do jogo.
     * @param descricaoLonga Descrição longa do jogo.
     */
    public void setLongDescription(String descricaoLonga) {
        this.longDescription = descricaoLonga;
    }

    /**
     * Verifica se o objeto é igual a outro.
     * @param o Outro objeto a ser comparado.
     * @return Verdadeiro se os objetos forem iguais, falso caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id) && Objects.equals(title, game.title) && Objects.equals(year, game.year);
    }

    /**
     * Retorna o código hash do objeto.
     * @return Código hash do objeto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, title, year);
    }
}
