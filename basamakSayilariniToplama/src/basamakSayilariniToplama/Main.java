package basamakSayilariniToplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayıyı giriniz : ");
		int number = scanner.nextInt();
		
		int basValue;
		int result = 0;
		
		while(number != 0) {
			
			basValue = number % 10;
			number /= 10;
			result += basValue;
			
		}
		
		System.out.println(number + " sayısının basamaklarının toplamı : " + result);

	}

}
