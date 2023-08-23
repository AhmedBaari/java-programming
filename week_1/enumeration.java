/**
 * This program demonstrates the use of an enumeration type in Java. 
 * It defines an enumeration called "day" with seven possible values: sun, mon, tue, wed, thu, fri, sat.
 * The main method iterates over all the values of the "day" enumeration and prints them to the console.
 */
enum day {sun, mon, tue, wed, thu, fri, sat}

class enumeration {
        public static void main (String[] args) {
            for (day d : day.values()) {
                System.out.println(d);
            }
        }
    } 
