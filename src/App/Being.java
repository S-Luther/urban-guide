package App;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Being <T> extends Entity {
    private ArrayList<Thing> items = new ArrayList<>();
    private T Culture;
    public int[] personality = new int[3];

    public Being(T culture){
        Random r = new Random();

        Culture = culture;

        Scanner scan = null;

        try {
            scan = new Scanner(new BufferedReader(new FileReader("src\\App\\name.txt")));
            scan.useDelimiter(",\\s*");
    
            int n = r.nextInt(3000)+1;
    
            String name = "";
    
            for(int i = 0; i < n; i++){
                name = scan.next();
                name = name.replace("\"", "");
            }
    
            System.out.println(Culture.getClass().getName() + " named " + name);

        } catch (Exception e) {
            
        }
        finally{
            scan.close();
        }



    }
}
