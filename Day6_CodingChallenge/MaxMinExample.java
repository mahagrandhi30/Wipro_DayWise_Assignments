package collections.intro;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(33);
        numbers.add(67);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Numbers in the list: " + numbers);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
