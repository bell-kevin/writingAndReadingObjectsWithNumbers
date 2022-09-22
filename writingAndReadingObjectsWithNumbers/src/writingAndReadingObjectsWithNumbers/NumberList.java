/** ****************************************************************************
 * NumberList.java
 * Kevin Bell
 *
 * The class manages an ArrayList of scores.
 **************************************************************************** */
package writingAndReadingObjectsWithNumbers;

import java.util.*;
import java.io.*;

public class NumberList implements Serializable {

    ArrayList<Double> scores = new ArrayList<>();

//******************************************************************************
    public NumberList(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            scores.add(numbers[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void display() {
        for (int i = 0; i < scores.size(); i++) {
            System.out.print(scores.get(i) + " ");
        } // end for loop
        System.out.println();
    } // end display method
//******************************************************************************

    public void removeScore(int index) {
        scores.remove(index);
    } // end removeScore method
//******************************************************************************

    public void addScore(double score) {
        scores.add(score);
    } // end addScore method
//******************************************************************************
} // end NumberList class
