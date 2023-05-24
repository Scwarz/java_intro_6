package arrays.practice05;

public class Exercise01 {
    public static void main(String[] args) {
        int[] arr = { -2550, 1, -4, -7, 0, 5, 10, 45};
        getFirstPosAndNeg(arr);
    }

    public static void getFirstPosAndNeg(int[] arr){
        int firstPos = 0, firstNeg = 0;

        for(int n : arr){
            if(n > 0){
                firstPos = n;
                break;
            }
        }

        for(int n : arr){
            if(n < 0){
                firstNeg = n;
                break;
            }
        }
        System.out.println("First positive number is: " + firstPos);
        System.out.println("First negative number is: " + firstNeg);
    }


}
