package dev.wael.entities;

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

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "m_id")
	private int mId;

	@Column(name = "title")
	private String title;

	@ManyToOne
	@JoinColumn(name = "d_id")
	private Director director;

	@ManyToMany
	Set<Actor> movies = new HashSet<Actor>();

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

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int mId, String title, Director director) {
		super();
		this.mId = mId;
		this.title = title;
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [mId=" + mId + ", title=" + title + "]";
	}
}
