package homeworks;

public class Homework20 {
    public static void main(String[] args) {
        System.out.println("\n=====Task 1====\n");
        int[] nums = {3, 7, 2, 5, 10};
        boolean checking = false;
        System.out.println(sum(nums, checking));
        System.out.println("\n=====Task 2====\n");
        System.out.println(sumDigitsDouble("23abc45"));
        System.out.println("\n=====Task 3====\n");
        String task3Str1 = "Hello";
        String task3Str2 = "World";
        int result1 = countOccurrence(task3Str1, task3Str2);
        System.out.println(result1);
    }

    public static int sum(int[] arr, boolean falseOrTrue){
        int counter = 0;
        if(falseOrTrue == true){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 == 0) counter++;
            }
        }
        if(falseOrTrue == false){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 == 1) counter++;
            }
        }
        return counter;
    }
    public static int sumDigitsDouble(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char ifDigit = str.charAt(i);
            if (Character.isDigit(ifDigit)) {
                counter += Character.getNumericValue(ifDigit);
            }
        }
        return counter > 0 ? counter * 2 : -1;

    }

    public static int countOccurrence(String str1, String str2) {
        String lowerCaseStr1 = str1.toLowerCase().replaceAll("\\s", "");
        String lowerCaseStr2 = str2.toLowerCase().replaceAll("\\s", "");
        int count = 0;
        if (lowerCaseStr1.length() >= lowerCaseStr2.length()) {
            for (int i = 0; i <= lowerCaseStr1.length() - lowerCaseStr2.length(); i++) {
                if (lowerCaseStr1.substring(i, i + lowerCaseStr2.length()).equals(lowerCaseStr2)) {
                    count++;
                }
            }
        }
        return count;
    }
}
