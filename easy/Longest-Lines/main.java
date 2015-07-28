import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		List<String> result = new ArrayList<String>();
		
		while ((line = buffer.readLine()) != null) {
			result.add(line);
		}

		int number = Integer.parseInt(result.get(0));

		result.remove(0);

		Collections.sort(result, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.valueOf(o2.length()).compareTo(o1.length());
			}
		});

		for (int i = 0; i < number; i++) {
			System.out.println(result.get(i));

		}
	}
}
