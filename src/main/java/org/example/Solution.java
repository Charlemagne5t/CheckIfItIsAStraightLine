package org.example;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 3) return true;
        boolean isLine = true;
        double x1 = coordinates[0][0];
        double x2 = coordinates[1][0];
        double y1 = coordinates[0][1];
        double y2 = coordinates[1][1];
        if (x2 - x1 == 0) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != x1) return false;

            }
            return true;
        }

        double k = (y2 - y1) / (x2 - x1);
        double b = y1 - k * x1;
        double epsilon = 0.0001;
        for (int i = 2; i < coordinates.length; i++) {
            if (Math.abs(k * coordinates[i][0] - coordinates[i][1] + b) > epsilon) {
                return false;
            }
        }
        return isLine;
    }
}