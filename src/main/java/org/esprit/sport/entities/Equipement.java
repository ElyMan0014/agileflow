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
	
	private Equipement_Generique equipement;
	
	public Equipement_Generique getEquipement() {
		return equipement;
	}
	public int getId() {
		return Id;
	}
	
	public int getQte() {
		return qte;
	}
	
	public void setEquipement(Equipement_Generique equipement) {
		this.equipement = equipement;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	
	
	
}
