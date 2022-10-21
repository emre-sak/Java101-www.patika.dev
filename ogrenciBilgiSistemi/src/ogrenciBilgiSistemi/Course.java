package ogrenciBilgiSistemi;

public class Course {
	
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int sNote;
	
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.sNote = 0;
	}
	
	public void printTeacher() {
		this.teacher.print();
	}
	
	public void addTeacher(Teacher teacher) {
		
		if(this.prefix.equals(teacher.branch)) {
			this.teacher = teacher;
			//printTeacher();
		}else {
			System.out.println("Öğretmen ve ders bilgileri uyuşmuyor.");
		}
		
	}
	
	
}
