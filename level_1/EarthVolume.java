import java.lang.Math;

public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius of Earth in kilometers
        double radiusMiles = radiusKm * 0.621371; // Convert km to miles

        double volumeKm3 = (4.0/3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0/3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of earth in cubic kilometers is "+ volumeKm3 + " The volume of earth in cubic miles is "+ volumeMiles3);
    }
}