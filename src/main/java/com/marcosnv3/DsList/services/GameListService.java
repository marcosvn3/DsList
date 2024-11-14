package com.marcosnv3.DsList.services;

import com.marcosnv3.DsList.dto.GameListDTO;

import com.marcosnv3.DsList.entities.GameList;
import com.marcosnv3.DsList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Classe de serviço para a entidade GameList.
 */
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    /**
     * Método que retorna todas as listas de jogos.
     * @return Lista de todas as listas de jogos.
     */
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
