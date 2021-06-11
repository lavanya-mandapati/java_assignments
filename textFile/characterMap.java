package textFile;
import java.util.*;
import java.io.*;
public class characterMap {
    static String str=null;
    private static Scanner input;

    public static void readFile() throws FileNotFoundException{
        HashMap<Character,Integer>count=new HashMap<Character, Integer>();
        char[]str_array=str.toCharArray();
        for(char c:str_array)
        {
            if(count.containsKey(c))
            {
                count.put(c,count.get(c)+1);
            }
            else
            {
                count.put(c,1);
            }
        }
        for(Map.Entry entry:count.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        }
    public static void main(String[] args)throws FileNotFoundException {
        if (args.length == 0) {
            System.out.println("file name not specified");
        }
        Scanner reader = new Scanner(new FileInputStream(args[0]));
        while (reader.hasNextLine()) {
            str = reader.nextLine();
        }
        characterMap.readFile();
    }
}
