package kr.hs.study.beans;

public class TestUser {
	private String school;
	private int grade;
	private Person user;
	
	public TestUser(String school, int grade, Person user) {
		this.school = school;
		this.grade = grade;
		this.user = user;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Person getUser() {
		return user;
	}
	public void setUser(Person user) {
		this.user = user;
	}
	
	
}
