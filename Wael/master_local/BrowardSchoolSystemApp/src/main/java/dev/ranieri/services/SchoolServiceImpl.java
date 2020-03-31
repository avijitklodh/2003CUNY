package dev.ranieri.services;

import dev.ranieri.daos.SchoolDAO;
import dev.ranieri.daos.SchoolDAOlocal;
import dev.ranieri.entities.School;

public class SchoolServiceImpl implements SchoolService{
	
	private SchoolDAO schooldao = new SchoolDAOlocal();

	public School establishSchool(School school) {
		schooldao.createSchool(school);
		return school;
	} 

}
