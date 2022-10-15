package kuvvetler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sınırı giriniz : ");
		int number = scanner.nextInt();
	
		for(int i = 1; i <= number; i *= 4) {
			System.out.println("4'ün Kuvvetleri : " + i);
		}
		
		System.out.println("******************");
		
		for(int j = 1; j <= number; j *= 5) {
			System.out.println("5'in Kuvvetleri : " + j);
		}
		
		
	}

}
