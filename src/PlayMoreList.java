import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayMoreList {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(5, 6, 3, 8, 9, 10, 4, 7, 8, 1);

        System.out.println("*************** Get a new list of odd numbers from the nos list ********************");
        // filtering

        List<Integer> odds = nos.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());
        odds.forEach(number -> System.out.println(number));

        System.out.println("************* Get a new list of numbers deducted by 1 from the nos list ***************");
        // Mapping

        List<Integer> deductedMarks = nos.stream()
                .map(number -> number - 1)
                .collect(Collectors.toList());
        deductedMarks.forEach(mark -> System.out.println(mark));

        System.out.println("*********** Get a new list of even numbers more than 2, transformed to the square of each of them and sorted in descending order, from the nos list*********");
        // filtering + mapping
        // filter -> map -> sorted -> distinct
        // filter -> map -> distinct -> sorted
        // distinct -> filter -> map -> sorted
        List<Integer> squares = nos.stream()
                .distinct()
                .filter(number -> number % 2 == 0 && number > 2)
                .map(number -> number * number)
                .sorted((n1, n2) -> n2.compareTo(n1)) // descending order
                .collect(Collectors.toList());
        squares.forEach(number -> System.out.println(number));

        String s = nos.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number.toString())
                .collect(Collectors.joining("|"));
        System.out.println(s);
    }
}
