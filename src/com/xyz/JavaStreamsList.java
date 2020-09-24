package com.xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamsList {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(5, 6, 10, 4, 5, 7, 8, 2, 1, 10, 9);

        System.out.println("*********** Get a new list consisting of only even numbers from the nos list *******************");
        // filtering
        /* List<Integer> evens = new ArrayList<>();
        for(Integer no: nos) {
            if (no % 2 == 0) {
                evens.add(no);
            }
        } */

        /* List<Integer> evens = new ArrayList<>();
        nos.forEach(number -> {
            if (number % 2 == 0) {
                evens.add(number);
            }
        }); */

        List<Integer> evens = nos.stream()
                .filter(no -> no % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens);

        System.out.println("*************** Get a count of odd numbers from the nos list ************************************");
        long odds = nos.stream()
                .filter(no -> no % 2 != 0)
                .count();
        System.out.println(odds);

        System.out.println("************** Get a new list consisting of nos from the nos list but with 1 deducted *****************");
        // mapping

        List<Integer> deductedMarks = nos.stream()
                .map(number -> number - 1)
                .collect(Collectors.toList());
        System.out.println(deductedMarks);


        System.out.println("************ Get a new list consisting of even numbers more than 5 and then eventually squared up, distinct elements *********");
        // filtering + mapping

        List<Integer> d = nos.stream()
                .filter(number -> number % 2 == 0 && number > 5)
                .distinct()
                .map(number -> number * number)
                .sorted((e1, e2) -> e1.compareTo(e2))
                .collect(Collectors.toList());
        System.out.println(d);

        Set<Integer> e = nos.stream()
            .filter(number -> number % 2 == 0 && number > 5)
                .map(number -> number * number)
                .sorted((e1, e2) -> e1.compareTo(e2))
                .collect(Collectors.toSet());
        System.out.println(e);

        String q = nos.stream()
                .filter(number -> number % 2 == 0 && number > 5)
                .distinct()
                .map(number -> number * number)
                .sorted((e1, e2) -> e1.compareTo(e2))
                .map(number -> number.toString())
                .collect(Collectors.joining("|"));
        System.out.println(q);
    }
}
