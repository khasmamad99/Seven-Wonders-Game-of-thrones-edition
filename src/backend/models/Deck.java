package backend.models;

import java.util.ArrayList;

import static backend.models.Numbers.arr;

public class Deck {
    int o = 2;
    int w = 3;
    int c = 5;
    int so = 7;
    int d = 11;
    int p = 13;
    int si = 17;
    private boolean direction;
    private ArrayList<Card> cards;

    public Deck(int noOfPlayers, int age){
        //ArrayList<Card> currAgeCards;
        //TODO ?= init Cards(age);
        /*for(int i = 0; i < currAgeCards.size(); i++)
        {
            if( currAgeCards.get(i).cardFreq <= noOfPlayers)
                cards.add(currAgeCards.get(i));
        }*/
    }
    public ArrayList<Card> getCards() {
        return cards;
    }

    private ArrayList<Card> initAge1(){
        String path = "" ;
        ArrayList<Card> cards1 = new ArrayList<Card>();
        //Resources Age 1
        cards1.add(new Resource("Lumber Yard",
                3,
                1,
                new Cost(0,"",1),
                path + "Lumber Yard" + "image",
                path + "Lumber Yard" + "icon",
                path + "Lumber Yard" + "back",
                "",
                "",
                arr(w)
                ));
        cards1.add(new Resource("Lumber Yard",
                4,
                1,
                new Cost(0,"",1),
                path + "Lumber Yard" + "image",
                path + "Lumber Yard" + "icon",
                path + "Lumber Yard" + "back",
                "",
                "",
                arr(w)
        ));
        cards1.add(new Resource("Stone Pit",
                3,
                1,
                new Cost(0,"",1),
                path + "Stone Pit" + "image",
                path + "Stone Pit" + "icon",
                path + "Stone Pit" + "back",
                "",
                "",
                arr(so)
        ));
        cards1.add(new Resource("Stone Pit",
                5,
                1,
                new Cost(0,"",1),
                path + "Stone Pit" + "image",
                path + "Stone Pit" + "icon",
                path + "Stone Pit" + "back",
                "",
                "",
                arr(so)
        ));
        cards1.add(new Resource("Clay Pool",
                3,
                1,
                new Cost(0,"",1),
                path + "Clay Pool" + "image",
                path + "Clay Pool" + "icon",
                path + "Clay Pool" + "back",
                "",
                "",
                arr(c)
        ));
        cards1.add(new Resource("Clay Pool",
                5,
                1,
                new Cost(0,"",1),
                path + "Clay Pool" + "image",
                path + "Clay Pool" + "icon",
                path + "Clay Pool" + "back",
                "",
                "",
                arr(c)
        ));
        cards1.add(new Resource("Ore Vein",
                3,
                1,
                new Cost(0,"",1),
                path + "Ore Vein" + "image",
                path + "Ore Vein" + "icon",
                path + "Ore Vein" + "back",
                "",
                "",
                arr(o)
        ));
        cards1.add(new Resource("Ore Vein",
                4,
                1,
                new Cost(0,"",1),
                path + "Ore Vein" + "image",
                path + "Ore Vein" + "icon",
                path + "Ore Vein" + "back",
                "",
                "",
                arr(o)
        ));
        cards1.add(new Resource("Tree Farm",
                6,
                1,
                new Cost(1,"",1),
                path + "Tree Farm" + "image",
                path + "Tree Farm" + "icon",
                path + "Tree Farm" + "back",
                "",
                "",
                arr(w,c)
        ));
        cards1.add(new Resource("Excavation",
                4,
                1,
                new Cost(1,"",1),
                path + "Excavation" + "image",
                path + "Excavation" + "icon",
                path + "Excavation" + "back",
                "",
                "",
                arr(so,c)
        ));
        cards1.add(new Resource("Clay Pit",
                3,
                1,
                new Cost(1,"",1),
                path + "Clay Pit" + "image",
                path + "Clay Pit" + "icon",
                path + "Clay Pit" + "back",
                "",
                "",
                arr(o,c)
        ));
        cards1.add(new Resource("Timber Yard",
                3,
                1,
                new Cost(1,"",1),
                path + "Timber Yard" + "image",
                path + "Timber Yard" + "icon",
                path + "Timber Yard" + "back",
                "",
                "",
                arr(so,w)
        ));
        cards1.add(new Resource("Forest Cave",
                5,
                1,
                new Cost(1,"",1),
                path + "Forest Cave" + "image",
                path + "Forest Cave" + "icon",
                path + "Forest Cave" + "back",
                "",
                "",
                arr(o,w)
        ));
        cards1.add(new Resource("Mine",
                6,
                1,
                new Cost(1,"",1),
                path + "Mine" + "image",
                path + "Mine" + "icon",
                path + "Mine" + "back",
                "",
                "",
                arr(so,o)
        ));
        cards1.add(new Resource("Loom",
                3,
                1,
                new Cost(0,"",1),
                path + "Loom" + "image",
                path + "Loom" + "icon",
                path + "Loom" + "back",
                "",
                "",
                arr(si)
        ));
        cards1.add(new Resource("Loom",
                6,
                1,
                new Cost(0,"",1),
                path + "Loom" + "image",
                path + "Loom" + "icon",
                path + "Loom" + "back",
                "",
                "",
                arr(si)
        ));
        cards1.add(new Resource("Glassworks",
                3,
                1,
                new Cost(0,"",1),
                path + "Glassworks" + "image",
                path + "Glassworks" + "icon",
                path + "Glassworks" + "back",
                "",
                "",
                arr(d)
        ));
        cards1.add(new Resource("Glassworks",
                6,
                1,
                new Cost(0,"",1),
                path + "Glassworks" + "image",
                path + "Glassworks" + "icon",
                path + "Glassworks" + "back",
                "",
                "",
                arr(d)
        ));
        cards1.add(new Resource("Press",
                3,
                1,
                new Cost(0,"",1),
                path + "Press" + "image",
                path + "Press" + "icon",
                path + "Press" + "back",
                "",
                "",
                arr(p)
        ));
        cards1.add(new Resource("Press",
                6,
                1,
                new Cost(0,"",1),
                path + "Press" + "image",
                path + "Press" + "icon",
                path + "Press" + "back",
                "",
                "",
                arr(p)
        ));
        //Civics Age 1
        cards1.add(new Civic("Pawnshop",
                4,
                1,
                new Cost(0, "", 1),
                path + "Pawnshop" + "image",
                path + "Pawnshop" + "icon",
                path + "Pawnshop" + "back",
                "",
                "",
                3,
                0
                ));
        cards1.add(new Civic("Pawnshop",
                7,
                1,
                new Cost(0, "", 1),
                path + "Pawnshop" + "image",
                path + "Pawnshop" + "icon",
                path + "Pawnshop" + "back",
                "",
                "",
                3,
                0
        ));
        cards1.add(new Civic("Baths",
                3,
                1,
                new Cost(0, "", si),
                path + "Baths" + "image",
                path + "Baths" + "icon",
                path + "Baths" + "back",
                "Aquaduct",
                "",
                3,
                0
        ));
        cards1.add(new Civic("Baths",
                7,
                1,
                new Cost(0, "", si),
                path + "Baths" + "image",
                path + "Baths" + "icon",
                path + "Baths" + "back",
                "Aquaduct",
                "",
                3,
                0
        ));
        cards1.add(new Civic("Altar",
                3,
                1,
                new Cost(0, "", 1),
                path + "Altar" + "image",
                path + "Altar" + "icon",
                path + "Altar" + "back",
                "Temple",
                "",
                2,
                0
        ));
        cards1.add(new Civic("Altar",
                5,
                1,
                new Cost(0, "", 1),
                path + "Altar" + "image",
                path + "Altar" + "icon",
                path + "Altar" + "back",
                "Temple",
                "",
                2,
                0
        ));
        cards1.add(new Civic("Theater",
                3,
                1,
                new Cost(0, "", 1),
                path + "Theater" + "image",
                path + "Theater" + "icon",
                path + "Theater" + "back",
                "Statue",
                "",
                2,
                0
        ));
        cards1.add(new Civic("Theater",
                6,
                1,
                new Cost(0, "", 1),
                path + "Theater" + "image",
                path + "Theater" + "icon",
                path + "Theater" + "back",
                "Statue",
                "",
                2,
                0
        ));
        cards1.add(new Civic("Theater",
                6,
                1,
                new Cost(0, "", 1),
                path + "Theater" + "image",
                path + "Theater" + "icon",
                path + "Theater" + "back",
                "Statue",
                "",
                2,
                0
        ));
        //Military Age 1
        
        return cards1;
    }
    private ArrayList<Card> initAge2(){
        String path = "" ;
        ArrayList<Card> cards1 = new ArrayList<Card>();
        //Resources Age 2
        cards1.add(new Resource("Sawmill",
                3,
                2,
                new Cost(1,"",1),
                path + "Sawmill" + "image",
                path + "Sawmill" + "icon",
                path + "Sawmill" + "back",
                "",
                "",
                arr(w*w)
        ));
        cards1.add(new Resource("Sawmill",
                4,
                2,
                new Cost(1,"",1),
                path + "Sawmill" + "image",
                path + "Sawmill" + "icon",
                path + "Sawmill" + "back",
                "",
                "",
                arr(w*w)
        ));
        cards1.add(new Resource("Quarry",
                3,
                1,
                new Cost(1,"",1),
                path + "Quarry" + "image",
                path + "Quarry" + "icon",
                path + "Quarry" + "back",
                "",
                "",
                arr(so*so)
        ));
        cards1.add(new Resource("Quarry",
                4,
                2,
                new Cost(1,"",1),
                path + "Quarry" + "image",
                path + "Quarry" + "icon",
                path + "Quarry" + "back",
                "",
                "",
                arr(so*so)
        ));
        cards1.add(new Resource("Brickyard",
                3,
                2,
                new Cost(1,"",1),
                path + "Brickyard" + "image",
                path + "Brickyard" + "icon",
                path + "Brickyard" + "back",
                "",
                "",
                arr(c*c)
        ));
        cards1.add(new Resource("Brickyard",
                4,
                2,
                new Cost(1,"",1),
                path + "Brickyard" + "image",
                path + "Brickyard" + "icon",
                path + "Brickyard" + "back",
                "",
                "",
                arr(c*c)
        ));
        cards1.add(new Resource("Foundry",
                3,
                2,
                new Cost(1,"",1),
                path + "Foundry" + "image",
                path + "Foundry" + "icon",
                path + "Foundry" + "back",
                "",
                "",
                arr(c*c)
        ));
        cards1.add(new Resource("Foundry",
                4,
                2,
                new Cost(1,"",1),
                path + "Foundry" + "image",
                path + "Foundry" + "icon",
                path + "Foundry" + "back",
                "",
                "",
                arr(c*c)
        ));
        cards1.add(new Resource("Loom",
                3,
                2,
                new Cost(0,"",1),
                path + "Loom" + "image",
                path + "Loom" + "icon",
                path + "Loom" + "back",
                "",
                "",
                arr(si)
        ));
        cards1.add(new Resource("Loom",
                5,
                2,
                new Cost(0,"",1),
                path + "Loom" + "image",
                path + "Loom" + "icon",
                path + "Loom" + "back",
                "",
                "",
                arr(si)
        ));
        cards1.add(new Resource("Glassworks",
                3,
                2,
                new Cost(0,"",1),
                path + "Glassworks" + "image",
                path + "Glassworks" + "icon",
                path + "Glassworks" + "back",
                "",
                "",
                arr(d)
        ));
        cards1.add(new Resource("Glassworks",
                5,
                1,
                new Cost(0,"",1),
                path + "Glassworks" + "image",
                path + "Glassworks" + "icon",
                path + "Glassworks" + "back",
                "",
                "",
                arr(d)
        ));
        cards1.add(new Resource("Press",
                3,
                1,
                new Cost(0,"",1),
                path + "Press" + "image",
                path + "Press" + "icon",
                path + "Press" + "back",
                "",
                "",
                arr(p)
        ));
        cards1.add(new Resource("Press",
                5,
                1,
                new Cost(0,"",1),
                path + "Press" + "image",
                path + "Press" + "icon",
                path + "Press" + "back",
                "",
                "",
                arr(p)
        ));
        //Civics Age 2
        cards1.add(new Civic("Aquaduct",
                3,
                2,
                new Cost(0, "Baths", si*si*si),
                path + "Aquaduct" + "image",
                path + "Aquaduct" + "icon",
                path + "Aquaduct" + "back",
                "Statue",
                "",
                5,
                0
        ));
        cards1.add(new Civic("Aquaduct",
                7,
                2,
                new Cost(0, "Baths", si*si*si),
                path + "Aquaduct" + "image",
                path + "Aquaduct" + "icon",
                path + "Aquaduct" + "back",
                "Statue",
                "",
                5,
                0
        ));
        cards1.add(new Civic("Temple",
                3,
                2,
                new Cost(0, "Altar", w*c*d),
                path + "Temple" + "image",
                path + "Temple" + "icon",
                path + "Temple" + "back",
                "Pantheon",
                "",
                3,
                0
        ));
        cards1.add(new Civic("Temple",
                6,
                2,
                new Cost(0, "Altar", w*c*d),
                path + "Temple" + "image",
                path + "Temple" + "icon",
                path + "Temple" + "back",
                "Pantheon",
                "",
                3,
                0
        ));
        cards1.add(new Civic("Statue",
                3,
                2,
                new Cost(0, "Theater", o*o*w),
                path + "Statue" + "image",
                path + "Statue" + "icon",
                path + "Statue" + "back",
                "Gardens",
                "",
                4,
                0
        ));
        cards1.add(new Civic("Statue",
                7,
                2,
                new Cost(0, "Theater", o*o*w),
                path + "Statue" + "image",
                path + "Statue" + "icon",
                path + "Statue" + "back",
                "Gardens",
                "",
                4,
                0
        ));
        cards1.add(new Civic("Courthouse",
                3,
                2,
                new Cost(0, "Scriptorum", c*c*si),
                path + "Courthouse" + "image",
                path + "Courthouse" + "icon",
                path + "Courthouse" + "back",
                "",
                "",
                4,
                0
        ));
        cards1.add(new Civic("Courthouse",
                5,
                2,
                new Cost(0, "Scriptorum", c*c*si),
                path + "Courthouse" + "image",
                path + "Courthouse" + "icon",
                path + "Courthouse" + "back",
                "",
                "",
                4,
                0
        ));
        return cards1;
    }
    private ArrayList<Card> initAge3() {
        String path = "";
        ArrayList<Card> cards1 = new ArrayList<Card>();
        cards1.add(new Civic("Pantheon",
                3,
                3,
                new Cost(0, "Temple", c*c*si*o*d*p),
                path + "Pantheon" + "image",
                path + "Pantheon" + "icon",
                path + "Pantheon" + "back",
                "",
                "",
                7,
                0
        ));
        cards1.add(new Civic("Pantheon",
                6,
                3,
                new Cost(0, "Temple", c*c*si*o*d*p),
                path + "Pantheon" + "image",
                path + "Pantheon" + "icon",
                path + "Pantheon" + "back",
                "",
                "",
                7,
                0
        ));
        cards1.add(new Civic("Gardens",
                3,
                3,
                new Cost(0, "Statue", c*c*w),
                path + "Gardens" + "image",
                path + "Gardens" + "icon",
                path + "Gardens" + "back",
                "",
                "",
                5,
                0
        ));
        cards1.add(new Civic("Gardens",
                4,
                3,
                new Cost(0, "Statue", c*c*w),
                path + "Gardens" + "image",
                path + "Gardens" + "icon",
                path + "Gardens" + "back",
                "",
                "",
                5,
                0
        ));
        cards1.add(new Civic("Town Hall",
                3,
                3,
                new Cost(0, "", d*o*so*so),
                path + "Town Hall" + "image",
                path + "Town Hall" + "icon",
                path + "Town Hall" + "back",
                "",
                "",
                6,
                0
        ));
        cards1.add(new Civic("Town Hall",
                5,
                3,
                new Cost(0, "", d*o*so*so),
                path + "Town Hall" + "image",
                path + "Town Hall" + "icon",
                path + "Town Hall" + "back",
                "",
                "",
                6,
                0
        ));
        cards1.add(new Civic("Town Hall",
                6,
                3,
                new Cost(0, "", d*o*so*so),
                path + "Town Hall" + "image",
                path + "Town Hall" + "icon",
                path + "Town Hall" + "back",
                "",
                "",
                6,
                0
        ));
        cards1.add(new Civic("Palace",
                3,
                3,
                new Cost(0, "", d*o*so*p*si*c*w),
                path + "Palace" + "image",
                path + "Palace" + "icon",
                path + "Palace" + "back",
                "",
                "",
                8,
                0
        ));
        cards1.add(new Civic("Palace",
                7,
                3,
                new Cost(0, "", d*o*so*p*si*c*w),
                path + "Palace" + "image",
                path + "Palace" + "icon",
                path + "Palace" + "back",
                "",
                "",
                8,
                0
        ));
        cards1.add(new Civic("Senate",
                3,
                3,
                new Cost(0, "Library", o*so*w*w),
                path + "Senate" + "image",
                path + "Senate" + "icon",
                path + "Senate" + "back",
                "",
                "",
                6,
                0
        ));
        cards1.add(new Civic("Senate",
                5,
                3,
                new Cost(0, "Library", d*o*so*p*si*c*w),
                path + "Senate" + "image",
                path + "Senate" + "icon",
                path + "Senate" + "back",
                "",
                "",
                6,
                0
        ));
        return cards1;
    }
}
