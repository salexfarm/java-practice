package main.java.casting;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(new Date());

        System.out.println(dates);
        Date date = dates.get(0);
        System.out.println(date);

        ArrayList<Double> list = new ArrayList<>();
        list.add(5.5); // 5.5 is automatically converted to a Double object
        list.add(3.0); // 3.0 is automatically converted to a Double object
        Double doubleObject = list.get(0); // No casting is needed
        double d = list.get(1); // Automatically converted to double
        System.out.println(doubleObject);
        System.out.println(d);
    }
}
