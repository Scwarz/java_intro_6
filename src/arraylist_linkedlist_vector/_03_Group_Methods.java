package arraylist_linkedlist_vector;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _03_Group_Methods {
    public static void main(String[] args) {
        ArrayList<String> group1Members = new ArrayList<>();
        group1Members.add("Belal");
        group1Members.add("Assem");
        group1Members.add("Gurkan");
        group1Members.add("Dima");


        ArrayList<String> group2Members = new ArrayList<>();
        group2Members.add("Adam");
        group2Members.add("Melek");
        group2Members.add("Cihan");


        ArrayList<String> group3Members = new ArrayList<>();
        group3Members.add("Yousef");
        group3Members.add("Sandina");

        System.out.println("Group 1 members  = " + group1Members);
        System.out.println("Group 2 members  = " + group2Members);
        System.out.println("Group 3 members  = " + group3Members);


        /*
        Create a new list called as allMembers and store all the group members in that
        Then print it

        EXPECTED:
        [Adam, Melek, Cihan, Belal, Assem, Gurkan, Dima, Yousef, Sandina]
         */

        System.out.println("\n-----addAll() method-----\n");
        ArrayList<String> allMembers = new ArrayList<>();
        allMembers.addAll(group2Members);
        allMembers.addAll(group1Members);
        allMembers.addAll(group3Members);

        System.out.println("All members = " + allMembers);

        /*
        Remove Adam, Assem, Yousef from the allMembers list
        Then print it

        EXPECTED:
        [Melek, Cihan, Belal, Gurkan, Dima, Sandina]
         */
        System.out.println("\n----removeAll() method----\n");

        ArrayList<String> elementsToBeRemoved = new ArrayList<>();
        elementsToBeRemoved.add("Adam");
        elementsToBeRemoved.add("Assem");
        elementsToBeRemoved.add("Yousef");

        allMembers.removeAll(elementsToBeRemoved);

        System.out.println(allMembers); // [Melek, Cihan, Belal, Gurkan, Dima, Sandina]

        //allMembers.removeIf(element -> element.equals("Adam") || element.equals("Assem") || element.equals("Yousef"));


        /*
        Melek, Cihan, Belal, Gurkan, Dima, Sandina

        Check if the collection contains Cihan, Dima and Sandina -> true
        Check if the collection contains Jazzy, Gurkan, Belal, Melek -> false
         */

        System.out.println("\n-----containsAll()-------\n");

        ArrayList<String> check1 = new ArrayList<>(Arrays.asList("Cihan", "Dima", "Sandina"));
        ArrayList<String> check2 = new ArrayList<>(Arrays.asList("Jazzy", "Gurkan", "Belal", "Melek"));

        System.out.println(check1);
        System.out.println(check2);

        System.out.println(allMembers.containsAll(check1)); // true
        System.out.println(allMembers.containsAll(check2)); // false


        /*
        Melek, Cihan, Belal, Gurkan, Dima, Sandina
        Keep only Cihan and Gurkan but remove the rest

        EXPECTED:
        [Cihan, Gurkan]
         */

        System.out.println("\n-----retainAll()-------\n");
        ArrayList<String> keepList = new ArrayList<>(Arrays.asList("Cihan", "Gurkan"));

        allMembers.retainAll(keepList); // Keep the keepList but remove the rest

        System.out.println(allMembers); // [Cihan, Gurkan]

        //allMembers.removeIf(element -> !element.equals("Cihan") && !element.equals("Gurkan"));
    }
}
