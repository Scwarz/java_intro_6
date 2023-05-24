package conditional_statements;

public class IfElseSyntax {
    public static void main(String[] args) {
        /*
        -if else statements are used to control the flow of the program based on a condition
        -conditions should always either true or false
        -if block can be used without an else block
        -else statements cannot be used without if
         */

        boolean condition = false;

        if(condition){ // You can out anything here eventually turns into true or false
            //This is if block and this will execute when condition is true
            System.out.println("A");
        }
        else{
            //This is else block and this will execute when condition is false
            System.out.println("B");
        }

        System.out.println("End of the program!");
    }
}
