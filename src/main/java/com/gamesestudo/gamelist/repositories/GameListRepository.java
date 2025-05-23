package com.gamesestudo.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesestudo.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
