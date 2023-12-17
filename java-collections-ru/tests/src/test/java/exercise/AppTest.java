package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        var nums = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8);
        var elements = 3;
        var actual = App.take(nums, elements);
        assertThat(actual).containsExactly(0, 1, 2);
        // END
    }
}
