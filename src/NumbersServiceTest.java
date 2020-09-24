import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersServiceTest {

    private NumbersService numbersService;

    public NumbersServiceTest() {
        this.numbersService = new NumbersService();
    }

    @org.junit.jupiter.api.Test
    void getEvenNos() {
        String actual = this.numbersService.getEvenNos(10);
        String expected = "0,2,4,6,8,10";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getEvenNosEdgeCaseScenarios() {
        String actual = this.numbersService.getEvenNos(0);
        String expected = "0";
        assertEquals(expected, actual);

        assertThrows(IllegalArgumentException.class, () -> this.numbersService.getEvenNos(-2));
    }

    @org.junit.jupiter.api.Test
    void getOddNos() {
        String actual = this.numbersService.getOddNos(10);
        String expected = "1,3,5,7,9";
        assertEquals(expected, actual);
    }

    @Test
    void testGetNos() {
        String actual = this.numbersService.getNos(10, "even");
        String expected = "0,2,4,6,8,10";
        assertEquals(expected, actual);

        actual = this.numbersService.getNos(10, "odd");
        expected = "1,3,5,7,9";
        assertEquals(expected, actual);
    }

    @Test
    void testGetNosEdgeCases() {
        assertThrows(IllegalArgumentException.class, () -> this.numbersService.getNos(10, "prime"));
    }
}