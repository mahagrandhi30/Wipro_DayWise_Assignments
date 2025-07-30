package collections.intro;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // Adding elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Languages List: " + languages);

        // Accessing element at index 2
        String secondLanguage = languages.get(2);
        System.out.println("Language at index 2: " + secondLanguage);

        // Removing element at index 1
        languages.remove(1);
        System.out.println("After removing index 1: " + languages);

        // Updating element at index 0
        languages.set(0, "TypeScript");
        System.out.println("After updating index 0: " + languages);
    }
}
