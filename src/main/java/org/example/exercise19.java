 /*
  *  UCF COP3330 Summer 2021 Assignment 1 Solution
  *  Copyright 2021 Emily Gensch
  */
 package org.example;
 import java.util.Scanner;

 public class exercise19 {
     public static void main(String[] args) {
         Scanner BMI = new Scanner(System.in);

         System.out.print("Please enter your height in inches: ");
         double height;
         if (BMI.hasNextInt())
         {
             height = BMI.nextInt();
         }
         else
         {
             System.out.println("That's not a number. Try again.");
             return;
         }

         System.out.print("Please enter your weight in pounds: ");
         double weight;
         if (BMI.hasNextInt())
         {
             weight = BMI.nextInt();
         }
         else
         {
             System.out.println("That's not a number. Try again.");
             return;
         }

         double bodyMass = (weight / (height * height)) * 703;
         if (bodyMass >= 18.5 && bodyMass <= 25)
         {
             System.out.printf("Your BMI is %.1f.\n", bodyMass);
             System.out.println("You are within the ideal weight range.");
         }

         if (bodyMass < 18.5)
         {
             System.out.printf("Your BMI is %.1f.\n", bodyMass);
             System.out.println("You are underweight. You should see your doctor.");
         }

         if (bodyMass > 25)
         {
             System.out.printf("Your BMI is %.1f.\n", bodyMass);
             System.out.println("You are overweight. You should see your doctor.");
         }
     }
 }
