import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();
        double totalInches = heightCm / 2.54;

        int feet = (int)(totalInches / 12);      
        double inches = totalInches % 12;        
      
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + String.format("%.2f", inches));

        sc.close();
    }
}
