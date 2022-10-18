package recursiveAsalSayiBulma;

import java.util.Scanner;

public class Main {
	
	public static void prime(int number, int i) {
		
		if(number < 0 ) {
			System.out.println("Pozitif sayı giriniz.");
			return;
		}
		
		if(number == 1) {
			System.out.println(number + " sayısı ASAL değildir !");
			return;
		}
		
		if(number == i) {
			System.out.println(number + " sayısı ASALDIR !");
			return;
		} else if (number % i == 0) {
            System.out.println(number + " sayısı ASAL değildir !");
            return;
        }
		
		prime(number, i + 1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayı Giriniz : " );
		int number = scanner.nextInt();
		
		prime(number, 2);
		
		
	}

}
