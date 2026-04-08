// level 2/TriangleArea.java

public class TriangleArea {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide base and height in cm as arguments!");
            return;
        }
    
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " 
                           + areaInch + " and sq cm is " + areaCm);
    }
}
