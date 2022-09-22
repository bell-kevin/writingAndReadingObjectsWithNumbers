/** ****************************************************************************
 * Ch16writingAndReadingObjects.java
 * Kevin Bell
 *
 * The program writes objects to a file, and reads objects from a file.
 **************************************************************************** */
package ch16writingandreadingobjects;

import java.io.*;

public class Ch16writingAndReadingObjects {

    public static void main(String[] args) {
        System.out.println("Objects in Files by Kevin Bell with numbers \n");
        double[] names = {95.2, 89.1, 90.0, 92.4, 88.0};
        StudentList studentList = new StudentList(names);
        System.out.println("List 1: ");
        studentList.display();
        String fileName = "ThreeLists.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(studentList);
            fileOut.reset();
            studentList.addStudent(100);
            studentList.addStudent(99);
            studentList.addStudent(98);
            fileOut.writeObject(studentList);
            fileOut.reset();
            System.out.println("List 2: added some scores");
            studentList.display();
            studentList.removeStudent(1);
            studentList.removeStudent(2);
            fileOut.writeObject(studentList);
            fileOut.reset();
            System.out.println("List 3: removed some scores");
            studentList.display();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            System.out.println("");
            System.out.println("Results of reading objects from file: ");
            while (true) {
                studentList = (StudentList) fileIn.readObject();
                studentList.display();
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
    } // end main method
} // end Ch16writingAndReadingObjects class