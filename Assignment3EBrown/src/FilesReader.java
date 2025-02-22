package CodersCampusAssignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesReader {

	public static void main(String[] args) {

		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			System.out.println(fileReader.readLine());
			System.out.println(fileReader.readLine());
			System.out.println(fileReader.readLine());
			System.out.println(fileReader.readLine());
		} catch (FileNotFoundException e) {
			System.out.println("FNFE");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOE");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				System.out.println("File Reader Closed");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}