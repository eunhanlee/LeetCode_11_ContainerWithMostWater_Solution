import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testMaxArea() {
        Solution solution = new Solution();

        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected1 = 49;
        int actual1 = solution.maxArea(heights1);
        assertEquals(expected1, actual1);

        int[] heights2 = {4, 3, 2, 1, 4};
        int expected2 = 16;
        int actual2 = solution.maxArea(heights2);
        assertEquals(expected2, actual2);

        int[] heights3 = {1, 2, 1};
        int expected3 = 2;
        int actual3 = solution.maxArea(heights3);
        assertEquals(expected3, actual3);

        int[] heights4 = {2, 3, 10, 5, 7, 8, 9};
        int expected4 = 36;
        int actual4 = solution.maxArea(heights4);
        assertEquals(expected4, actual4);

        int[] heights5 = {1, 1};
        int expected5 = 1;
        int actual5 = solution.maxArea(heights5);
        assertEquals(expected5, actual5);

        int[] heights6 = {1, 2, 4, 3};
        int expected6 = 4;
        int actual6 = solution.maxArea(heights6);
        assertEquals(expected6, actual6);

        int[] heights7 = {3, 1, 3, 4, 5};
        int expected7 = 12;
        int actual7 = solution.maxArea(heights7);
        assertEquals(expected7, actual7);

        int[] heights8 = {1, 2, 1, 2, 1, 2, 1};
        int expected8 = 8;
        int actual8 = solution.maxArea(heights8);
        assertEquals(expected8, actual8);

        int[] heights9 = {2, 2, 2, 2, 2};
        int expected9 = 8;
        int actual9 = solution.maxArea(heights9);
        assertEquals(expected9, actual9);

        int[] heights10 = {5, 5, 15, 15};
        int expected10 = 15;
        int actual10 = solution.maxArea(heights10);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
