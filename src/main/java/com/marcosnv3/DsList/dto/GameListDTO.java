package com.marcosnv3.DsList.dto;

import com.marcosnv3.DsList.entities.GameList;

/**
 * DTO para representação de listas de jogos.
 */
public class GameListDTO {

    private Long id;
    private String name;

    /**
     * Construtor padrão.
     */
    public GameListDTO() {}

    /**
     * Construtor que recebe uma entidade GameList e copia suas propriedades para o DTO.
     * @param gamelist Entidade GameList a ser convertida.
     */
    public GameListDTO(GameList gamelist) {
        this.id = gamelist.getId();
        this.name = gamelist.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
