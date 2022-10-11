package business;

import java.util.ArrayList;
import java.util.List;

import dataAcces.TeacherDao;
import entities.Teacher;
import logging.BaseLogger;

public class TeacherManager {
	private TeacherDao teacherDao;
	private BaseLogger[] loggers;
	private List<String> teacherName = new ArrayList<>();
	
	public TeacherManager(TeacherDao teacherDao, BaseLogger[] loggers) {
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}
	
	public void add(Teacher teacher) {
		if (teacherName.size()==0) {
			teacherName.add(teacher.getTeacherName());
			teacherDao.add(teacher);
			for (BaseLogger logger : loggers) {
				logger.log(teacher.getTeacherName());
			}
		}else {
			for(String name : teacherName) {
				if (name.equals(teacher.getTeacherName())) {
					System.out.println("Eğitmen zaten var : "+ teacher.getTeacherName());
					break;
				}else {
					teacherDao.add(teacher);
					for (BaseLogger logger : loggers) {
						logger.log(teacher.getTeacherName());
					}
				}
			}
		}
	}
	
}
