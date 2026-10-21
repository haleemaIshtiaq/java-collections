package se.lexicon;

import java.util.HashSet;

public class UniqueCities {
    void main(){
        //HashSet stores only unique values
        HashSet<String>  cities = new HashSet<>();
        //Adding cities to hashset
        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");//HashSet ignores duplicate because Stockholm already exists.
        cities.add("Uppsala");
        cities.add("Gothenburg");//HashSet ignores duplicate because Gothenburg already exists.
        cities.add("Lund");

        IO.println("Unique cities: ");
        //Using enhanced loop for printing each unique city.
        for(String city : cities){
            IO.println(city);
        }
        IO.println("Total unique cities are: "  + cities.size());

    }
}
