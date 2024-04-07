package com.company.class23.methodoverloading;

public class CalculatorTester {

    public static void main(String[] args) {
      /*  Calculator calculator = new Calculator();
        calculator.addDouble(14.5,56.4);*/
        ImprovedCalculator improvedCalculator = new ImprovedCalculator();
        improvedCalculator.add(15.0, 14.5);
        improvedCalculator.add(14, 89);
        int[] arr = {10, 20, 30};
        improvedCalculator.add(arr);
        improvedCalculator.add(15, 15, 26);
        improvedCalculator.add(15, 15, 26, 52);
        improvedCalculator.add(15, 15, 26, 45, 85);
    }
}