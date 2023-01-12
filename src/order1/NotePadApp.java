package order1;

public class NotePadApp extends Application {

	@Override
	File createFile() {
		System.out.println("create NotePad file");
		return new NotePadFile();
	}

}
