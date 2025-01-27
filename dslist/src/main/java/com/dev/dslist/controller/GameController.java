package com.dev.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dslist.DTO.GameDTO;
import com.dev.dslist.DTO.GameMinDTO;
import com.dev.dslist.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	
	
	
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	
    @GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameService.findById(id);
		return result;
	}
	
}
