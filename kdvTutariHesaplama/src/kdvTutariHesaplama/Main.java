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

}
