package dev.ranieri.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // denotes that this is a class that is saved to a table in the database
@Table(name ="movie")
public class Movie {
	
	@Id // primary key field
	@GeneratedValue(strategy = GenerationType.IDENTITY) // genrated value via auto increment
	@Column(name = "m_id")
	private int mId;
	
	@Column(name = "title")
	private String title;
	
	// "d_id" in the movie table
	@ManyToOne // specify that this is the many in the relationship
	@JoinColumn(name = "d_id")// I specify the column that has a foreign key to director
	private Director director;
	
	@ManyToMany(mappedBy ="movies")
	private Set<Actor> actors = new HashSet<Actor>();

	public Movie() {
		super();
	}

	public Movie(int mId, String title, Director director) {
		super();
		this.mId = mId;
		this.title = title;
		this.director = director;
	}

	
	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	public Set<Actor> getActors() {
		return actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [mId=" + mId + ", title=" + title +  "]";
	}

}
