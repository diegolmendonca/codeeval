import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		Pattern pattern = Pattern.compile("\"id\": \\d+, \"label\"");

		while ((line = buffer.readLine()) != null) {

			Matcher matcher = pattern.matcher(line);

			int i = 0;
			while (matcher.find()) {
				i += Integer.parseInt(matcher.group().substring(matcher.group().indexOf(":") + 2, matcher.group().indexOf(",")));
			}

			System.out.println(i);

		}
	}
}
