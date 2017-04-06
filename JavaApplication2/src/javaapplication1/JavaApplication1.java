/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.sql.DriverManager.println;
import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {
    @SuppressWarnings("resource")
	public static void main(String args[]) {
            int total = 0;
 
		// input to print Fibonacci series upto how many numbers
		log("masukan angka: ");
		int number = new Scanner(System.in).nextInt();
 
		log("\n");
		// printing Fibonacci series upto number
		for (int i = 1; i <= number; i++) {
                    total = total+fibonacciRecusion(i);
                    
		} 
                System.out.println (total);
	}
 
	// Method-1: Java program for Fibonacci number using recursion.
	public static int fibonacciRecusion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
 
		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
	}
 
	// Method-2: Java program for Fibonacci number using Loop.
	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
			fibo1 = fibo2;
			fibo2 = fibonacci;
 
		}
		return fibonacci; // Fibonacci number
	}
 
	private static void log(String number) {
		System.out.println(number);
 
	}
}