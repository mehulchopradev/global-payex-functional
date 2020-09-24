package com.xyz;

import java.util.Scanner;
import java.util.stream.IntStream;

public class OddNos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit = scanner.nextInt();

        // print all the odd numbers from 0 to upperLimit
        // (1, upperLimit) - (1, 2, 3, 4, ..... 10) - foreach number in range - I can apply my code
        // Stream of numbers
        IntStream.rangeClosed(1, upperLimit)
                .forEach(value -> {
                    if (value % 2 != 0) {
                        System.out.println(value);
                    }
                });
    }
}
