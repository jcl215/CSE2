//Jessica Lazo Quintana
//09/05/2014
//CSE2
//
public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args) {
        int secsTrip1=480; //Time for first trip
        int secsTrip2=3220; //Time for second trip
        int countsTrip1=1561; //Rotation Counts for first trip
        int countsTrip2=9037; //Rotation Counts for second trip
        double wheelDiameter=27.0, //The wheel diameter
        PI=3.14159, //The numerical value of PI
        feetPerMile=5280, //The number of feet per mile
        inchesPerFoot=12, //the number of inches per foot
        secondsPerMinute=60; //the seconds per minute
        double distanceTrip1, distanceTrip2,totalDistance; //The total distance of trip 1 and trip 2
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;// Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");

    } //end of main method
} //end of class
