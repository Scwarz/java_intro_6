package projects;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {
    public static void main(String[] args) {

        String[] task1Array1 = {"foo", "", " ", "foo bar", "java is fun", "ruby "};
        System.out.println(countMultipleWords(task1Array1));
        System.out.println(removeNegatives(new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15))));
    }

    public static int countMultipleWords(String[] arr){
        int counter = 0;
        for(String el : arr){
            if(el.split(" ").length > 1) counter++;
        }

        return counter;
    }

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int el : list){
            if(el >= 0) newList.add(el);
        }
        return newList;
    }



}
