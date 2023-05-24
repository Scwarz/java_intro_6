package casting;

public class CastingCharacters {
    public static void main(String[] args) {

        int i1 = 65;

        char c1 = (char) i1;

        System.out.println(c1); // A


        char c2 = 97; // a
        System.out.println(c2); // a


        char char1 = 'J'; // 74
        char char2 = 'o'; // 111
        char char3 = 'h'; // 104
        char char4 = 'n'; // 110

        System.out.println("" + char1 + char2 + char3 + char4); // John

        System.out.println("" + 12 + 5 + 20); // 12520

    }
}
