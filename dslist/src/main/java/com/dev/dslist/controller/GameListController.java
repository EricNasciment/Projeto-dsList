package com.dev.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dslist.DTO.GameListDTO;
import com.dev.dslist.DTO.GameMinDTO;
import com.dev.dslist.service.GameListService;
import com.dev.dslist.service.GameService;

@RestController
@RequestMapping(value = "/list")
		
public class GameListController {

	@Autowired
  private GameService gameService;
	
	@Autowired
  private GameListService gameListService;

	@GetMapping
  public List<GameListDTO> findAll() {
	  
	 List<GameListDTO> result = gameListService.findAll();
	 return result;
	  
  }
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findGames(@PathVariable Long listId){
		return  gameService.findByGameList(listId);
	
	}


}
