import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EvenNos {
    public static void main(String[] args) {
        int n = 300;

        // all even numbers from 0 to n (including n)
        IntStream.rangeClosed(0, n).forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });
    }
}
