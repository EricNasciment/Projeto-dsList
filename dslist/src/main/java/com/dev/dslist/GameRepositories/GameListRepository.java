package com.dev.dslist.GameRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
