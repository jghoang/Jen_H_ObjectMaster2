package com.objectmaster;

public class ObjectMasterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ninja ninja = new Ninja();
		Wizard wiz = new Wizard();
		Samurai samurai = new Samurai();
		Samurai samurai2 = new Samurai();
		
		ninja.steal(wiz);
		ninja.runAway();
		wiz.fireball(samurai);
		samurai.deathBlow(wiz);
		wiz.heal(wiz);
		samurai2.meditate();
		ninja.attack(samurai2);
		wiz.fireball(ninja);
		wiz.fireball(samurai2);
		samurai.deathBlow(samurai2);
		wiz.heal(samurai2);
		ninja.steal(samurai);
		ninja.steal(samurai);
		wiz.fireball(ninja);
		
		
		ninja.displayHealth();
		samurai.displayHealth();
		samurai2.displayHealth();
		wiz.displayHealth();
		samurai.howMany();

	}

}
