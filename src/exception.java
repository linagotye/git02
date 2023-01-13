import java.io.*;
import java.util.Scanner;

public class exception {
    public static void main (String[] args){
        File file = new File("text.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String context = readFile();
        try {
            PrintWriter pw = new PrintWriter(file);

            Scanner in = new Scanner(System.in);
            String user_input = in.nextLine();
           context += user_input;
            pw.println(user_input);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(readFile());
}
        public static String readFile(){
            BufferedReader br = null;
            String result = "";
            try {
                br = new BufferedReader(new FileReader("text.txt"));
                String line;
                while ((line=br.readLine()) !=null);
                result += line + "\n";
                br.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return result;

    }
}
