import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void checkStraightLineTest1() {
        int[][] coordinates = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 6},
                {6, 7}
        };
        Assert.assertTrue(new Solution().checkStraightLine(coordinates));
    }

    @Test
    public void checkStraightLineTest2() {
        int[][] coordinates = {
                {1, 1},
                {2, 2},
                {3, 4},
                {4, 5},
                {5, 6},
                {7, 7}
        };
        Assert.assertFalse(new Solution().checkStraightLine(coordinates));
    }

}
