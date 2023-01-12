package order2;

public class Main {

	public static void main(String[] args) {
		School university = new University();
		Student underGrade = university.createStudent();
		underGrade.graduate();
		
		School highSchool = new HighSchool();
		Student highSchoolStdent = highSchool.createStudent();
		highSchoolStdent.graduate();
	}

}
