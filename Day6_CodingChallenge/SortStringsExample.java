package collections.intro;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringsExample {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Delhi");

        System.out.println("Before Sorting:");
        for (String city : cities) {
            System.out.println(city);
        }

        Collections.sort(cities);

        System.out.println("\nAfter Sorting:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
