package com.boot.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String description;
	public Course(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "entities [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	
}
