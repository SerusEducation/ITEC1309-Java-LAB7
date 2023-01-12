package order1;

public class NotePadFile extends File {

	@Override
	public void open() {
		System.out.println("open NotePad file.");

	}

	@Override
	public void save() {
		System.out.println("save NotePad file.");

	}

}
