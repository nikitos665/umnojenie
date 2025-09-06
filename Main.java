package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Первое число: ");
        int num1 = inputReader.nextInt();

        System.out.print("Второе число: ");
        int num2 = inputReader.nextInt();

        System.out.println("""
            Выберите способ вычисления:
            1. C помощь деления
            2. С помощью интеджера            
            3. С помощью битов
            4. С помощью массива
            5. Итерационный метод
            6. Рекурсивный метод
            """);

        int option = inputReader.nextInt();
        int result = 0;

        switch(option) {
            case 1 -> result = delen(num1, num2);
            case 2 -> result = Integer(num1, num2);
            case 3 -> result = biti(num1, num2);
            case 4 -> result = aray(num1, num2);
            case 5 -> result = iteraci(num1, num2);
            case 6 -> result = recursi(num1, num2);
            default -> System.out.println("Неверный выбор");
        }

        if(option >= 1 && option <= 6) {
            System.out.println("Результат: " + result);
        }
    }

    private static int delen(int x, int y) {
        if(y == 0) return 0;
        return (int) (x / (1.0 / y));
    }

    private static int biti(int x, int y) {
        int product = 0;
        int a = x;
        int b = y;

        while(b != 0) {
            if((b & 1) == 1) {
                product = binaryAdd(product, a);
            }
            a <<= 1;
            b >>>= 1;
        }
        return product;
    }

    private static int binaryAdd(int a, int b) {
        while(b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    private static int Integer(int x, int y) {
        BigInteger bigX = BigInteger.valueOf(x);
        BigInteger bigY = BigInteger.valueOf(y);
        return bigX.multiply(bigY).intValue();
    }

    private static int aray(int x, int y) {
        if(y == 0) return 0;

        int size = Math.abs(y);
        int[] numbers = new int[size];
        Arrays.fill(numbers, Math.abs(x));

        int sum = Arrays.stream(numbers).sum();
        return (x < 0) ^ (y < 0) ? -sum : sum;
    }

    private static int iteraci(int x, int y) {
        int total = 0;
        if(y > 0) {
            for(int i = 0; i < y; i++) {
                total += x;
            }
        } else if(y < 0) {
            for(int i = 0; i > y; i--) {
                total -= x;
            }
        }
        return total;
    }

    private static int recursi(int x, int y) {
        if(y > 0) {
            return x + recursi(x, y - 1);
        } else if(y < 0) {
            return -x + recursi(x, y + 1);
        }
        return 0;
    }
}