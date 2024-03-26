package ro.ase.ie.ct.course.complexity;

public class Test {
	
	//Halstead complexity  = A - N + 2 = 5 - 5 + 2 = 2
	int min(int a, int b) {
		int minimum = 0;
		if(a < b) {
			minimum = a; 
		}
		else {
			minimum = b;
		}
		return minimum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
