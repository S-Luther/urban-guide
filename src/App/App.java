package App;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import Cultures.Gibberish;
import Cultures.HermitCrabPeople;
import Cultures.Jedi;
import Cultures.Klingon;
import Cultures.Rakis;
import Cultures.Space;
import Cultures.Viltrumites;

public class App {
    static ArrayList<SpaceStation> Stations = new ArrayList<>();
    public static void main(String[] args){

        boolean go = true;
        int counter = 0;

        Random r = new Random(1);

        while(go){

            switch(r.nextInt(7)){
                case 0:
                    Stations.add(new SpaceStation<Klingon>(new Klingon()));
                case 1:
                    Stations.add(new SpaceStation<Jedi>(new Jedi()));
                case 2:
                    Stations.add(new SpaceStation<HermitCrabPeople>(new HermitCrabPeople()));
                case 3:    
                    Stations.add(new SpaceStation<Rakis>(new Rakis()));
                case 4:
                    Stations.add(new SpaceStation<Gibberish>(new Gibberish()));
                case 5:
                    Stations.add(new SpaceStation<Space>(new Space()));
                case 6:
                    Stations.add(new SpaceStation<Viltrumites>(new Viltrumites()));
            }

            counter++;
            if(counter==10){
                go = false;
            }
        }
        
    }
}
