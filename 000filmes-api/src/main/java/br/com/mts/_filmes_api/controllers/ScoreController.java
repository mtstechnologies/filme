package br.com.mts._filmes_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mts._filmes_api.dto.MovieDTO;
import br.com.mts._filmes_api.dto.ScoreDTO;
import br.com.mts._filmes_api.service.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;

	@PutMapping
	public MovieDTO salvar(@RequestBody ScoreDTO dto){
		MovieDTO movieDTO = scoreService.salvarScore(dto);
		return movieDTO;
	}
}
