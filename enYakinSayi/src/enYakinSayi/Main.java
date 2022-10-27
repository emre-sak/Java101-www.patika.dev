package enYakinSayi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
		
		Arrays.sort(list);
		
		int number = scanner.nextInt();
		
		int min = list[0];
		int max = list[list.length - 1];
		
		for(int i = 0; i < list.length; i++) {
			
			if(list[i] < max && list[i] > number) {
				max = list[i];
			}
			
			if(list[i] > min && list[i] < number) {
				min = list[i];
			}
			
			
		}
		
		System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
		System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
		

	}

}
