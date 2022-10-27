package harmonikOrtalama;

public class Main {

	public static void main(String[] args) {
		
		int[] dizi = {15,6,7,12,7,9,3};
		double average;
		double sum = 0;
		
		for(int i = 0; i < dizi.length; i++) {
			sum += 1.0 / dizi[i];
		}
		average = dizi.length / sum;
		System.out.println("Ortalama : " + average);
	}

}
