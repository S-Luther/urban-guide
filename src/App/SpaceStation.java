package App;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import App.Culture.stance;
import Cultures.Gibberish;
import Cultures.HermitCrabPeople;
import Cultures.Jedi;
import Cultures.Klingon;
import Cultures.Rakis;
import Cultures.Space;
import Cultures.Viltrumites;

public class SpaceStation <T> {
    private String[][] map;
    private ArrayList<Thing> things = new ArrayList<>();
    private ArrayList<Being> citizens = new ArrayList<>();

    private T Culture;

    private ArrayList<SpaceStation> neighbors = new ArrayList<>();

    private int team;

    private Random r = new Random();

    public SpaceStation(T culture){
        Culture = culture;
        System.out.println("A Station of Culture: "+Culture.getClass().getName()+" has been created!");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        int rand = r.nextInt(50) + 10;


    
        for(int i = 0; i < rand; i++){
            switch(r.nextInt(7)){
                case 0:
                    citizens.add(new Being<Klingon>(new Klingon()));
                case 1:
                    citizens.add(new Being<Jedi>(new Jedi()));
                case 2:
                    citizens.add(new Being<HermitCrabPeople>(new HermitCrabPeople()));
                case 3:    
                    citizens.add(new Being<Rakis>(new Rakis()));
                case 4:
                    citizens.add(new Being<Gibberish>(new Gibberish()));
                case 5:
                    citizens.add(new Being<Space>(new Space()));
                case 6:
                    citizens.add(new Being<Viltrumites>(new Viltrumites()));
            }
        }

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }

    private void challenge(stance s){

    }

    public stance respond(){
        return null;
    }
}
//woohoo!