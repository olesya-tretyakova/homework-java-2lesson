package com.my_company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    }
}
