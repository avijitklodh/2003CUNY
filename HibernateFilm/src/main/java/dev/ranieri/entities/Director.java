package dev.ranieri.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@Override
	public String toString() {
		return "Director [dId=" + dId + ", name=" + name + "]";
	}

}
