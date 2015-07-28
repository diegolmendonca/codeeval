import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
    	File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] stringArray = line.split("[^a-zA-Z]+");
            StringBuffer stringBuffer = new StringBuffer();
            
            
            for (String string : stringArray) {
            	stringBuffer.append(string.toLowerCase() + " ");
			}
            
           System.out.println(stringBuffer.toString().trim());
        }
    }


}
