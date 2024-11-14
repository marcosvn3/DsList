package com.marcosnv3.DsList.projections;

/**
 * Interface que representa a projeção mínima de um jogo.
 */
public interface GameMinProjection {
    /**
     * Getter para o identificador único do jogo.
     * @return O identificador único do jogo.
     */
    Long getId();

    /**
     * Getter para o título do jogo.
     * @return O título do jogo.
     */
    String getTitle();

    /**
     * Getter para o ano de lançamento do jogo.
     * @return O ano de lançamento do jogo.
     */
    Integer getGameYear();

    /**
     * Getter para a URL da imagem do jogo.
     * @return A URL da imagem do jogo.
     */
    String getImgUrl();

    /**
     * Getter para a descrição curta do jogo.
     * @return A descrição curta do jogo.
     */
    String getShortDescription();

    /**
     * Getter para a posição do jogo na lista.
     * @return A posição do jogo na lista.
     */
    Integer getPosition();

}
