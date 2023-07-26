package main.java.com.kodilla.testing.weather.stub;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(10, 7);
        int result2 = calculator.subtract(10, 7);

        if(result1 == 17){
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }

        if(result2 == 3){
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }

    }
}