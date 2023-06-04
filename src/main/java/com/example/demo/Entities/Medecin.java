package com.example.demo.Entities;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Medecin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String specialite;
	private String email;
	
	@OneToMany(mappedBy = "medecin")
	private Collection<RendezVous> rendezVous;

	public Medecin(Long id, String nom, String specialite, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.specialite = specialite;
		this.email = email;
	}

	public Medecin() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
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
