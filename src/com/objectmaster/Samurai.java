package com.objectmaster;

public class Samurai extends Human {
	private static int count= 0;
	public Samurai() {
		this.health = 200;
		count++;
	}
	public void deathBlow(Human human) {
		human.setHealth(0);
		this.setHealth(this.getHealth()/2);
	}
	public void meditate() {
		this.setHealth(this.getHealth()+ this.getHealth()/2);
	}
	public int howMany() {
		System.out.println("Total current number of Samurai: "+count);
		return count;
	}
}
