package boksOyunu;

public class Ring {

	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;

	}

	public void run() {

		if (isCheck()) {

			while (this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("===YENİ ROUND===");
				if (isFirst()) {
					System.out.println("İlk Vuracak Kişi : " + this.f1.name);
					this.f2.health = this.f1.hit(this.f2);
					if (isWin()) {
						break;
					}
					printScore();
				} else {
					System.out.println("İlk Vuracak Kişi : " + this.f2.name);
					this.f1.health = this.f2.hit(this.f1);
					if (isWin()) {
						break;
					}
					printScore();
				}
			}
		} else {
			System.out.println("Sporcuların sikletleri uymuyor.");
		}
	}

	public boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
				&& (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}

	public boolean isWin() {
		if (this.f1.health == 0) {
			System.out.println(this.f2.name + " kazandı !");
			return true;
		}

		if (this.f2.health == 0) {
			System.out.println(this.f1.name + " kazandı !");
			return true;
		}

		return false;

	}

	public void printScore() {
		System.out.println("------------");
		System.out.println(f1.name + " Kalan Can \t:" + f1.health);
		System.out.println(f2.name + " Kalan Can \t:" + f2.health);
	}

	public boolean isFirst() {
		double random = Math.random() * 100;
		double random2 = Math.random() * 100;
		return random + this.f1.start > random2 + this.f2.start;
	}

}
