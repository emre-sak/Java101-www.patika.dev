package diziFrekans;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
		
		Arrays.sort(list);
		
		System.out.println("Tekrar Sayıları");
		
		for(int i = 0; i < list.length; i++) {
			
			int sayac = 0;
			
			for(int j = 0; j < list.length; j++) {
				if(list[i] == list[j]) {
					sayac++;
				}
				
			}
			
			if(i == 0 && list[i + 1] == list[i]) {
				System.out.println(list[i] + " sayısı " + sayac + " kere tekrar edildi.");
			}
			
			if(i == 0 && list[i + 1] != list[i]) {
				System.out.println(list[i] + " sayısı " + sayac + " kere tekrar edildi.");
			}
			
			if(i != 0 && list[i - 1] != list[i]) {
				System.out.println(list[i] + " sayısı " + sayac + " kere tekrar edildi.");
			}
			
		}
		
		
		
	}

}
