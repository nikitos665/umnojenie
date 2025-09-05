package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
	int a; int b;
    System.out.println("Введите a = ");
    a = t.nextInt();
    System.out.println("Введите b = ");
    b = t.nextInt();
    System.out.println("Ответ = "+ atr(a, b) );
    
    }
    static int atr (int a, int b){
        int s = 0; int i;
        for (i = 1; i<=b; i++){
            s += a;
        }
        return s;}
}
