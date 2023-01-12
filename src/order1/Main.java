package order1;

public class Main {

	public static void main(String[] args) {
		Application app;
		File file;
		app = new WordApp();
		file = app.createFile();
		file.open();
		file.save();
		
		app = new ExcelApp();
		file = app.createFile();
		file.open();
		file.save();
		
		app = new NotePadApp();
		file = app.createFile();
		file.open();
		file.save();
	}

}
