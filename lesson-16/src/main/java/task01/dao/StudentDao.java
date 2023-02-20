package task01.dao;

import java.util.List;

import task01.domain.Student;

public interface StudentDao {

	Student create(Student student);

	List<Student> readAll();

	Student readById(int id);

	Student update(Student student);

	void delete(int id);
	
}