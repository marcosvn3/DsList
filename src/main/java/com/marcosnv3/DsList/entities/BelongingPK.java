package com.marcosnv3.DsList.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

/**
 * Classe que representa a chave composta para a entidade Belonging.
 */
@Embeddable
public class BelongingPK {

    /**
     * Atributo que representa o jogo.
     */
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    /**
     * Atributo que representa a lista de jogos.
     */
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    /**
     * Construtor padrão.
     */
    public BelongingPK() {}

    /**
     * Construtor que inicializa os atributos.
     * @param game O jogo.
     * @param gameList A lista de jogos.
     */
    public BelongingPK(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }

    /**
     * Getter para o jogo.
     * @return O jogo.
     */
    public Game getGame() {
        return game;
    }

    /**
     * Setter para o jogo.
     * @param game O jogo.
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * Getter para a lista de jogos.
     * @return A lista de jogos.
     */
    public GameList getGameList() {
        return gameList;
    }

    /**
     * Setter para a lista de jogos.
     * @param gameList A lista de jogos.
     */
    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    /**
     * Método que compara a igualdade com outro objeto.
     * @param o O objeto a ser comparado.
     * @return Verdadeiro se os objetos forem iguais, falso caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(gameList, that.gameList);
    }

    /**
     * Método que gera o código hash.
     * @return O código hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(game, gameList);
    }
}
