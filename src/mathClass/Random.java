package mathClass;

public class Random {
    public static void main(String[] args) {

        System.out.println(Math.random()); // generates random number from 0.0 to 1.0
        System.out.println(Math.random() * 10);//generates random number from 0.0 to 10.0
        System.out.println(Math.random() * 20);//generates random number from 0.0 to 20.0
        System.out.println(Math.random() * 11);//generates random number from 0.0 to 10.0 included
        System.out.println(Math.round(Math.random() * 10));//generates random number from 0.0 to 10.0 included and rounds it up to a whole number
        System.out.println((int)(Math.random() * 11));//generates random number from 0 to 10 where 10 is included
        System.out.println(Math.round(Math.random() * 10) + 10);//generates random number from 10 to 20 included and rounds it up to a whole number




        /*
            generate a random number from 0 to 25 where 25 is included; make it a whole number
         */


        for (int i = 0; i < 1000; i++) {
            System.out.println((int)(Math.random() * 101));
        }








    }
}
