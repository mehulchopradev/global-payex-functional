package com.xyz;

import java.util.Arrays;
import java.util.List;

public class JavaLists {

    @FunctionalInterface
    interface Action {
        void performAction(Integer e);
    }

    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(5, 6, 10, 4, 5, 7, 8, 2, 1, 10, 9);

        System.out.println("*************** Print all the even marks from the nos list ************************");
        printEvens(nos);

        System.out.println("**************** Print all the odd marks more than 5 from the nos list ****************");
        printOddsMoreThan5(nos);
    }

    // higher order function which abstracts out the looping details
    private static void forEach(List<Integer> elements, Action action) {
        for (Integer element: elements) {
            // what do i do with every element ???? (dynamic code)
            action.performAction(element);
        }
    }

    private static void printOddsMoreThan5(List<Integer> nos) {
        /* class X implements Action {

            @Override
            public void performAction(Integer e) {
                if (e % 2 != 0 && e > 5) {
                    System.out.println(e);
                }
            }
        } */

        // lower order functions to the higher order function
        // lambda expressions
        nos.forEach(no -> {
            if (no % 2 != 0 && no > 5) {
                System.out.println(no);
            }
        });


        /* forEach(nos, e -> {
            if (e % 2 != 0 && e > 5) {
                System.out.println(e);
            }
        }); */

        /* forEach(nos, new Action() {
            @Override
            public void performAction(Integer e) {
                if (e % 2 != 0 && e > 5) {
                    System.out.println(e);
                }
            }
        }); */
        /* for (Integer no: nos) {
            if (no % 2 != 0 && no > 5) {
                System.out.println(no);
            }
        } */
    }

    private static void printEvens(List<Integer> nos) {
        /* class Y implements Action {

            @Override
            public void performAction(Integer e) {
                if (e % 2 == 0) {
                    System.out.println(e);
                }
            }
        } */

        // lower order functions to the higher order function

        nos.forEach(no -> {
            if (no % 2 == 0) {
                System.out.println(no);
            }
        });

        /* forEach(nos, e -> {
            if (e % 2 == 0) {
                System.out.println(e);
            }
        }); */

        /* forEach(nos, new Action() {
            @Override
            public void performAction(Integer e) {
                if (e % 2 == 0) {
                    System.out.println(e);
                }
            }
        }); */
        /* for (Integer no: nos) {
            if (no % 2 == 0) {
                System.out.println(no);
            }
        } */
    }
}
