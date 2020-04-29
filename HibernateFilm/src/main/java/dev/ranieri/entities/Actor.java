package dev.ranieri.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "actor")
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "a_id")
	private int aId;
	
	@Column(name = "name")
	private String name;
	
	@ManyToMany
	@JoinTable(name = "actor_movie", // the junction table that contains the information connecting the two
	joinColumns = { @JoinColumn (name = "actor_id")},
	inverseJoinColumns = { @JoinColumn (name = "movie_id")})	
	private Set<Movie> movies = new HashSet<Movie>();

	public Actor() {
		super();
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Actor [aId=" + aId + ", name=" + name + "]";
	}

	
}
