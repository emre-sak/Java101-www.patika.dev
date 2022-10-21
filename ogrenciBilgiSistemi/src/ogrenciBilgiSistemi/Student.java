package ogrenciBilgiSistemi;

public class Student {

	Course course1;
	Course course2;
	Course course3;
	String name;
	String stuNo;
	String classes;
	double avarage;
	boolean isPass;

	public Student(Course course1, Course course2, Course course3, String name, String stuNo, String classes) {
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
	}

	public void addBulkExamNote(int courseNote1, int courseNote2, int courseNote3) {

		if (courseNote1 >= 0 && courseNote1 <= 100) {
			this.course1.note = courseNote1;
		}

		if (courseNote2 >= 0 && courseNote2 <= 100) {
			this.course2.note = courseNote2;
		}

		if (courseNote3 >= 0 && courseNote3 <= 100) {
			this.course3.note = courseNote3;
		}

	}

	public void addSNote(int sNote1, int sNote2, int sNote3) {
		if (sNote1 >= 0 && sNote1 <= 100) {
			this.course1.sNote = sNote1;
		}

		if (sNote2 >= 0 && sNote2 <= 100) {
			this.course2.sNote = sNote2;
		}

		if (sNote3 >= 0 && sNote3 <= 100) {
			this.course3.sNote = sNote3;
		}
	}

	public double avarage() {

		this.avarage = (((this.course1.sNote * 0.20 + this.course1.note * 0.80)
				+ (this.course2.sNote * 0.20 + this.course2.note * 0.80)
				+ (this.course3.sNote * 0.20 + this.course3.note * 0.80)) / 3.0);

		return this.avarage;

	}

	public void isPass() {

		this.isPass = isCheckPass();
		printNote();
		if (this.isPass) {
			System.out.println("Sınıfı Geçti.");
		} else {
			System.out.println("Sınıfta Kaldı.");
		}

	}

	public boolean isCheckPass() {
		avarage();
		return this.avarage > 55;
	}

	public void printNote() {
		System.out.println(this.name + "'in " + this.course1.name + " Notu : " + this.course1.note);
		System.out.println(this.name + "'in " + this.course1.name + " Sözlü Notu : " + this.course1.sNote);
		System.out.println(this.name + "'in " + this.course2.name + " Notu : " + this.course2.note);
		System.out.println(this.name + "'in " + this.course2.name + " Sözlü Notu : " + this.course2.sNote);
		System.out.println(this.name + "'in " + this.course3.name + " Notu : " + this.course3.note);
		System.out.println(this.name + "'in " + this.course3.name + " Sözlü Notu : " + this.course3.sNote);
		System.out.println(this.name + "'in " + "Ortalaması : " + this.avarage);
	}

}
