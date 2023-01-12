package order1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		try {
			boolean isExit = false;
			do {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Class's Name for create: ");
				String className = sc.nextLine();
				if (className.equals("exit")) {
					isExit = true;
					continue;
				}
				className = "order1." + className;
				Class<?> c;
				Application app;
				File file;
				c = Class.forName(className);

				app = (Application)c.newInstance();
				file = app.createFile();
				file.open();
				file.save();
			} while (!isExit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
