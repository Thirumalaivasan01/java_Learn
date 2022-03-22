package com.te.learn.basic.java8features.streams;

public class Student implements Comparable{
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

//	@Override
//	public int compare(Object arg0, Object arg1) {
//		// TODO Auto-generated method stub
//		Student s1=(Student) arg0;
//		Student s2=(Student) arg1;
//		if(s1.getsAge()<s2.getsAge()) {
//			return -1;
//			
//		}
//		else if(s1.getsAge()>s2.getsAge()) {
//			return 1;
//		}
//		return 0;
//	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Student s1=(Student) arg0;
		if(this.getsAge()<s1.getsAge()) {
			return -1;
			
		}
		else if(this.getsAge()>s1.getsAge()) {
			return 1;
		}
		return 0;
	}
}
