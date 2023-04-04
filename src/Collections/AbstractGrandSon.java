package Collections;

public  class AbstractGrandSon extends AbstractSon{

	void software() {
		System.out.println("software from AbstractGrandSon");
	}

	@Override
	void salt() {
		System.out.println("Abstract Salt from AbstractFather ");
	}

	@Override
	void tata() {

		System.out.println("Abstract tata from AbstractGrandFather ");
	
	}
	
}
