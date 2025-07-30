package collections.intro;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Forward iteration
        System.out.println("Forward iteration:");
        ListIterator<String> listIterator = colors.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Backward iteration
        System.out.println("\nBackward iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
