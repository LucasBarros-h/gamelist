package com.gamesestudo.gamelist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesestudo.gamelist.dto.GameMinDto;
import com.gamesestudo.gamelist.entities.Game;
import com.gamesestudo.gamelist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDto> findAll(){
        List<Game> result =  repository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }

}
