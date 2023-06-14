package Sample;

abstract class ab{
	
	ab(){
		System.out.println("Constructor of abstract class");
	}
	
	void someMethod() {
		System.out.println("Regular method of abstract class");
	}
	
	abstract void abMethod();
}

class bc extends ab{
	
	void abMethod() {
		System.out.println("Implmenting abstract body");
	}
}

class test {
	
	public static void main(String[] args) {
		
		ab a = new bc();
		a.abMethod();
		a.someMethod();
	}
}