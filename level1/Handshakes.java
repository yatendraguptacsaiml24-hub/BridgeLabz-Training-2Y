import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
      
        int handshakes = n * (n - 1) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        sc.close();
    }
}
