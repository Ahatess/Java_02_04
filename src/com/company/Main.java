package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Irasykite 2 skaicius");
	Scanner sc = new Scanner(System.in);
	float a = sc.nextFloat();
	float b = sc.nextFloat();
	suma(a,b);
	skirtumas(a,b);
        float suma = a + b;
        float skirtumas = a - b;
    }
    public static void suma (float a, float b){
        System.out.println("Suma: " + (a + b));
    }
    public static void skirtumas (float a, float b){
        System.out.println("Skirtumas: " + (a-b));
    }
}
