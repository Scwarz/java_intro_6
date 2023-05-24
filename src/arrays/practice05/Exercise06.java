package arrays.practice05;

public class Exercise06 {
    public static void main(String[] args) {

        findDup("baNana");
    }

    //baNana
    //
    public static void findDup(String str){
        String answer = "";// aN
        for (int i = 0; i < str.length()-1; i++) {      //i = 0 1 3
            for (int j = i+1; j < str.length() ; j++) { //j = 2 3 4 5
                if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                        !answer.contains("" + str.charAt(i))) {
                    answer += str.charAt(i);
                    break;
                }
            }
        }
        char[] answerArr = answer.toCharArray();
        for (char c : answerArr) {
            System.out.println(c);
        }
    }
}
