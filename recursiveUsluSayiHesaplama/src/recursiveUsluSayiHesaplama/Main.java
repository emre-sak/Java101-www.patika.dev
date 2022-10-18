package recursiveUsluSayiHesaplama;

import java.util.Scanner;

public class Main {
	
	
	public static int pow(int base, int exp) {	
		
		if(exp == 0) {
			return 1;
		}else if(base == 0) {
			return 0;
		}
		
		return pow(base, exp - 1) * base;

	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Taban değerini giriniz : ");
		int base = scanner.nextInt();
		System.out.print("Üs değerini giriniz : ");
		int exp = scanner.nextInt();
		
		System.out.println("Sonuç : " + pow(base, exp));
		

	}

}
