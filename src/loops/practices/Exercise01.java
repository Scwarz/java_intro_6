package loops.practices;

public class Exercise01 {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            if(i % 10 == 0) System.out.println("FooBar");
            else if(i % 2 == 0) System.out.println("Foo");
            else if(i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
    }
}
