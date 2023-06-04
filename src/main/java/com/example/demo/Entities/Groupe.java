package com.example.demo.Entities;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Groupe {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String groupName;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Utilisateur> utilisateurs = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Collection<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Groupe(Long id, String groupName) {
		super();
		this.id = id;
		this.groupName = groupName;
	}

	public Groupe() {
		super();
	}
	
	

}
