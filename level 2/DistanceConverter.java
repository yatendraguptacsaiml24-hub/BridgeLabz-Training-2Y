public class DistanceConverter {
    public static void main(String[] args) {
        int distanceInFeet = 5280;   

        int distanceInYards = distanceInFeet / 3;        
        double distanceInMiles = (double) distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);
    }
}
