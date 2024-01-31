package com.abiudbenitez.distribuidos;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
	  int edad;
	  
	  Scanner sc = new Scanner(System.in);
    
	  System.out.print("Ingrese su edad: ");
	  edad = sc.nextInt();
	  
	  System.out.println("Su edad es de: " + edad + " años.");
  }
}
