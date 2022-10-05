package notOrtalamasiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz : ");
		int matematik = scanner.nextInt();
		System.out.print("Fizik Notunuz : ");
		int fizik = scanner.nextInt();
		System.out.print("Kimya Notunuz : ");
		int kimya = scanner.nextInt();
		System.out.print("Türkçe Notunuz : ");
		int turkce = scanner.nextInt();
		System.out.print("Tarih Notunuz : ");
		int tarih = scanner.nextInt();
		System.out.print("Müzik Notunuz : ");
		int muzik = scanner.nextInt();
		
		int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
		double ortalama = toplam / 6;
		System.out.println("Ortalamanız : " + ortalama);
		
		boolean gectiMi = (ortalama > 60);
		String kontrol = gectiMi ? "Sınıfı Geçti" : "Sınfta Kaldı";
		System.out.println(kontrol);

	}

}
