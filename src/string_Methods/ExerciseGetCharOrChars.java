package string_Methods;

public class ExerciseGetCharOrChars {
    public static void main(String[] args) {
        String name1 = "bilal";    //length 5 | middle char is index of 2
        String name2 = "Matthew";  //length 7 | middle char is index of 3
        String name3 = "Ronaldo!!";//length 9 | middle char is index of 4
        //to find the middle character of an odd word we would need to do (length()-1)/2

        System.out.println(name1.charAt((name1.length()-1)/2));// l
        System.out.println(name2.charAt((name2.length()-1)/2));// t
        System.out.println(name3.charAt((name3.length()-1)/2));// l

        String name4 = "Okan"; //length is 4 | middle chars -> index 1 and 2
        String name5 = "yousef";//length is 6 | middle chars -> index 2 and 3

        System.out.println("" + name4.charAt(name4.length()/2 - 1) + name4.charAt(name4.length()/2));
        System.out.println("" + name5.charAt(name5.length()/2 - 1) + name5.charAt(name5.length()/2));

        // to find the middle characters of an even word we would first get length()/2 -1
        // then we will get the length()/2



    }

}
