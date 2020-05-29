package com.example.scgcpdemo.model;


import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Person {
	public Person(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	private long id;

	public Person(String name) {
		this.name = name;
	}
	public Person() {

	}

	@Override
	public String toString() {
		return "Person{" +
			"id=" + id +
			", name='" + name + '\'' +
			'}';
	}

	private String name;

	long getId() {
		return id;
	}

	void setId(long id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}
