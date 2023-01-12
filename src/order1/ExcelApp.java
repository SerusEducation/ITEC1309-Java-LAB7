package order1;

public class ExcelApp extends Application {

	@Override
	File createFile() {
		System.out.println("create Excel file");
		return new ExcelFile();
	}

}
