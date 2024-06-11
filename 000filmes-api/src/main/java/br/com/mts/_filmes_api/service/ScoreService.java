package br.com.mts._filmes_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.mts._filmes_api.dto.MovieDTO;
import br.com.mts._filmes_api.dto.ScoreDTO;
import br.com.mts._filmes_api.entities.Movie;
import br.com.mts._filmes_api.entities.Score;
import br.com.mts._filmes_api.entities.UserMovie;
import br.com.mts._filmes_api.repository.MovieRepository;
import br.com.mts._filmes_api.repository.ScoreRepository;
import br.com.mts._filmes_api.repository.UserMovieRepository;

@Service
public class ScoreService {


	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private UserMovieRepository userMovieRepository;

	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO salvarScore(ScoreDTO dto) {
		UserMovie userMovie = userMovieRepository.findByEmail(dto.getEmail());
		if(userMovie == null) {
			userMovie = new UserMovie();
			userMovie.setEmail(dto.getEmail());
			userMovie = userMovieRepository.saveAndFlush(userMovie);
		}

		Movie movie = movieRepository.findById(dto.getMovieId()).get();

		Score score = new Score();
		score.setMovie(movie);
		score.setUserMovie(userMovie);
		score.setPunctuation(dto.getPunctuation());

		score = scoreRepository.saveAndFlush(score);

		//acessando uma lista avaliações relacionadas a um determinado filme
		double soma = 0.0;
		for(Score s : movie.getScores()) { //percorrendo todas as avaliações de um determinado filme
			soma = soma + s.getPunctuation();
		}

		double media = soma / movie.getScores().size(); //o método size pega o tamanho da coleção

		movie.setScore(media);
		movie.setCount(movie.getScores().size());

		movie = movieRepository.save(movie);	

		return new MovieDTO(movie);
	}
}
