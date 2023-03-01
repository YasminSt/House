package room;

public class Rooms {
    public static void main(String[] args) {
        //squareMeters
        float squareMeters;
        //roomHight
        float roomHight;
        float roomlänge;
        float roombreite;

        squareMeters = 5.2f;
        roomHight = 2.4f;
        roombreite = 1.4f;
        roomlänge = 1.7f;


        System.out.println("If you want to fill the Bathroom with Water you need " + (roombreite * roomlänge * roomHight * 1000) + " L");
    }
}
