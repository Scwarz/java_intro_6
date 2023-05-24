package singleton;

public class Driver {

    private Driver(){}

    private static Driver driver;

    public static Driver getDriver(){
        if(driver == null) driver = new Driver();
        return driver;
    }
}
