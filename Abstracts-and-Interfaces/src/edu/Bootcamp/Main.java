package edu.Bootcamp;

public class Main {

    public static void main(String[] args) {
//      An abstract class is one that cannot be directly instantiated. It's much closer to a blueprint for a class.
        abstract class RevenueCalculator {};
//      In order to declare a subclass of an abstract class, we use the extends keyword like with most instances of inheritance.
        class HourlyRateCalculator extends RevenueCalculator {};
//      An interface is a named set of methods. A class can implement an interface, meaning it has access to those methods.
    }
}
