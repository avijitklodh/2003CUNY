package dev.wael.daos;

import java.util.Set;

import dev.wael.entities.Director;

public interface IDirectorDAO {

	Director createDirector(Director dirctor);

	Director getDirectorById(int id);

	Director updateDirector(Director director);

	boolean deleteDirector(Director director);

	Set<Director> getAllDirectors();

}
