package ucakBiletiFiyatHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double indirim = 0;
		double tutar = 0;

		System.out.print("Mesafeyi KM türünden giriniz : ");
		int km = scanner.nextInt();

		System.out.print("Yaşınızı giriniz : ");
		int yas = scanner.nextInt();

		System.out.print("Yolculuk türünü giriniz (1 => Tek yön, 2 => Gidiş dönüş) : ");
		int yolculukTipi = scanner.nextInt();

		double normalTutar = km * 0.10;
		
		if (!(km < 0 || yas < 0)) {
			
			if (yas < 12) {
				indirim = normalTutar * 0.5;
			} else if (yas >= 12 && yas <= 24) {
				indirim = normalTutar * 0.1;
			} else if (yas > 65) {
				indirim = normalTutar * 0.3;
			}
			
			tutar = normalTutar - indirim;
			
			if(yolculukTipi == 2) {
				indirim = tutar * 0.2;
				tutar = (tutar - indirim) * 2;
			}
			
		} else {
			System.out.println("Hatalı Veri Girdiniz ! ");
		}
		
		System.out.println("Toplam Tutar : " + tutar + " TL");
		
	}

}
