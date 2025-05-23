package com.gamesestudo.gamelist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamesestudo.gamelist.dto.GameDTO;
import com.gamesestudo.gamelist.dto.GameMinDto;
import com.gamesestudo.gamelist.entities.Game;
import com.gamesestudo.gamelist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = repository.findById(id).orElseThrow(() -> new RuntimeException("Game não encontrado por pelo id: " + id));
        return new GameDTO(result); 
    }

    public List<GameMinDto> findAll(){
        List<Game> result =  repository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }

}
