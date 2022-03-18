package ContainsDuplicate_217;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jamith Nimantha
 */
class SolutionTest {

    private Solution solution;

    @Test
    void containsDuplicate() {
        assertTrue(solution.containsDuplicate(new int[]{2,2,2,2,2}));
        assertTrue(solution.containsDuplicate(new int[]{4,54,23,5,2,1,3,4,4}));
        assertTrue(solution.containsDuplicate(new int[]{1,2,3,1}));
        assertTrue(solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        assertFalse(solution.containsDuplicate(new int[]{1,2,3,4}));
        assertFalse(solution.containsDuplicate(new int[]{4,3,2,1,0}));
    }

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }
}