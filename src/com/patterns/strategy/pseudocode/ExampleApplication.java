package com.patterns.strategy.pseudocode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String c = sc.next();
            sc.close();

            switch (c) {
                case "+" -> context.setStrategy(new ConcreteStrategyAdd());
                case "-" -> context.setStrategy(new ConcreteStrategySubtract());
                case "*" -> context.setStrategy(new ConcreteStrategyMultiply());
                default -> System.out.println("Nhap sai c");
            }

            int result = context.executeStrategy(a, b);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("method not exist");
        } catch (InputMismatchException e) {
            System.out.println("nhap sai dinh dang");
        }
    }
}
