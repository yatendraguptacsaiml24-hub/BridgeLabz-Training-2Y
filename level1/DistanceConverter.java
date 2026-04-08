import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
      
        System.out.println("The distance is " + feet + " feet, which is " 
                           + yards + " yards and " + miles + " miles.");

        sc.close();
    }
}
