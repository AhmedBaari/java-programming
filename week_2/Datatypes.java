// This program is as demonstrated on the internet and is not a part of the lab session

import java.util.*;

public class Datatypes {

    public static void main(String[] args) {
        // Declare variables of different data types
        int intVar = 10;
        float floatVar = 10.5f;
        double doubleVar = 10.5d;
        char charVar = 'a';
        String stringVar = "Hello, world!";
        boolean booleanVar = true;
        byte byteVar = 10;
        short shortVar = 10;
        long longVar = 10L;

        // Print the values of the variables
        System.out.println("intVar: " + intVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("stringVar: " + stringVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("longVar: " + longVar);

        // Add 1 to the int variable
        intVar += 1;
        System.out.println("intVar after adding 1: " + intVar);

        // Multiply the float variable by 2
        floatVar *= 2;
        System.out.println("floatVar after multiplying by 2: " + floatVar);

        // Change the string variable to "Goodbye, world!"
        stringVar = "Goodbye, world!";
        System.out.println("stringVar after changing to 'Goodbye, world!': " + stringVar);

        // Reverse the boolean variable
        booleanVar = !booleanVar;
        System.out.println("booleanVar after reversing: " + booleanVar);

        // Add an element to the list variable
        List<Integer> listVar = new ArrayList<>();
        listVar.add(1);
        listVar.add(2);
        listVar.add(3);
        listVar.add(4);
        listVar.add(5);
        listVar.add(6);
        System.out.println("listVar: " + listVar);

        // Change the value of the key "key2" in the dictionary variable
        Map<String, String> dictVar = new HashMap<>();
        dictVar.put("key1", "value1");
        dictVar.put("key2", "value2");
        dictVar.put("key3", "value3");
        System.out.println("dictVar: " + dictVar);
        dictVar.put("key2", "new value");
        System.out.println("dictVar after changing the value of 'key2': " + dictVar);
    }
}
