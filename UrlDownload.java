import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDownload {

   public static void main(String[] args) {

      try {
 // Create a URL object and pass url as string
 // to download the webpage 
 // 
 URL url = new URL("http://www.hubberspot.com");
 // Create a BufferedReader Object and pass it with
 // InputStreamReader Object containing an InputStream
 // Object retrieved  from openStream() method of URL
 BufferedReader reader = new BufferedReader
                      (new InputStreamReader(url.openStream()));
 // Create a BufferedWriter Object and pass it with
 // FileWriter Object containing an String
 // representing the file name to which 
 // the webpage is to download. 
 BufferedWriter writer = new BufferedWriter
                      (new FileWriter("hubberspot.html"));
 // Create a String object to read each line 
 // one by one from the stream
 String line;
 // looping till there is no line left to download
 while ((line = reader.readLine()) != null) {
 // Writing each line in the document hubberspot.html 
     writer.write(line);
     // to print each line on next line 
     writer.newLine();
 }
 // Closing the BufferedReader and BufferedWriter object 
 // to free the expensive resources
 reader.close();
 writer.close();
 }// handling two exceptions below 
 // In case URL is malformed MalformedURLException
 // Exception is thrown and 
 // IOException for any input/output failure
    catch (MalformedURLException e) {
 
 e.printStackTrace();
   } catch (IOException e) {
 
 e.printStackTrace();
  }
 }

}

    