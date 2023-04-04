package ClassAndObject;

public class TwoStudents {
	String name, address;
	int rool_no;
	long phone_no;

	public static void main(String[] args) {
		TwoStudents a = new TwoStudents();
		a.name = "John";
		a.rool_no = 2;
		a.phone_no = 8234569270l;
		a.address = "9 Downing sq";
		System.out.println("Name     : " + a.name);
		System.out.println("Rool_no. : " + a.rool_no);
		System.out.println("Phone_no.: " + a.phone_no);
		System.out.println("Address  : " + a.address);

		TwoStudents b = new TwoStudents();
		b.name = "Sam";
		b.rool_no = 82;
		b.phone_no = 8392268583l;
		b.address = "Guilderland, NY, 12084";
		System.out.println("Name     : " + b.name);
		System.out.println("Rool_no. : " + b.rool_no);
		System.out.println("Phone_no.: " + b.phone_no);
		System.out.println("Address  : " + b.address);

	}

}
