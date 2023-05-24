package methods;

import java.util.Random;

import utilities.MathHelper;
import utilities.Printer;

public class TestPrinterMethods {
    public static void main(String[] args) {

        Printer.printGM(); // Good Morning
        Printer.printGM(); // Good Morning


        Printer.helloName("Jazzy"); // Hello Jazzy
        Printer.helloName("Matthew"); // Hello Matthew
        Printer.helloName("Cihan"); // Hello Cihan


        // static vs non-static methods
        // static methods can be invoked with the class name -> ClassName.
        // non-static methods can be invoked with an object of the class

        Printer.helloName("John");
        Printer.printGM();


        Printer myPrinter = new Printer();
        myPrinter.printTechGlobal();


        // return methods vs void methods
        // if the method is return type, then we can store the returned data in a variable
        // if the method is void type, then we cannot store in a variable

        int i = MathHelper.sum(3, 5); // 8

        Printer.printGM(); // it does not return anything

        System.out.println(MathHelper.sum(3, 5)); // 8
        System.out.println(i); // 8

        // System.out.println(Printer.printGM()); // Compiler error

    }
}
