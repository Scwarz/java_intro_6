package casting;

public class Exercise04 {
    public static void main(String[] args) {
        String areWeOnline = "true";
        String isEveryoneJoined = "false";

        //Perfect day when everyone is online and participated in
        System.out.println(Boolean.parseBoolean(areWeOnline) && Boolean.parseBoolean(isEveryoneJoined));

    }
}
