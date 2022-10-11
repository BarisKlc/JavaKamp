package dataAcces;

import entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Eğitmen Hibernate ile eklendi : "+ teacher.getTeacherName());
		
	}

}
