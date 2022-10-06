package daireAlanCevreHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Dairenin yarıçapını giriniz : ");
		int r = scanner.nextInt();
		System.out.print("Dairenin merkez açı ölçüsünü giriniz : ");
		int a = scanner.nextInt();

		double pi = 3.14;

		double daireDilimininAlani = (pi * (r * r) * a) / 360;

		System.out.println("Daire diliminin alanı : " + daireDilimininAlani);

	}

}
