package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Phone p1 = Phone.getPhone();
        Phone p2 = Phone.getPhone();
        Phone p3 = Phone.getPhone();

        System.out.println(p1); // singleton.Phone@29453f44
        System.out.println(p2); // singleton.Phone@29453f44
        System.out.println(p3); // singleton.Phone@29453f44

        Driver driver1 = Driver.getDriver();
        Driver driver2 = Driver.getDriver();
        Driver driver3 = Driver.getDriver();
        Driver driver4 = Driver.getDriver();
        Driver driver5 = Driver.getDriver();

        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);
        System.out.println(driver4);
        System.out.println(driver5);
    }
}
