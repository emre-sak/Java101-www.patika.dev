package ebobEkokBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. Sayıyı giriniz : ");
		int n1 = scanner.nextInt();
		
		System.out.print("2. Sayıyı giriniz : ");
		int n2 = scanner.nextInt();
		
		int ebob = 1;
		int ekok = 1;
		
		int i = 1;
		while(i <= n1) {
			if(n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
			i++;
		}
		
		System.out.println("Ebob : " + ebob);
		
		int j = 1;
		while(j  <= (n1 * n2)) {
			if(j % n1 == 0 && j % n2 == 0) {
				ekok = j;
				break;
			}
			j++;
		}
		
		System.out.println("Ekok : " + ekok);

	}

}
