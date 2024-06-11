package br.com.mts._filmes_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mts._filmes_api.entities.Score;
import br.com.mts._filmes_api.entities.ScorePK;



public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
