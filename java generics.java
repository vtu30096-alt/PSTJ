import java.io.*;
import java.util.*;

class Printer<T> {

    public void printArray(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Solution {

    public static void main(String[] args) {

        Printer<Integer> integerPrinter = new Printer<>();

        Printer<String> stringPrinter = new Printer<>();

        Integer[] intArray = {1, 2, 3};

        String[] stringArray = {"Hello", "World"};

        integerPrinter.printArray(intArray);

        stringPrinter.printArray(stringArray);
    }
}
