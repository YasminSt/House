package typeConversion;

public class Methode {
    public static void main(String[] args) {

        double area1 = calculateArea(5.2, 6.4);
        double area2 = calculateArea(4.5, 1.6);
        if (area1 > area2) {
            System.out.println("Area 1 is the greatest");
        } else System.out.println("Area 2 is the greatest");


    }

    public static double calculateArea(double length, double breadth) {
        double area = length * breadth;
        return area;
    }
}
