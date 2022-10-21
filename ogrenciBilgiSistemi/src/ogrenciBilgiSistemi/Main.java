package ogrenciBilgiSistemi;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher("Mahmut Hoca", "555", "TRH");
		Teacher teacher2 = new Teacher("Graham Bell", "000", "FZK");
		Teacher teacher3 = new Teacher("Külyutmaz", "111", "BIO");
		
		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(teacher1);
		
		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(teacher2);
		
		Course biyo = new Course("Biyoloji", "103", "BIO");
		biyo.addTeacher(teacher3);
		
		Student student1 = new Student(tarih,biyo,fizik, "İnek Şaban", "123", "4");
		student1.addBulkExamNote(100, 78, 50);
		student1.addSNote(67, 40, 50);
		student1.isPass();
		
		Student student2 = new Student(tarih,biyo,fizik, "Güdük Necmi", "444", "5");
		student2.addBulkExamNote(60, 94, 30);
		student2.addSNote(10, 70, 20);
		student2.isPass();
	}

}
