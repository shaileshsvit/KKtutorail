package com.infotech.info;

import java.util.List;
import java.util.Set;

import com.infotech.model.Student;

public class OrgInfo {

	private Student[] stuArr = new Student[2];
	private List<Student> stuList;
	private Set<Student> stuSets;
	
	public Student[] getStuArr() {
		return stuArr;
	}
	public void setStuArr(Student[] stuArr) {
		this.stuArr = stuArr;
	}
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public Set<Student> getStuSets() {
		return stuSets;
	}
	public void setStuSets(Set<Student> stuSets) {
		this.stuSets = stuSets;
	}
}