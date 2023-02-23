package main.java.generics.typeerasure;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Oklahoma");
        String state = list.get(0);
        
    }
}
