package order2;

public class HighSchoolStudent extends Student {

	@Override
	void enroll() {
		System.out.println("HighSchoolStudent has enroll.");
		
	}

	@Override
	void graduate() {
		System.out.println("Congratulations, the student has graduated.");
		
	}

}
