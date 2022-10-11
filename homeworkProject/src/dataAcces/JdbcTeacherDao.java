package dataAcces;

import entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Eğitmen Jdbc ile eklendi : "+ teacher.getTeacherName());
		
	}

}
