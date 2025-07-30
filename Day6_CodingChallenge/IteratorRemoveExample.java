package collections.intro;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Wolf");

        System.out.println("Original list: " + animals);

        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            if (animal.equalsIgnoreCase("Dog")) {
                iterator.remove(); // Safe way to remove during iteration
            }
        }

        System.out.println("List after removing 'Dog': " + animals);
    }
}
