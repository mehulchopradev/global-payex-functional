import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersService {

    String getEvenNos(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        return IntStream.rangeClosed(0, n)
                .filter(number -> number % 2 == 0)
                .mapToObj(number -> number + "")
                .collect(Collectors.joining(","));
    }

    String getOddNos(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(number -> number % 2 != 0)
                .mapToObj(number -> number + "")
                .collect(Collectors.joining(","));
    }

    String getNos(int n, String type) {
        if (type.equals("even")) {
            return this.getEvenNos(n);
        } else if (type.equals("odd")) {
            return this.getOddNos(n);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
