package order1;

public class WordFile extends File {

	@Override
	public void open() {
		System.out.println("open Word file.");

	}

	@Override
	public void save() {
		System.out.println("save Word file.");

	}

}
