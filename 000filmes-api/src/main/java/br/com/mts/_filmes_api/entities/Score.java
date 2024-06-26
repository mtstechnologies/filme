package br.com.mts._filmes_api.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK();//chave composta

	private Double punctuation;
	
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

	public Double getPunctuation() {
		return punctuation;
	}

	public void setPunctuation(Double punctuation) {
		this.punctuation = punctuation;
	}
}
