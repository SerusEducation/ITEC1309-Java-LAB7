package order1;

public class ExcelFile extends File {

	@Override
	public void open() {
		System.out.println("open Excel file.");

	}

	@Override
	public void save() {
		System.out.println("save Excel file.");

	}

}
