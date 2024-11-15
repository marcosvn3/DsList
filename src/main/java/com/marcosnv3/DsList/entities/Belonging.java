package com.marcosnv3.DsList.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

/**
 * Classe que representa a entidade Belonging.
 */
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    /**
     * Construtor padrão da classe Belonging.
     */
    public Belonging(){}

    /**
     * Construtor da classe Belonging.
     * @param game O jogo.
     * @param gameList A lista de jogos.
     * @param position A posição.
     */
    public Belonging(Game game, GameList gameList, Integer position) {
        id.setGame(game);
        id.setGameList(gameList);
        this.position = position;
    }

    /**
     * Getter para o id.
     * @return O id.
     */
    public BelongingPK getId() {
        return id;
    }

    /**
     * Setter para o id.
     * @param id O id.
     */
    public void setId(BelongingPK id) {
        this.id = id;
    }

    /**
     * Getter para a posição.
     * @return A posição.
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Setter para a posição.
     * @param position A posição.
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * Método equals.
     * @param o O objeto a ser comparado.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    /**
     * Método hashCode.
     * @return O código hash do objeto.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
