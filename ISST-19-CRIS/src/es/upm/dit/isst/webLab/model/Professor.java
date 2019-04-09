package es.upm.dit.isst.webLab.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings("serial")
@Entity
public class Professor implements Serializable{
	
	@Id
	private String email;
	private String password;
	private String name;
	@OneToMany(mappedBy = "advisor", fetch =
			FetchType.EAGER)
	private Collection<TFG> advisedTFGs;
	
	@Lob
	private byte[] document;
	
	public Professor() {}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public Collection<TFG> getAdvisedTFGs(){
		return advisedTFGs;
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
	
	public void setAdvisedTFGs(Collection<TFG> advisedTFGs) {
		this.advisedTFGs = advisedTFGs;
	}
	
	public byte[] getDocument() {
		return document;
	}
	
	public void setDocument(byte[] document) {
		this.document = document;
	}

}



	
