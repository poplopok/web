package com.example.back.service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CheckArea {
    public static boolean check(double x, double y, double r) {
        return inRectangle(x, y, r) || inTriangle(x, y, r) || inCircle(x, y, r);
    }

    private static boolean inRectangle(double x, double y, double r) {
        return  ((x <= r / 2 && x >= 0 && y >= -r && y <= 0));
    }

    private static boolean inTriangle(double x, double y, double r) {
        return  (( -x*2 + (y) <= r ) && (y >= 0) && (x <= 0));
    }

    private static boolean inCircle(double x, double y, double r) {
        return (x <= 0) && (y <= 0) && (x * x + y * y <=( r * r)/4);
    }

    public boolean validate(double x , double y , double r){
            List<Double> arrayR = new ArrayList<>();
            for (double i = 1; i <= 3; i += 1) {
                arrayR.add(i);
            }
            if (arrayR.contains(r) && (x > -5) && (x < 3) && (y > -3) && (y < 3)) {
                return true;
            }
        return false;
    }
}
