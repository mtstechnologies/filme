package br.com.mts._filmes_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mts._filmes_api.entities.UserMovie;

public interface UserMovieRepository  extends JpaRepository<UserMovie, Long>{

	UserMovie findByEmail(String email);
}
