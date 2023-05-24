package string_Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class _11_Substring_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returning a String
        3. nonStatic
        4. takes either 1 int as an argument as the starting point or 2 ints an arguments as the starting and ending point
         */
        String str = "I love java";

        String firstWord = str.substring(0,1);//I -> str.charAt(0)
        String secondWord = str.substring(2,6);//love
        String thirdWord = str.substring(7);//java

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);


        System.out.println(str.substring(str.length()/2));
    }









}
