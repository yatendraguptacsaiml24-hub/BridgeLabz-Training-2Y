public class DoubleOpt {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide 3 double values for a, b, and c.");
            return;
        }
      
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
      
        double result1 = a + b * c;   
        double result2 = a * b + c;   
        double result3 = c + a / b;   
        double result4 = a % b + c;  

        System.out.println("The results of Double Operations are " 
                           + result1 + ", " + result2 + ", " + result3 
                           + " and " + result4);
    }
}
