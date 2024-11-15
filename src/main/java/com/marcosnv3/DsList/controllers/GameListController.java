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

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        GameListDTO result = gameListService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}