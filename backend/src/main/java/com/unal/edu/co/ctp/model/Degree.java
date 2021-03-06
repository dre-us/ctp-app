package com.unal.edu.co.ctp.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.time.*;
import java.util.ArrayList;
import java.util.Stack;

public class Degree {

	private Integer id;
	private String name;
	private ArrayList<Course> courses;

	public Degree(Integer id, String name) {
		this.setId(id);
		this.setName(name);
		this.courses = new ArrayList<Course>();
	}

	public Degree() {
		this.courses = new ArrayList<Course>();
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Course> getCourses() {
		return this.courses;
	}

	public boolean insertCourse(Course course) {
		return this.courses.add(course);
	}

	public boolean deleteCourse(Course course) {
		return this.courses.remove(course);
	}


	private void update() {
		for (int i = 0; i < this.courses.size(); ++i)
			this.courses.get(i).update(this.courses);
	}

	@Override
	public String toString() {
		String dataDegree =
			"Codigo: " + this.id + "\n" +
			"Nombre: " + this.name;
		for (int i = 0; i < this.courses.size(); ++i) {
			if (i == 0) System.out.println();
			dataDegree += "\n" + this.courses.get(i).toString();
			if (i < this.courses.size() - 1) dataDegree += "\n";
		}
		return dataDegree;
	}

	@Override
	public boolean equals(Object obj) {
		Degree degree = (Degree) obj;
		return this.getId().equals(degree.getId());
	}
}
