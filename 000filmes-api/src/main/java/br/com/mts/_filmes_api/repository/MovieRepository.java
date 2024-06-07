package br.com.mts._filmes_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mts._filmes_api.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
