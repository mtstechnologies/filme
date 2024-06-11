package br.com.mts._filmes_api.dto;

public class ScoreDTO {
	private Long movieId;
	private String email;
	private Double punctuation;

	public ScoreDTO() {
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getPunctuation() {
		return punctuation;
	}

	public void setPunctuation(Double punctuation) {
		this.punctuation = punctuation;
	}
	
}
