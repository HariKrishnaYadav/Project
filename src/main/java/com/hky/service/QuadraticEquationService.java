package com.hky.service;

import org.springframework.stereotype.Service;

// QuadraticEquationService.java
@Service
public class QuadraticEquationService {

    public double[] calculateRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double[] roots;

        if (discriminant > 0) {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            roots = new double[1];
            roots[0] = -b / (2 * a);
        } else {
            roots = new double[0]; // no real roots
        }

        return roots;
    }
}
