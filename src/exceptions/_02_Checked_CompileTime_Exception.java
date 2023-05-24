package exceptions;

public class _02_Checked_CompileTime_Exception {
    public static void main(String[] args) throws InterruptedException { // adding Exception to the method signature

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try { // using try-catch to handle the exception
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("I caught an exception here!!!");
            }
        }
    }
}
