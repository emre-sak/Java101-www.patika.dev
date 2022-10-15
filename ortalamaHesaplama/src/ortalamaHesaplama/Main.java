package ortalamaHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int toplam = 0;
		int sayac = 0;
		double ortalama;

		System.out.print("Sayıyı giriniz : ");
		int sayi = scanner.nextInt();

		int i = 0;
		while (i <= sayi) {

			if (i % 3 == 0 && i % 4 == 0) {
				toplam += i;
				sayac++;
			}
			
			i++;
			
		}

		ortalama = (toplam / sayac);
		System.out.println("Ortalama : " + ortalama);

	}
}