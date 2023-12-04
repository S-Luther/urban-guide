package Cultures;

import java.util.Random;

import App.Culture;

public class Centaurians implements Culture{

    Random r = new Random();

    public stance strategy() {
        if(r.nextBoolean()){
            return stance.DEFENSIVE;
        }else{
            return stance.BALANCED;
        }
    }


    public stance diplomacy() {
        return stance.DEFENSIVE;
    }

    public void special(){
        System.out.println("Back off!");
    }

     public String name(){
        return "Centaurians";
    }
    
}
