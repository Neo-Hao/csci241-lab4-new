/*
// this is the testing class
// DO NOT MODIFY THIS CLASS AND ITS METHODS
*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;
import java.util.Random;
import java.util.ArrayList;

public class BSTTest {
    public int[] randomArray(int size) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt()/1000000; // storing random integers in an array
        }
        return arr;
    }

    public String arrayToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length-1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length-1] + "]";
        return str;
    }

    @Test public void insertTest() {
        int[] arr1 = randomArray(5);

        BSTRight h1 = new BSTRight();
        for (int i = 0; i < arr1.length; i++) {
            h1.insert(arr1[i]);
        }
        BST h2 = new BST();
        for (int i = 0; i < arr1.length; i++) {
            h2.insert(arr1[i]);
        }

        int num = 900;
        h1.insert(num);
        h2.insert(num);

        h1.inOrderTraversal();
        h2.inOrderTraversal();

        assertThat("\nThis is the test on your insert method." +
            "\nThe given BST is build from " + arrayToString(arr1) +
            "\nAfter inserting " + num,
            h2.getData(),
            is(h1.getData()));
    }

    // test delete
    @Test public void deleteTest() {
        int[] arr1 = randomArray(5);

        BSTRight h1 = new BSTRight();
        for (int i = 0; i < arr1.length; i++) {
            h1.insert(arr1[i]);
        }
        BST h2 = new BST();
        for (int i = 0; i < arr1.length; i++) {
            h2.insert(arr1[i]);
        }

        h1.delete(arr1[0]);
        h2.delete(arr1[0]);

        h1.inOrderTraversal();
        h2.inOrderTraversal();

        assertThat("\nThis is the test on your delete method." +
            "\nThe given BST is build from " + arrayToString(arr1) +
            "\nAfter calling delete on " + arr1[0],
            h2.getData(),
            is(h1.getData()));
    }

    @Test public void searchTest() {
        int[] arr1 = randomArray(5);

        BSTRight h1 = new BSTRight();
        for (int i = 0; i < arr1.length; i++) {
            h1.insert(arr1[i]);
        }
        BST h2 = new BST();
        for (int i = 0; i < arr1.length; i++) {
            h2.insert(arr1[i]);
        }

        assertThat("\nThis is the test on your search method." +
            "\nThe given BST is build from " + arrayToString(arr1) +
            "\nAfter calling search on " + arr1[0],
            h2.search(arr1[0]),
            is(h1.search(arr1[0])));
    }
}
