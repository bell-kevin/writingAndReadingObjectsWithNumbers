/** ****************************************************************************
 * Ch16writingAndReadingObjects.java
 * Kevin Bell
 *
 * The program writes objects to a file, and reads objects from a file.
 **************************************************************************** */
package writingAndReadingObjectsWithNumbers;

import java.io.*;

public class writingAndReadingObjectsWithNumbers {

    public static void main(String[] args) {
        System.out.println("Objects in Files by Kevin Bell with numbers \n");
        double[] numbers = {95.2, 89.1, 90.0, 92.4, 88.0};
        NumberList numberList = new NumberList(numbers);
        System.out.println("List 1: ");
        numberList.display();
        String fileName = "ThreeLists.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(numberList);
            fileOut.reset();
            numberList.addStudent(100);
            numberList.addStudent(99);
            numberList.addStudent(98);
            fileOut.writeObject(numberList);
            fileOut.reset();
            System.out.println("List 2: added some scores");
            numberList.display();
            numberList.removeStudent(1);
            numberList.removeStudent(2);
            fileOut.writeObject(numberList);
            fileOut.reset();
            System.out.println("List 3: removed some scores");
            numberList.display();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            System.out.println("");
            System.out.println("Results of reading objects from file: ");
            while (true) {
                numberList = (NumberList) fileIn.readObject();
                numberList.display();
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
    } // end main method
} // end Ch16writingAndReadingObjects class
