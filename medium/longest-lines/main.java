import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.valueOf(o2.length()).compareTo(o1.length());
			}
		});
		
		
		int numberOfWords = Integer.parseInt(buffer.readLine());
		
		
		while ((line = buffer.readLine()) != null) {
				ts.add(line);

		}


		for (int i = 0; i < numberOfWords; i++) {
			System.out.println(ts.pollFirst());

		}
	}
}
