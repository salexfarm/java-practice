package main.java.generics.typeerasure;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Uses generics correctly, then translates it into the equivalent code below
        ArrayList<String> stateList = new ArrayList<>();
        stateList.add("Oklahoma");
        String state = stateList.get(0);
        System.out.println(state);


        // For runtime use, this code uses the raw type
        ArrayList cityList = new ArrayList();
        cityList.add("Detroit");
        String city = (String)(cityList.get(0));
        System.out.println(city);
    }
}
