package br.com.mts._filmes_api.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK();//chave composta

	private Double valor;
	
	public Score() {		
	}

	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUserMovie(UserMovie userMovie) {
		id.setUserMovie(userMovie);
	}
	
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return valor;
	}

	public void setValue(Double valor) {
		this.valor = valor;
	}
}
