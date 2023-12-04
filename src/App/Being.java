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
    Random r = new Random();
    String name;

    private int happiness = 50;

    private int[][] enneagramCombos = {
                                        {1,4,7},
                                        {1,7,4},
                                        {2,4,8},
                                        {2,8,4},
                                        {3,6,9},
                                        {3,9,6},
                                        {4,1,2},
                                        {4,2,1},
                                        {5,7,8},
                                        {5,8,7},
                                        {6,9,3},
                                        {6,3,9},
                                        {7,1,5},
                                        {7,5,1},
                                        {8,2,5},
                                        {8,5,2},
                                        {9,3,6},
                                        {9,6,3},
                                     };
    private int[][] enneagramCompat = {
                                    {1,2,9},
                                    {2,4,8},
                                    {3,1,9},
                                    {4,2,9},
                                    {5,1},
                                    {6,8,9,2},
                                    {7,5,1},
                                    {8,2,9},
                                    {9,4,6}
                                    };
    private int[][] enneagramNonCompat = {
                                        {7},
                                        {},
                                        {},
                                        {8},
                                        {9},
                                        {},
                                        {},
                                        {4},
                                        {5}
                                        };

    public Being(T culture){

        personality = pickRandom(enneagramCombos);

        Culture = culture;

        Scanner scan = null;

        try {
            scan = new Scanner(new BufferedReader(new FileReader("src\\App\\name.txt")));
            scan.useDelimiter(",\\s*");
    
            int n = r.nextInt(3000)+1;
    
            name = "";
    
            for(int i = 0; i < n; i++){
                name = scan.next();
                name = name.replace("\"", "");
            }
    
            System.out.println(((Culture) Culture).name() + " named " + name + " with a " + personality[0] + " type personality.");

        } catch (Exception e) {
            
        }
        finally{
            scan.close();
        }
    }

    private <T> T pickRandom(T[] array){
        return array[r.nextInt(array.length)];
    }

    private <T> boolean contains(T i, T[] arr){
        for(T el: arr){
            if(i==el){
                return true;
            }
        }
        return false;
    }
    private boolean contains(int i, int[] arr) {
        for(int el: arr){
            if(i==el){
                return true;
            }
        }
        return false;    
    }


    public void interact(Being b){
        if(contains(b.personality[0], enneagramCompat[personality[0]-1])){
            happiness = happiness + 2;
            System.out.println(name + " has interacted with " + b.name + " and is having a pleasant time.  Their happiness stat is: " + happiness+ " their personality is " + personality[0]);
            if(contains(personality[0], enneagramCompat[b.personality[0]-1])){
                System.out.println(b.name + " seems to be enjoying themselves as well.");
                b.happiness = b.happiness + 2;

            }
            else if(contains(personality[0], enneagramNonCompat[b.personality[0]-1])){
                System.out.println(b.name + " is livid with rage.");
                b.happiness = b.happiness - 5;
            }
        }
        else if(contains(b.personality[0], enneagramNonCompat[personality[0]-1])){
            happiness = happiness - 5;
            System.out.println(name + " has interacted with " + b.name + " and is having an awful time. Their happiness stat is: " + happiness+ " their personality is " + personality[0]);

            if(contains(personality[0], enneagramCompat[b.personality[0]-1])){
                System.out.println(b.name + " seems to be enjoying themselves as well.");
                b.happiness = b.happiness + 2;

            }
            else if(contains(personality[0], enneagramNonCompat[b.personality[0]-1])){
                System.out.println(b.name + " is livid with rage.");
                b.happiness = b.happiness - 5;
            }
        }
        else{
            happiness = happiness - 1;
        }

    }

}
