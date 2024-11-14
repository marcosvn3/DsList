package com.marcosnv3.DsList.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

/**
 * Entidade que representa uma lista de jogos.
 */
@Entity
@Table(name = "tb_game_list")
public class GameList {

    /**
     * Identificador único da lista de jogos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome da lista de jogos.
     */
    private String name;

    /**
     * Construtor padrão.
     */
    public GameList() {}

    /**
     * Construtor que inicializa os atributos.
     * @param id Identificador único da lista de jogos.
     * @param name Nome da lista de jogos.
     */
    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getter para o identificador único.
     * @return Identificador único da lista de jogos.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter para o identificador único.
     * @param id Identificador único da lista de jogos.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter para o nome.
     * @return Nome da lista de jogos.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter para o nome.
     * @param name Nome da lista de jogos.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(id, gameList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
