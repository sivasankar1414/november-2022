package org.univ;

import org.univ.University;

public class College extends University {
	public void ug(String name) {
		System.out.println(name);
		super.ug("course name is : BBA");
	}

	public void pg(String name) {
		System.out.println(name);
		super.pg("course name is : MBA");
	}

	public static void main(String[] args) {
		College u = new College();
		u.ug("course name is : BCA");
		u.pg("course name is : MCA");

	}
}
