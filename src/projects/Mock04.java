package projects;

import java.util.HashMap;
import java.util.Map;

public class Mock04 {
    public static void main(String[] args) {
        String[] arr1 = {"Apple", "Apple", "Orange", "Apple", "Kiwi"};
        Map<String, Integer> testResult = countElements(arr1);
        System.out.println(testResult);
    }

    public static Map<String, Integer> countElements(String[] arr){
        Map<String, Integer> countElements = new HashMap<>();
        for(String el : arr){
            if(countElements.containsKey(el)){
                countElements.put(el, countElements.get(el)+1);
            }
            else {
                countElements.put(el, 1);
            }

        }
        return countElements;
    }
}
