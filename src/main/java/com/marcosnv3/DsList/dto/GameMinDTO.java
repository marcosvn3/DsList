package com.marcosnv3.DsList.dto;

import com.marcosnv3.DsList.entities.Game;
import com.marcosnv3.DsList.projections.GameMinProjection;

/**
 * DTO para representação mínima de jogos.
 */
public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    /**
     * Construtor padrão.
     */
    public GameMinDTO() {}

    /**
     * Construtor que recebe uma entidade Game e copia suas propriedades para o DTO.
     * @param entityGame Entidade Game a ser convertida.
     */
    public GameMinDTO(Game entityGame) {
        this.id = entityGame.getId();
        this.title = entityGame.getTitle();
        this.year = entityGame.getYear();
        this.imgUrl = entityGame.getImgUrl();
        this.shortDescription = entityGame.getShortDescription();
    }

    /**
     * Construtor que recebe uma projeção GameMinProjection e copia suas propriedades para o DTO.
     * @param entityGame Projeção GameMinProjection a ser convertida.
     */
    public GameMinDTO(GameMinProjection entityGame) {
        this.id = entityGame.getId();
        this.title = entityGame.getTitle();
        this.year = entityGame.getYear();
        this.imgUrl = entityGame.getImgUrl();
        this.shortDescription = entityGame.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }


}
