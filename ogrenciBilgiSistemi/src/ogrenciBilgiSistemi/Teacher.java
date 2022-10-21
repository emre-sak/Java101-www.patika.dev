package ogrenciBilgiSistemi;

public class Teacher {
	
	String name;
	String mpno;
	String branch;
	
	public Teacher(String name, String mpno, String branch) {
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
	
	public void print() {
		System.out.println("Ad : " + name);
		System.out.println("Telefonu : " + mpno);
		System.out.println("Bölümü : " + branch);
	}
	
	
	

}
