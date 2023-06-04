package com.example.demo.Entities;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Patient {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id ;
	private String nom;
	private String email;
	
	@OneToMany(mappedBy = "patient")
	private Collection<RendezVous> rendezVous;

	public Patient() {
		super();
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Patient(Long id, String nom, String email) {
		super();
		Id = id;
		this.nom = nom;
		this.email = email;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<RendezVous> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(Collection<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}

	
}
