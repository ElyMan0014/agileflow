package org.esprit.sport.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipement {

	
	public Equipement() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private int Id;
	
	private int qte;
	
	private generique_equipement equipement;
	
	public generique_equipement getEquipement() {
		return equipement;
	}
	public int getId() {
		return Id;
	}
	
	public int getQte() {
		return qte;
	}
	
	public void setEquipement(generique_equipement equipement) {
		this.equipement = equipement;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	
	
	
}
