package minMaxSayiBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Kaç tane sayı gireceksiniz? : ");
		int n = scanner.nextInt();
		
		int max = 0;
		int min = 0;

		for (int i = 1; i <= n; i++) {

			System.out.print(i + ".sayıyı giriniz : ");
			int number = scanner.nextInt();
			
			if(i == 1) {
				max = number;
				min = number;
			}
			if(number > max) {
				max = number;
			}
			
			if(number < min) {
				min = number;
			}

		}
		
		System.out.println("En büyük sayı : " + max);
		System.out.println("En küçük sayı : " + min);

	}
}
