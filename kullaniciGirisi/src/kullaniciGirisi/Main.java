package kullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Kullanıcı Adınız : ");
		String userName = scanner.nextLine();
		System.out.print("Şifreniz : ");
		String password = scanner.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş Yaptınız !");
		} else {
			System.out.println("Bilgileriniz Yanlış.");
			System.out.println("Şifrenizi sıfırlamak istiyor musunuz? (evet veya hayır yazın). ");
			String reply = scanner.nextLine().toLowerCase();
			if (reply.equals("evet")) {
				System.out.print("Yeni şifrenizi giriniz : ");
				String newPassword = scanner.nextLine();
				if (newPassword.equals("java123")) {
					
					while (true) {
						System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
						System.out.print("Yeni şifrenizi giriniz : ");
						newPassword = scanner.nextLine();

						if (!newPassword.equals("java123")) {
							System.out.println("Şifre oluşturuldu.");
							break;
						}

					}

				} else {
					System.out.println("Şifre oluşturuldu.");
				}

			} else {
				return;
			}

		}

	}

}
