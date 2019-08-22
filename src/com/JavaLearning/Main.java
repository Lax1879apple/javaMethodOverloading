package com.JavaLearning;
 //method overloading is basically calling methods using same method name but using different variables.
public class Main {

     public static void main(String[] args) {
         int newScore = calculateScore("laxu", 300);
         System.out.println("NewScore is = " + newScore);
         calculateScore(200);
         calculateScore();

         double centimeterValueFromFeetAndInches = calcFeetAndInchesToCentimeters(5, 20);
         System.out.println("Feet and Inches converted into centimeter = " + centimeterValueFromFeetAndInches + "cm");

         double inchesConvertedToFeet = calcFeetAndInchesToCentimeters(40);
         System.out.println("Inches converted to feet = " + inchesConvertedToFeet);
     }

     public static int calculateScore(String playerName, int score) {
         System.out.println("Player " + playerName + " =" + " score " + score + " points");
         return score * 10;
     }

     public static int calculateScore(int score) {
         System.out.println("Unnamed player Score" + " = " + score + " points");
         return score;
     }


     public static int calculateScore() {
         System.out.println("No named player Score found");
         return 0;
     }

     public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
         if ((feet <= 0) || ((inches <= 0) && (inches >= 12))) {
             System.out.println("Invalid inches and feet input");
             return -1;
         } else {
             double feetToCentimeter = (feet * 12) * 2.54;
             double inchToCentimeter = inches * 2.54;
             double totalCentimeter = feetToCentimeter + inchToCentimeter;
             System.out.println(feet + "feet " + inches + "inches = " + totalCentimeter + " centimeter");
             return totalCentimeter;
         }
     }

     public static double calcFeetAndInchesToCentimeters(double inches) {
         if (inches <= 0) {
             System.out.println("Invalid inches input ");
             return -1;
         } else {
             double  feet = inches / 12;
             double inchesRemainder = inches % 12;
             System.out.println(inches + "inches is = " + feet + "feet and " + inchesRemainder + "inches");
             return calcFeetAndInchesToCentimeters(feet, inchesRemainder);
         }

     }
 }
