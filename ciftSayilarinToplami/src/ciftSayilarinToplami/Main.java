package ciftSayilarinToplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int total  = 0;
		int number;
		
		do {
			System.out.print("Sayıyı giriniz : ");
			number = scanner.nextInt();
			
			if(number % 2 == 1) {
				break;
			}else if (number % 4 == 0) {
				total +=number;
			}
			
		}while(number % 2 == 0);
		
		System.out.println("Toplam  : " + total);
		
	}

}
