package com.quicklinker.pfa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CompteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompte;
	@Column(nullable=false)
	private String username;
	 @Column(unique=true,nullable=false)
	 private String email;
	@Column(nullable=false)
	 private String password;
	
	//@ManyToOne
	//private ProfilModel ProfilModel;
	 public CompteModel() {
	        // Constructeur sans arguments
	    }
	    
	    public CompteModel(int idCompte) {
	        this.idCompte = idCompte;
	    }
	 public int getIdCompte() {
	        return idCompte;
	    }

	    public void setIdCompte(int idCompte) {
	        this.idCompte = idCompte;
	    }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
