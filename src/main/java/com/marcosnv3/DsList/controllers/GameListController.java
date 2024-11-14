package com.marcosnv3.DsList.controllers;

/**
 * Controlador responsável por gerenciar as requisições relacionadas a listas de jogos.
 * 
 * @author Marcos Santos
 */
import com.marcosnv3.DsList.dto.GameListDTO;
import com.marcosnv3.DsList.dto.GameMinDTO;
import com.marcosnv3.DsList.services.GameListService;
import com.marcosnv3.DsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Anotação que indica que esta classe é um controlador REST.
 */
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    /**
     * Injeção de dependência do serviço de listas de jogos.
     */
    @Autowired
    private GameListService gameListService;

    /**
     * Injeção de dependência do serviço de jogos.
     */
    @Autowired
    private GameService gameService;

    /**
     * Método que lista todas as listas de jogos.
     * 
     * @return Lista de DTOs de listas de jogos.
     */
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    /**
     * Método que busca jogos por uma lista específica.
     * 
     * @param listId O ID da lista a ser buscada.
     * @return Lista de DTOs de jogos mínimos.
     */
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

}
