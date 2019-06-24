package com.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	public void heal(Human healed) {
		healed.setHealth(healed.getHealth()+intelligence);
		
	}
	public void fireball(Human human) {
		human.setHealth(human.getHealth()-(intelligence*3));
	}

}
