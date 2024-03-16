import java.util.Scanner;
public class Circle{



//creating a method to compute area
public static double computeArea(double radius)
{
   double area = 3.142 *radius*radius;
System.out.println("Area is: "+ area);
   return area;
}
public static void main(String args[]){
 //calling the computeArea method
Circle.computeArea(3.00);
   }
}