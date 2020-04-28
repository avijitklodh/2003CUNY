package dev.ranieri.daos;

import java.util.Set;
import dev.ranieri.entities.Director;

public interface DirectorDAO {
	
	//CRUD
	
	//Create
	Director createDirector(Director director);
	
	// read
	Director getDirectorById(int id);
	Set<Director> getAllDirectors();

	//update
	Director updateDirector(Director director);
	
	//delete
	
	boolean deleteDirector(Director director);
}
