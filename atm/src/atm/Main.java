package atm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int right = 3;
		int balance = 1500;
		int select;
		boolean exit = true;

		while (exit) {

			System.out.print("Kullanıcı Adı : ");
			String userName = scanner.nextLine();
			System.out.print("Şifre : ");
			String password = scanner.nextLine();

			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

				do {
					System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
					System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
					select = scanner.nextInt();

					int price;

					switch (select) {
					case 1:
						System.out.print("Para miktarı : ");
						price = scanner.nextInt();
						if (price < 0) {
							System.out.println("Geçersiz işlem.");
						} else {
							balance += price;
							System.out.println("Yeni bakiyeniz : " + balance);
						}
						break;
					case 2:
						System.out.print("Para miktarı : ");
						price = scanner.nextInt();
						if(price > 0) {
							if (price > balance) {
								System.out.println("Bakiye yetersiz.");
							} else {
								balance -= price;
								System.out.println("Yeni bakiyeniz : " + balance);
							}
						} else {
							System.out.println("Geçersiz işlem.");
						}
						break;
					case 3:
						System.out.println("Bakiyeniz : " + balance);
						break;
					case 4:
						System.out.println("Tekar Görüşmek üzere.");
						exit = false;
						break;
					default:
						System.out.println("Geçersiz İşlem.");
					}

				} while (select != 4);

			} else {
				right--;
				if (right != 0) {
					System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
					System.out.println("Kalan hakkınız : " + right);
				} else {
					System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
					break;
				}
			}

		}

	}

}
