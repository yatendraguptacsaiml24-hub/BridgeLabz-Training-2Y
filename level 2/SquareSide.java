// level 2/SquareSide.java

public class SquareSide {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide perimeter of the square as an argument!");
            return;
        }
        double perimeter = Double.parseDouble(args[0]);
      
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
