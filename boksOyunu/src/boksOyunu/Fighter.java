package boksOyunu;

public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	int start;
	
	public Fighter(String name, int damage, int health, int weight, int dodge, int start) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if(dodge >= 0 && dodge <= 100) {
			this.dodge = dodge;
		}else {
			this.dodge = 0;
		}
		this.start = start;
		
	}
	
	public int hit(Fighter foe) {
		
		 System.out.println("------------");
	        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

	        if (foe.isDodge()) {
	            System.out.println(foe.name + " gelen hasarı savurdu.");
	            return foe.health;
	        }

	        if (foe.health - this.damage < 0)
	            return 0;

	        return foe.health - this.damage;
        
	}
	
	public boolean isDodge() {
		double randomNumber = Math.random() * 100;
		return randomNumber <= this.dodge;
	}
	
	
	
}
