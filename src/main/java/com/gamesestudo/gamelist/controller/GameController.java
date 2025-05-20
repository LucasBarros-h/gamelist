package com.gamesestudo.gamelist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamesestudo.gamelist.dto.GameMinDto;
import com.gamesestudo.gamelist.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = service.findAll();
        return result;
    }

}
