import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


public class CircularArrayTest {

    public CircularArray<Integer> ca = new CircularArray<>();

    @Test
    public void rotateRightTest() {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        List<Integer> goRight = new ArrayList<>();
        goRight.add(4);
        goRight.add(5);
        goRight.add(1);
        goRight.add(2);
        goRight.add(3);

        List<Integer> rotateRight = ca.rotate(arr, 2, "right");

        assertEquals(goRight, rotateRight);
    }

    @Test
    public void rotateLeftTest() {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        List<Integer> goLeft = new ArrayList<>();
        goLeft.add(3);
        goLeft.add(4);
        goLeft.add(5);
        goLeft.add(1);
        goLeft.add(2);

        List<Integer> rotateLeft = ca.rotate(arr, 2, "left");

        assertEquals(goLeft, rotateLeft);
    }
}
