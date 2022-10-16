package kombinasyonHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("r : ");
		int r = scanner.nextInt();
		
		System.out.print("n : ");
		int n = scanner.nextInt();
		
		int totalR = 1 , totalN = 1, totalMinus = 1;
		
		int i = 1;
		while(i <= r) {
			totalR *= i;
			i++;
		}
		
		int j = 1;
		while(j <= n) {
			totalN *= j;
			j++;
		}
		
		int minus = totalR - totalN;
		
		int k = 1;
		while(k <= minus) {
			totalMinus *= k;
			k++;
		}
		
		System.out.println("Kombinasyon  : " + n / (r * (n - r)));
		

	}

}
