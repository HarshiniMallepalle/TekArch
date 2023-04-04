package ClassAndObject;

public class ThisAndConstructor {
 String name;
 int age;
 
 public  ThisAndConstructor(String name, int age) {
	this.name=name;
	 this.age=age;
	 System.out.println("Name  :"+name);
	 System.out.println("Age   :"+age);
 }
	
	public static void main(String[] args) {
		ThisAndConstructor obj= new ThisAndConstructor("SaiRam",1000);
		
		//obj.name="Sai";//overloading SaiRam to Sai
       //obj.age=500;//overloading 1000 to 100
		
System.out.println(obj.name+"  "+obj.age);
	}

}
