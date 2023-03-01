package house;

public class LivingRoom {
    public static void main(String[] args) {
        //squareMeters
        int squareMeters;
        //prisePerSquareMeters
        double pricePerSquareMeters;
        //address
        String address;

        squareMeters=122;
        pricePerSquareMeters=14.4;
        address="lalastreet 5";

        System.out.println("The the cost of the house at " + (address) + " is " + (squareMeters * pricePerSquareMeters));

    }
}
