package com.marcosnv3.DsList.controllers;

/**
 * Controlador responsável por gerenciar as requisições relacionadas a listas de jogos.
 * 
 * @author Marcos Santos
 */
import com.marcosnv3.DsList.dto.GameListDTO;
import com.marcosnv3.DsList.dto.ReplacementDTO;
import com.marcosnv3.DsList.services.GameListService;
import com.marcosnv3.DsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Anotação que indica que esta classe é um controlador REST.
 */
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    /**
     * Injeção de dependência para o serviço de lista de jogos.
     */
    @Autowired
    private GameListService gameListService;

    /**
     * Injeção de dependência para o serviço de jogos.
     */
    @Autowired
    private GameService gameService;

    /**
     * Método para buscar uma lista de jogos por seu identificador.
     * 
     * @param id Identificador da lista de jogos.
     * @return DTO da lista de jogos encontrada.
     */
    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        GameListDTO result = gameListService.findById(id);
        return result;
    }

    /**
     * Método para buscar todas as listas de jogos.
     * 
     * @return Lista de DTOs de listas de jogos.
     */
    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    /**
     * Método para realizar a movimentação de jogos dentro de uma lista.
     * 
     * @param listId Identificador da lista de jogos.
     * @param body DTO contendo os índices de origem e destino.
     */
    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}