import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class CircularArrayTest {

    public CircularArray<Integer> ca = new CircularArray<>();

    @Test
    public void rotateRightTest() {
        /*
        * Create ArrayList: [1, 2, 3, 4, 5]
        * This is the array we will rotate
        * */
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        /*
        * Create ArrayList shifting elements 2 spaces to the right: [4, 5, 1, 2, 3]
        * This is what we want our result to be
        * */
        List<Integer> expectedArr = new ArrayList<>();
        expectedArr.add(4);
        expectedArr.add(5);
        expectedArr.add(1);
        expectedArr.add(2);
        expectedArr.add(3);

        /*
        * Rotate ArrayList arr to return [4, 5, 1, 2, 3]
        * If ArrayList arr was a circle, it would be rotating clockwise
        * */
        List<Integer> rotateArrRight = ca.rotate(arr, 2, "right");

        assertEquals(expectedArr, rotateArrRight);
    }

    @Test
    public void rotateLeftTest() {
        /*
         * Create ArrayList: [1, 2, 3, 4, 5]
         * This is the array we will rotate
         * */
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        /*
         * Create ArrayList shifting elements 2 spaces to the left: [3, 4, 5, 1, 2]
         * This is what we want our result to be
         * */
        List<Integer> expectedArr = new ArrayList<>();
        expectedArr.add(3);
        expectedArr.add(4);
        expectedArr.add(5);
        expectedArr.add(1);
        expectedArr.add(2);

        /*
         * Rotate ArrayList arr to return [3, 4, 5, 1, 2]
         * If ArrayList arr was a circle, it would be rotating counter-clockwise
         * */
        List<Integer> rotateLeft = ca.rotate(arr, 2, "left");

        assertEquals(expectedArr, rotateLeft);
    }
}
