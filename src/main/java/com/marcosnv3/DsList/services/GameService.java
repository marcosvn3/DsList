package com.marcosnv3.DsList.services;

import com.marcosnv3.DsList.dto.GameDTO;
import com.marcosnv3.DsList.dto.GameMinDTO;
import com.marcosnv3.DsList.entities.Game;
import com.marcosnv3.DsList.projections.GameMinProjection;
import com.marcosnv3.DsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Classe de serviço para a entidade Game.
 */
@Service
public class GameService {

    /**
     * Repositório de jogos injetado via Spring.
     */
    @Autowired
    private GameRepository gameRepository;

    /**
     * Método que retorna todos os jogos em forma de DTO mínima.
     * @return Lista de jogos em forma de DTO mínima.
     */
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    /**
     * Método que retorna um jogo específico por seu identificador.
     * @param id Identificador do jogo.
     * @return O jogo encontrado ou null se não encontrado.
     */
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    /**
     * Método que retorna jogos associados a uma lista específica.
     * @param listId Identificador da lista de jogos.
     * @return Lista de jogos associados à lista.
     */
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
