package com.dev.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dslist.DTO.GameListDTO;
import com.dev.dslist.GameRepositories.GameListRepository;
import com.dev.dslist.entities.GameList;

@Service
public class GameListService {
	
	@Autowired
  private GameListRepository gameListRepository;
	
	public List<GameListDTO> findAll(){
		
	List<GameList> result = gameListRepository.findAll();
	List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
	return dto;
	
	}
	
	
	

}
