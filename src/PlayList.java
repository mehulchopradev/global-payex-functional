import java.util.Arrays;
import java.util.List;

public class PlayList {

    @FunctionalInterface
    interface Action {
        void performAction(Integer element);
    }

    // higher order function
    static void forEach(List<Integer> elements, Action action) {
        for (Integer element: elements) {
            action.performAction(element);
        }
    }

    // lower order function
    static void printsIfEven(Integer number) {
        if (number % 2 == 0) {
            System.out.println(number);
        }
    }

    static void printsIfOddMoreThan5(Integer number) {
        if (number % 2 != 0 && number > 5) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(5, 6, 3, 8, 9, 10, 4, 7, 8, 1);

        System.out.println("*********** Print all the even elements from the nos list ****************");
        /* class PrintEven implements Action {

            @Override
            public void performAction(Integer element) {
                if (element % 2 == 0) {
                    System.out.println(element);
                }
            }
        } */

        /* forEach(nos, new Action() {
            @Override
            public void performAction(Integer element) {
                if (element % 2 == 0) {
                    System.out.println(element);
                }
            }
        }); */

        // passing lower order function (lambda expressions) to the higher order function
        /* forEach(nos, element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }); */

        // Method references
        forEach(nos, PlayList::printsIfEven);

        /* nos.forEach(element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }); */



        /* for(Integer no: nos) {
            if (no % 2 == 0) {
                System.out.println(no);
            }
        } */


        System.out.println("**************** Print all the odd numbers more than 5 from the nos list *******");

        /* class PrintOddMoreThan5 implements Action {

            @Override
            public void performAction(Integer element) {
                if (element % 2 != 0 && element > 5) {
                    System.out.println(element);
                }
            }
        } */

        /* forEach(nos, new Action() {
            @Override
            public void performAction(Integer element) {
                if (element % 2 != 0 && element > 5) {
                    System.out.println(element);
                }
            }
        }); */

        // passing lower order function (lambda expressions) to the higher order function
        // passing code to code
        /* forEach(nos, element -> {
            if (element % 2 != 0 && element > 5) {
                System.out.println(element);
            }
        }); */

        /* nos.forEach(element -> {
            if (element % 2 != 0 && element > 5) {
                System.out.println(element);
            }
        }); */

        nos.forEach(PlayList::printsIfOddMoreThan5);
        /* for (Integer no: nos) {
            if (no % 2 != 0 && no > 5) {
                System.out.println(no);
            }
        } */
    }
}
