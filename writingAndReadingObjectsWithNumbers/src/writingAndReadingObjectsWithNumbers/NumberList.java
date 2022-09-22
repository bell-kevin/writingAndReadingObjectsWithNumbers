/** ****************************************************************************
 * StudentList.java
 * Kevin Bell
 *
 * The class manages an ArrayList of students.
 **************************************************************************** */
package writingAndReadingObjectsWithNumbers;

import java.util.*;
import java.io.*;

public class NumberList implements Serializable {

    ArrayList<Double> students = new ArrayList<>();

//******************************************************************************
    public NumberList(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            students.add(numbers[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void display() {
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + " ");
        } // end for loop
        System.out.println();
    } // end display method
//******************************************************************************

    public void removeStudent(int index) {
        students.remove(index);
    } // end removeStudent method
//******************************************************************************

    public void addStudent(double name) {
        students.add(name);
    } // end removeStudent method
//******************************************************************************
} // end StudentList class
