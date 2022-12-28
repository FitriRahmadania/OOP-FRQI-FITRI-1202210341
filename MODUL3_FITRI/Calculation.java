package MODUL3_FITRI;
import java.util.Scanner;
public class Calculation implements Runnable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, side, area, phi = 3.14;
        System.out.println("Menu : ");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.print("Choice of shape you want to calculate : ");
        int yangdipilih = input.nextInt();
        try{
            switch(yangdipilih){
                case 1:
                    System.out.print("Side: ");
                    side = input.nextInt();
                    System.out.println("\nThe area of the square = "+ side*side + "cm2");
                    break;
                case 2:
                    System.out.print("Radius: ");
                    radius = input.nextInt();
                    System.out.println("\nThe area of the circle =" + phi*radius*radius + "cm2");
                case 3:
                    System.out.print("Side : ");
                    side = input.nextInt();

            }
        }
        
}
