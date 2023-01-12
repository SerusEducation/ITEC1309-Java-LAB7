package order2;

public class University extends School {

	@Override
	Student createStudent() {
		System.out.println("A UnderGraduate has registered.");
		return new UnderGraduate();
	}

}
