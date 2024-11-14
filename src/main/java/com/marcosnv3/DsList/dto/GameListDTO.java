package com.marcosnv3.DsList.dto;

import com.marcosnv3.DsList.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {}

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
