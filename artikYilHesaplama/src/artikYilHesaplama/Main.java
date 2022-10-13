package artikYilHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean artikMi;

		System.out.print("Yılı giriniz : ");
		int yil = scanner.nextInt();

		if (yil % 4 == 0) {
			if (yil % 100 == 0) {
				if (yil % 400 == 0) {
					artikMi = true;
				} else {
					artikMi = false;
				}
			} else {
				artikMi = true;
			}
		} else {
			artikMi = false;
		}

		if (artikMi) {
			System.out.println(yil + " bir artık yıldır ! ");
		} else {
			System.out.println(yil + " bir artık yıl değildir ! ");
		}

	}

}
