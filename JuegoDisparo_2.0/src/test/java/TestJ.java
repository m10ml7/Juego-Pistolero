import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestJ {
    @Test
    @DisplayName("Addition test")
    void addition() {
        assertEquals(2, add(1,1));
    }

    private int add(int num1, int num2) {
        return num1 + num2;
    }
}
