package string_Methods;

public class _03_Equals_Method {
    public static void main(String[] args) {

        /*
        1.return type
        2. return boolean
        3. NonStatic
        4. takes objects as an argument but in our case it takes String
         */
        String str1 = "Tech";
        String str2 = "Global";
        String str3 = "tech";
        String str4 = "TechGlobal";
        String str5 = "Tech";

        boolean isEquals = str1.equals(str2);//false

        System.out.println(isEquals);

        System.out.println(str1.equals(str3));//false


        System.out.println((str1.concat(str2)).equals(str4)); //true


        System.out.println(!str1.equals(str5));//false
        System.out.println(!str1.equals(str4));//true


    }
}
