package com.immo.senekeur.Clients;

import javax.persistence.*;

@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue
	private Integer id;  
	private String cin;
	private String age;
	private String email;
	private String adresse;
	private String tel1;
	private String tel2;
	private String nom;
	private String prenom;
	


	public Client() {
		super();
	}

	public Client(Integer id, String cIN, String age, String email, String adresse, String tel1, String tel2, 
                  String nom, String prenom) {
		super();
		this.id = id;
		this.cin = cIN;
		this.age = age;
		this.email = email;
		this.adresse = adresse;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCIN() {
		return cin;
	}

	public void setCIN(String cIN) {
		cin= cIN;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}