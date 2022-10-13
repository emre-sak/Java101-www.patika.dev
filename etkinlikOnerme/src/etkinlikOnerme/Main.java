package etkinlikOnerme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sıcakığı girin : ");
		int heat = scanner.nextInt();
		
		if(heat >= 5 && heat <= 25 ) {
			
			if(heat <= 15) {
				System.out.println("Sinemaya gidebilirsiniz.");
			}
			if(heat >= 10) {
				System.out.println("Pikniğe gidebilirsiniz.");
			}
			
		}else if(heat < 5) {
			System.out.println("Kayak yapabilirsiniz.");
		}else {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
		
		

	}

}
