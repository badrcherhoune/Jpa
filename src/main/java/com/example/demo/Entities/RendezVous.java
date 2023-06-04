package com.example.demo.Entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class RendezVous {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateRendVous;
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private Medecin medecin;
	
	@OneToOne
	private Consultation consultation;
	
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public RendezVous(Long id, Date dateRendVous) {
		super();
		this.id = id;
		this.dateRendVous = dateRendVous;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateRendVous() {
		return dateRendVous;
	}
	public void setDateRendVous(Date dateRendVous) {
		this.dateRendVous = dateRendVous;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public RendezVous() {
		super();
	}
	
}
