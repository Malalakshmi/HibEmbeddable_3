package com.learningTech.DemoHibEmbeddable3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int AlienID;
	private AlienName AlienName;
	private String Aliencolor;
	public int getAlienID() {
		return AlienID;
	}
	public void setAlienID(int alienID) {
		AlienID = alienID;
	}
	
	public AlienName getAlienName() {
		return AlienName;
	}
	public void setAlienName(AlienName alienName) {
		AlienName = alienName;
	}
	public String getAliencolor() {
		return Aliencolor;
	}
	public void setAliencolor(String aliencolor) {
		Aliencolor = aliencolor;
	}
	
       
}
