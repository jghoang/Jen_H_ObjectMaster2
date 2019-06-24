package com.objectmaster;

public class Ninja extends Human{

	public Ninja() {
		this.stealth = 10;
	}
	public Ninja steal(Human human) {
		human.health -= this.stealth;
		this.health += this.stealth;
		return this;
	}
	public void runAway() {
		this.setHealth(this.getHealth()-10);
	}
}
