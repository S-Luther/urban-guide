package Cultures;

import java.util.Random;

import App.Culture;

public class HermitCrabPeople implements Culture {

    Random rand = new Random();

    public stance strategy() {
        return stance.DEFENSIVE;
    }

    public stance diplomacy() {
        if (rand.nextInt(5) == 0) {
            return stance.DEFENSIVE;    
        } else {
            return stance.BALANCED;
        }
        
    }

    public void special(){
        System.out.println("Quick! Hide in your shell!");
    }

}
