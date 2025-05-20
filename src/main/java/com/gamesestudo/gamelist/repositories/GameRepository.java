package com.gamesestudo.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesestudo.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
