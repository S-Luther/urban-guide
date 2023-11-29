package App;

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


        Scanner scan = new Scanner("Smith, Johnson,Williams,Brown,Jones,Miller,Davis,Garcia,Rodriguez");

        scan.useDelimiter(",\\s*");

        int n = r.nextInt(9)+1;

        String name = "";

        for(int i = 0; i < n; i++){
            name = scan.next();
        }



        System.out.println(Culture.getClass().getName() + " named " + name);
    }
}
