package practices;

public class DataTypes {
    public static void main(String[] args) {
        String myFirstName = "Jonathan";
        String myLastName = "Ochoa";
        String ending = "\".";
        System.out.println("My name is \"" + myFirstName + " " + myLastName + ending);
        // Output: My name is "Jonathan Ochoa".

        String fullName = myFirstName.concat(" " + myLastName); // Jonathan Ochoa
        System.out.println(myFirstName.concat(" " + myLastName));

    }
}
