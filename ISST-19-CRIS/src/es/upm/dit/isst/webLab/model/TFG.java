package es.upm.dit.isst.webLab.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class TFG implements Serializable {
	
	@Id
	private String email;
	private String password;
	private String name;
	private String title;
	private int status;
	@Lob
	private byte[] document;
	private double grade;
	@ManyToOne
	private Professor advisor;
	public TFG() {
		this.status = 1;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getStatus() {
		return status;
	}
	
	public byte[] getDocument() {
		return document;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public Professor getAdvisor() {
		return advisor;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public void setDocument(byte[] document) {
		this.document = document;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	
	
}
	