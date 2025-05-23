package com.gamesestudo.gamelist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamesestudo.gamelist.dto.GameListDTO;
import com.gamesestudo.gamelist.entities.GameList;
import com.gamesestudo.gamelist.repositories.GameListRepository;


@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = repository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
