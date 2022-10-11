package homeworkProject;

import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import dataAcces.HibernateCategoryDao;
import dataAcces.HibernateCourseDao;
import dataAcces.HibernateTeacherDao;
import entities.Category;
import entities.Course;
import entities.Teacher;
import logging.BaseLogger;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.MailLogger;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers = {new DatabaseLogger(),new MailLogger(),new FileLogger()};

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		
		
		Category category1 = new Category(1,"Programlama");
		categoryManager.add(category1);
		
		Category category2 = new Category(2,"Programlama1");
		categoryManager.add(category2);
		
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(),loggers);
		
		Teacher teacher1 = new Teacher(1,"Engin");
		teacherManager.add(teacher1);
		
		Teacher teacher2 = new Teacher(2,"Barış");
		teacherManager.add(teacher2);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		
		Course course1 = new Course(1,150,"Java");
		courseManager.add(course1);
		
		Course course2 = new Course(2,100,"Phyton");
		courseManager.add(course2);
		
	}

}
