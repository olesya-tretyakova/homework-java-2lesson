package com.my_company;

import java.util.*;

import static com.my_company.Point.xComparator;
import static com.my_company.Point.yComparator;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(2, 7);
        Point point3 = new Point(5, 9);
        Point point4 = new Point(4, 8);
        Point point5 = new Point(6, 4);

        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point5);

        //Sort collection by x
        Collections.sort(points, xComparator);
        for (Point p : points) {
            System.out.println(p);
        }
        System.out.println();

        //Sort collection by y
        Collections.sort(points, yComparator);
        for (Point p : points) {
            System.out.println(p);
        }

        //List methods
        Point new_point = new Point(1, 7);
        points.remove(4);
        points.contains(3);
        points.set(3, new_point);
        points.isEmpty();
        points.size();
        points.clear();

        //Map example
        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "pizza");
        menu.put(2, "fries");
        menu.put(3, "pasta");
        menu.put(4, "chicken");

        //Map methods
        Iterator<Map.Entry<Integer, String>> it = menu.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }

        menu.remove(2);
        menu.containsValue("pizza");
        menu.size();
        menu.clear();
        menu.isEmpty();

        //Set example
        Set<String> cities = new HashSet<>();

        cities.add("Moscow");
        cities.add("Piter");
        cities.add("Novosibirsk");
        cities.add("Ekaterinburg");

        //Set methods
        cities.remove("Ekaterinburg");
        cities.contains("Piter");
        cities.size();
        cities.isEmpty();

        Set<String> new_cities = new HashSet<>();
        new_cities.add("Tomsk");
        new_cities.add("Tyumen");

        cities.addAll(new_cities);
        Iterator<String> itr = cities.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
