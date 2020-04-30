package dev.wael.entities;

import java.awt.List;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Director {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "d_Id")
	private int dId;
	
	@Column(name = "name")
	private String name;

	@OneToMany (mappedBy = "director" ,fetch = FetchType.LAZY)
	private Set<Movie> movies = new HashSet<Movie>();
	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	public Director(int dId, String name) {
		super();
		this.dId = dId;
		this.name = name;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Director [dId=" + dId + ", name=" + name + ", movies=" + movies + "]";
	}

 

}
