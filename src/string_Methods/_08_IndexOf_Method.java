package string_Methods;

public class _08_IndexOf_Method {
    public static void main(String[] args) {

        /*
        1. return
        2. return a int
        3. non-static
        4. takes either a string or a char as an argument
         */

        String str = "TechGlobal";
        //IndexOf()
        System.out.println(str.indexOf('h'));//3

        System.out.println(str.indexOf('y'));//-1

        System.out.println(str.indexOf("Tech"));//0
        System.out.println(str.indexOf("Global"));//4

        System.out.println(str.indexOf("global"));//-1

        System.out.println(str.indexOf('l'));//5

        //lastIndexOf()
        System.out.println(str.lastIndexOf('l'));//9

    }
}
