package ClassAndObject;

public class Student1 {

	Student1(){
	System.out.println("Name : Unknown");	
	}
	Student1(String x){
		System.out.println("Name : "+x);	
		}
	public static void main(String[] args) {
		
		Student1 s=new Student1();
		Student1 s1=new Student1("SaiRam");
		Student1 s2=new Student1("Harshini");
		Student1 s3=new Student1();
		Student1 s4=new Student1("Ganesha");
	}

}
