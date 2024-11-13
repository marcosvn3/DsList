package com.marcosnv3.DsList.services;

import com.marcosnv3.DsList.dto.GameMinDTO;
import com.marcosnv3.DsList.entities.Game;
import com.marcosnv3.DsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
