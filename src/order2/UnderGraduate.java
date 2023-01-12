package order2;

public class UnderGraduate extends Student {

	@Override
	void enroll() {
		System.out.println("UnderGraduate has enroll.");
		
	}

	@Override
	void graduate() {
		System.out.println("Congratulations, the student has graduated.");
		
	}

}
