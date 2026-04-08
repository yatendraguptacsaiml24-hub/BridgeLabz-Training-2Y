public class IntOperation {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide 3 integer values for a, b, and c.");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
      
        int result1 = a + b * c;   
        int result2 = a * b + c;   
        int result3 = c + a / b;   
        int result4 = a % b + c;   

        System.out.println("The results of Int Operations are " 
                           + result1 + ", " + result2 + ", " + result3 
                           + " and " + result4);
    }
}
