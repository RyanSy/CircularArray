import java.util.List;

public class CircularArray<T> {
    /*
    * @desc Rotates a given array n number of times
    * @param {arr} The array to rotate
    * @param {n} The number of shifts
    * @param {d} Direction of rotation
    * @returns {arr} Returns array with rotated values
    * */
    public List<T> rotate(List<T> arr, int n, String d) {
        int arrLength = arr.size();
        n = n % arrLength;
        // eg array = [1, 2, 3, 4, 5], shift value = 2
        if (d.equals("right")) {
            reverse(arr, 0, arrLength - 1); // reverse all elements - [5, 4, 3, 2, 1]
            reverse(arr, 0, n - 1); // reverse elements from index 0 to 1 - [4, 5, 3, 2, 1]
            reverse(arr, n, arrLength - 1); // reverse elements from index 2 to 5  - [4, 5, 1, 2, 3]
        }
        if (d.equals("left")) {
            reverse(arr, 0, arrLength - 1); // reverse all elements - [5, 4, 3, 2, 1]
            reverse(arr, 0, n); // reverse elements from index 0 to 2 - [3, 4, 5, 2, 1]
            reverse(arr, (n + 1), (arrLength - 1)); // reverse elements from index 3 to 3 - [4, 5, 3, 1, 2]
        }
        return arr;
    }

    public void reverse(List<T> arr, int start, int end) {
        while (start < end) {
            T temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}

