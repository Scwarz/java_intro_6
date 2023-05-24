package exceptions;

import utilities.ScannerHelper;

import java.util.NoSuchElementException;

public class _01_Unchecked_Runtime_Exception {
    public static void main(String[] args) {

        String name = ScannerHelper.getFirstName();

        try{ // using try-catch to handle the exception
            System.out.println(name.charAt(5)); // StringIndexOutOfBoundsException

            String s = null;
            System.out.println(s.toUpperCase()); // NullPointerException

            Thread.sleep(1000);

        }
        catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I AM HERE TO RUN ALL THE TIME!!!");
        }


        System.out.println("The rest of the program");

        throw new NoSuchElementException("JUST FOR FUN!!!!");
    }
}
