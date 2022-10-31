package sayiTahminOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Random rand = new Random();

		int number = rand.nextInt(100); // 0 - 100 arası rastgele sayı üretir.

		int right = 0; // Hakkımız.
		int selected;
		int[] wrong = new int[5]; // Her girilen yanlış değer bu diziye eklenecek.
		boolean isWin = false;
		boolean isWrong = false; // 2. kez hatalı giriş yaparsa candan düşecek.

		System.out.println(number);

		while (right < 5) {

			System.out.print("Lütfen tahmininizi giriniz : ");
			selected = scanner.nextInt();

			if (selected < 0 || selected > 99) {
				System.out.println("Lütfen 0 - 100 arası bir değer giriniz.");
				if (isWrong) {
					wrong[right] = selected;
					right++;
					System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
				} else {
					isWrong = true;
					System.out.println("Bir daha ki hatalı girişinizde hakkınızdan düşülecektir.");
				}
				continue; // Sorgulama yapıp can azaltma işlemi yapmaması için.
			}

			if (selected == number) {
				System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
				isWin = true;
				break;
			} else {
				System.out.println("Hatalı bir sayı girdiniz.");
				if (selected > number) {
					System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
				} else {
					System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
				}

				wrong[right] = selected;
				right++;
				System.out.println("Kalan hakkınız : " + (5 - right));

			}

		}

		if (!isWin || isWrong) {
			System.out.println("Kaybettiniz ! ");
			System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
		}

	}

}
