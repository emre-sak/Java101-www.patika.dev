package kdvTutariHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Tutarı Giriniz : ");
		double tutar = scanner.nextInt();

		double kdv = 0.18;
		double kdv2 = 0.08;

		boolean girilenTutar = (tutar > 0 && tutar < 1000);

		double kdvTutari = girilenTutar ? tutar * kdv : tutar * kdv2;

		System.out.println("Tutar : " + tutar + " TL");
		System.out.println("KDV tutarı : " + kdvTutari + " TL");
		System.out.println("KDV ile birlikte toplam tutar : " + (tutar + kdvTutari) + " TL");

	}

	public static void ornek() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Fiyatı Giriniz : ");
		double fiyat = scanner.nextInt();

		double kdv = 0.18;
		double kdvFiyat = kdv * fiyat;
		double kdvLiFiyat = fiyat + kdvFiyat;

		System.out.println("KDV'siz Fiyat : " + fiyat);
		System.out.println("KDV'li Fiyat : " + kdvLiFiyat);
		System.out.println("KDV Tutarı : " + kdv);
	}

}
