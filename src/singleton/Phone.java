package singleton;

public class Phone {

    //instance variable which is also Phone
    private static Phone phone; // singleton.Phone@29453f44

    private Phone(){
        // default constructor
    }

    // Create a method that instantiate a Phone object and return it
    public static Phone getPhone(){
        if(phone == null) phone = new Phone();
        return phone;
    }


}
