package com.te.learn.collectionframework.list;

public class Student {
	private int sId;
	private String sName;
	private int sAge;
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[StudentId="+sId+"[StudentName=" + sName + ", StudentAge" + sAge + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String sName, int sAge) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public static void main(String[] args) {
		
		
	}
}
