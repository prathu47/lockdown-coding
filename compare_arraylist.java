Program that compares counting words in files using an ArrayList and a Map
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class comparecount 
{
  public static void main(String[] args)
    {
        try
        {
            File f = new File("prime.txt");
            Scanner sc;
            sc = new Scanner(f);
            Map<String, Integer> wordCount = new TreeMap<String, Integer>();
            while(sc.hasNext()) 
            {
                String word = sc.next();
                if(!wordCount.containsKey(word))
                    wordCount.put(word, 1);
                else
                    wordCount.put(word, wordCount.get(word) + 1);
            }
            for(String word : wordCount.keySet())
                System.out.println(word + " " + wordCount.get(word));
                 System.out.println(wordCount.size());
        }
        catch(IOException e) 
        {
            System.out.println("Unable to read from file.");
        }
    }
}
