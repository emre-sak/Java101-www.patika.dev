package hipotenusHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("1. Kenar : ");
		int a = scanner.nextInt();
		System.out.print("2. Kenar : ");
		int b = scanner.nextInt();
		System.out.print("3. Kenar : ");
		int c = scanner.nextInt();

		int u = (a + b + c) / 2;

		double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

		System.out.println("Üçgenin Alanı : " + alan);

	}

}
