package sinifiGecmeDurumu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Matematik Notunuz : ");
		int matematik = scanner.nextInt();

		System.out.print("Türkçe Notunuz : ");
		int turkce = scanner.nextInt();

		System.out.print("Fizik Notunuz : ");
		int fizik = scanner.nextInt();

		System.out.print("Kimya Notunuz : ");
		int kimya = scanner.nextInt();

		System.out.print("Müzik Notunuz : ");
		int muzik = scanner.nextInt();
		

		if ((matematik >= 0 && matematik <= 100) && (turkce >= 0 && turkce <= 100) && (fizik >= 0 && fizik <= 100) 
				&& (kimya >= 0 && kimya <= 100) && (muzik >= 0 && muzik <= 100)) {
			
			int avarage = (matematik + turkce + fizik + kimya + muzik) / 5;
			
			System.out.println("Geçme Notu : 55 ");
			System.out.println("Ortalamanız : " + avarage);
			
			if(avarage >= 55) {
				System.out.println("Tebrikler, sınıfı geçtiniz ! "); 
			}else {
				System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere ! ");
			}
			
		}else {
			System.out.println("Notlarınız 0 ile 100 aralığında olmalıdır. ");
		}

	}

}
