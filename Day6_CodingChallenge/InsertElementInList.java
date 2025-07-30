package collections.intro;

import java.util.ArrayList;

public class InsertElementInList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original List: " + colors);

        // Insert "Yellow" at index 1
        colors.add(1, "Yellow");

        System.out.println("After Inserting 'Yellow' at index 1: " + colors);
    }
}
