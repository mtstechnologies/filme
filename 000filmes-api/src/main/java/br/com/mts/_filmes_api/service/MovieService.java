package br.com.mts._filmes_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.mts._filmes_api.dto.MovieDTO;
import br.com.mts._filmes_api.entities.Movie;
import br.com.mts._filmes_api.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	//fazendo uma busca paginada
	
	@Transactional(readOnly = true) // indicando que é somente leitura
	public Page<MovieDTO> findAll(Pageable pageable){
		Page<Movie> resultado = movieRepository.findAll(pageable); //recebendo as paginas da entidade
		Page<MovieDTO> page = resultado.map(x -> new MovieDTO(x)); //convertendo o resultado para DTO
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		Movie resultado = movieRepository.findById(id).get();//para acessar o objeto que está dentro do Optional, é necessário .get()
		MovieDTO dto = new MovieDTO(resultado); //convertendo o resultado para DTO
		return dto;
	}
}