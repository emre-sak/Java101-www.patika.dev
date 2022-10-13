package ucakBiletFiyatHesapla;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int indirim = 0;
		int tutar = 0;

		System.out.print("Mesafeyi KM türünden giriniz : ");
		int km = scanner.nextInt();

		System.out.print("Yaşınızı giriniz : ");
		int yas = scanner.nextInt();

		System.out.print("Yolculuk türünü giriniz (1 => Tek yön, 2 => Gidiş dönüş) : ");
		int yolculukTipi = scanner.nextInt();

		int normalTutar = (int) (km * 0.10);
		
		if (!(km < 0 || yas < 0)) {
			
			if (yas < 12) {
				indirim = (int) (normalTutar * 0.5);
			} else if (yas >= 12 && yas <= 24) {
				indirim = (int) (normalTutar * 0.1);
			} else if (yas > 65) {
				indirim = (int) (normalTutar * 0.3);
			}
			
			tutar = normalTutar - indirim;
			
			if(yolculukTipi == 2) {
				indirim = (int) (tutar * 0.2);
				tutar = (tutar - indirim) * 2;
			}
			
		} else {
			System.out.println("Hatalı Veri Girdiniz ! ");
		}
		
		System.out.println("Toplam Tutar : " + tutar + " TL");
		
	}

}
