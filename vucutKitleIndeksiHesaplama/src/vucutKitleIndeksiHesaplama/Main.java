package vucutKitleIndeksiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
		double boy = scanner.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz : ");
		double kg = scanner.nextDouble();
		
		double vki = kg / (boy * boy);
		
		System.out.println("Vücut Kitle İndeksiniz : " + vki);

	}

}
