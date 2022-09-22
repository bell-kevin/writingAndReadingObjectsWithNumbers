/** ****************************************************************************
 * StudentList.java
 * Kevin Bell
 *
 * The class manages an ArrayList of students.
 **************************************************************************** */
package ch16writingandreadingobjects;

import java.util.*;
import java.io.*;

public class StudentList implements Serializable {

    ArrayList<Double> students = new ArrayList<>();

//******************************************************************************
    public StudentList(double[] names) {
        for (int i = 0; i < names.length; i++) {
            students.add(names[i]);
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
