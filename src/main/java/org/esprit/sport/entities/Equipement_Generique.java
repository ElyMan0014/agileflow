package org.esprit.sport.entities;

import javax.persistence.*;

@Entity
public class Equipement_Generique {
	
	
	public Equipement_Generique() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private int Id;
	
	@Enumerated
	private typeEquipement type;
	
	private String nom;
	
	
	public void setId(int id) {
		Id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId() {
		return Id;
	}
	public String getNom() {
		return nom;
	}
	public typeEquipement getType() {
		return type;
	}
	
	
	
}
