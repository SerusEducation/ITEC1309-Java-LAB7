package order1;

public class WordApp extends Application {

	@Override
	File createFile() {
		System.out.println("create Word file");
		return new WordFile();
	}

}
