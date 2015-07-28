import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			if (line.length() <= 55) {
				System.out.println(line);
			} else {
				System.out.println(buildTrim(line));
			}
		}
	}

	private static String buildTrim(String line) {
		String[] splitted = line.substring(0, 40).split(" ");
		StringBuilder builder = new StringBuilder();

		if (splitted[0].length() >= 40) {
			return splitted[0].substring(0, 40) + "... <Read More>";
		}

		for (String string : splitted) {
			if (builder.length() + string.length() < 40) {
				builder.append(string + " ");
			}
		}

		return builder.toString().trim() + "... <Read More>";
	}
}
