package ClassAndObject;

public class FinalizeConcept {
	
	protected void finalize() {  //even public works
		System.out.println("Finalize Method");
	}

	public static void main(String[] args) {
		FinalizeConcept f = new FinalizeConcept();
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f3 = new FinalizeConcept();
		f.finalize();
		f=null;
		f1=null;
		f3=null;
		
		System.gc();
		System.out.println("*******************************");
   // f.finalize();//NullPointerException as it is empty
	}

}
