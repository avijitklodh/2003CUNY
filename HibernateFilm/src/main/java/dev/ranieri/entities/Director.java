package dev.ranieri.entities;

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
	
	// Hibernate requires that your entities be beans
	
	@Id // denoting that this field is a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // specifices that the primary key is created via auto-increment
	@Column(name ="d_id")
	private int dId;
	
	@Column(name = "name")
	private String name;
	
	
	//The two tables are linked
	// mapped by says what field in JAVA holds the foreign key
	// the child table is referred to as the owning table. The owning table is the table that has the foreign
	// key that can connect the two
	@OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
	private Set<Movie> movies = new HashSet<Movie>(); 

	public Director() {
		super();
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
	
	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Director [dId=" + dId + ", name=" + name + ", movies=" + movies + "]";
	}

}
