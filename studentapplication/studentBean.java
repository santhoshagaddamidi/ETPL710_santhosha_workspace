package com.evergent.corejava.studentapplication;
import java.io.Serializable;
public class studentBean implements Serializable {
	private String sName;
	private float sMarks;
	private String grade;
	private int sId;

	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public float getsMarks() {
		return sMarks;
	}
	public void setsMarks(float sMarks) {
		this.sMarks = sMarks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	

}
