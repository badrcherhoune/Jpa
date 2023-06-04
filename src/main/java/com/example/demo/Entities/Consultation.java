package com.example.demo.Entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Consultation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateConsultation;
	private double raportConsultation;
	private double prixConsultation;
	
	@OneToOne(mappedBy = "consultation")
	private RendezVous rendezVous;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateConsultation() {
		return dateConsultation;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

	public double getRaportConsultation() {
		return raportConsultation;
	}

	public void setRaportConsultation(double raportConsultation) {
		this.raportConsultation = raportConsultation;
	}

	public double getPrixConsultation() {
		return prixConsultation;
	}

	public void setPrixConsultation(double prixConsultation) {
		this.prixConsultation = prixConsultation;
	}

	public RendezVous getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(RendezVous rendezVous) {
		this.rendezVous = rendezVous;
	}

	public Consultation(Long id, Date dateConsultation, double raportConsultation, double prixConsultation) {
		super();
		this.id = id;
		this.dateConsultation = dateConsultation;
		this.raportConsultation = raportConsultation;
		this.prixConsultation = prixConsultation;
	}

	public Consultation() {
		super();
	}

}
