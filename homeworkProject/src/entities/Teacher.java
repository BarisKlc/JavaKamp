package entities;

public class Teacher {
	private int id;
	private String teacherName;

	public Teacher() {

	}

	public Teacher(int id, String teacherName) {
		this.id = id;
		this.teacherName = teacherName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
