package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private String name;
	private String city;
	@Column(columnDefinition = "double(5,2)")
	private double percentage;
	@Column(columnDefinition = "longblob")
	private byte[] image;
	@Column(columnDefinition = "longblob")
	private byte[] docs;
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public byte[] getDocs() {
		return docs;
	}
	public void setDocs(byte[] docs) {
		this.docs = docs;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
