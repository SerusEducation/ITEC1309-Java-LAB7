package order2;

public class HighSchool extends School {
	@Override
	Student createStudent() {
		System.out.println("A HighSchoolStudent has registered.");
		return new HighSchoolStudent();
	}

}
