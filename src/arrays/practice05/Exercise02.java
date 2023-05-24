package arrays.practice05;

public class Exercise02 {
    public static void main(String[] args) {
        String[] arr = {"Red", "Blue", "Yellow", "While"};
        getShortestLongest(arr);
    }

    public static void getShortestLongest(String[] words){
        String shortest = words[0];
        String longest = words[0];

        for (String s : words) {
            if(s.length() > longest.length()) longest = s;
            else if(s.length() < shortest.length()) shortest = s;
        }
        System.out.println("The longest word is = " + longest);
        System.out.println("The shortest word is = " + shortest);

    }

}
