import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ReadFile {

public void readFile(){

StringBuilder contents = new StringBuilder();
    
    try {
      //use buffering, reading one line at a time
      //FileReader always assumes default encoding is OK!
      BufferedReader input =  new BufferedReader(new FileReader("/home/littlecegian/Downloads/mallet/TestFile.txt"));
      try {
        String line = null; //not declared within while loop
        /*
        * readLine is a bit quirky :
        * it returns the content of a line MINUS the newline.
        * it returns null only for the END of the stream.
        * it returns an empty String if two newlines appear in a row.
        */
        while (( line = input.readLine()) != null){
          contents.append(line);
          contents.append(" ");
         //contents.append(System.getProperty("line.separator"));
        }
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/home/littlecegian/Downloads/mallet/InputFile.txt", true)));
        out.print("Coversation.txt ");
        out.print(12+ " ");
        out.println(contents);
        out.close();
      }
      finally {
    	  System.out.println(contents);
    	  input.close();
      }
    }
    catch (IOException ex){
      ex.printStackTrace();
    }
    
    
  }

}



