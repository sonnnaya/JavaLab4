package com.company;

import com.company.animals.*;
import com.company.cages.BirdCage;
import com.company.cages.LionCage;
import com.company.cages.UngulateCage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    var ungulateCage = new UngulateCage<>(3);
	    ungulateCage.add(new Zebra("Martin", 13));
	    ungulateCage.add(new Giraffe("Melman", 12));
	    ungulateCage.add(new Zebra("Gloria", 10));
        ungulateCage.remove(new Zebra("Gloria", 10));

        var lionCage = new LionCage(10);
        lionCage.add(new Lion("Gloria", 10));

        var zebraUngulateCage = new UngulateCage<Zebra>(4);
        zebraUngulateCage.add(new Zebra("Gloria", 10));

        var giraffeUngulateCage = new UngulateCage<Giraffe>(3);
        giraffeUngulateCage.add(new Giraffe("Melman", 12));

        var eagleBirdCage = new BirdCage<Eagle>(2);
        eagleBirdCage.add(new Eagle("Desert", 11));

        var ungulateCageList = new ArrayList<UngulateCage>();
        ungulateCageList.add(ungulateCage);
        ungulateCageList.add(zebraUngulateCage);
        ungulateCageList.add(giraffeUngulateCage);


        Zoo zoo = new Zoo();
        zoo.addCageList(ungulateCageList);
        zoo.<LionCage>addCage(lionCage);
        zoo.<BirdCage>addCage(eagleBirdCage);
        System.out.println(zoo.getCountOfAnimals());
    }
}
