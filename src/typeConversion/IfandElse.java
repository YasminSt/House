package typeConversion;

public class IfandElse {
    public static void main(String[] args) {
        // on th bus you receive a discount if you are a senior a dog or a student
//
//        boolean isSenior = true;
//        boolean isDog = true;
//        boolean isStudent = true;
//
//
//        discountCheck(isSenior, isDog, isStudent);
//        discountCheck(true, false, false);
//        discountCheck(false, true, false);
//        discountCheck(false, false, true);
//        discountCheck(false, false, false);


        //In a bookstore you receive a "Discount" if you buy more than 2 non-fictional and at least one fiction book

        int fiction = 4;
        int nonFiction = 6;

        String result = discountCheckBooks(fiction, nonFiction);
        System.out.println(result);
        discountCheckBooks(0, 1);
        discountCheckBooks(1, 3);
        discountCheckBooks(0, 5);
        discountCheckBooks(12, 1);

    }


    public static void discountCheck(boolean isSenior, boolean isDog,
                                     boolean isStudent) {
        if (isSenior) {
            System.out.println("Discount");
        } else if (isDog) {
            System.out.println("Discount");
        } else if (isStudent) {
            System.out.println("Discount");
        } else {
            System.out.println("No Discount");
        }

    }

    public static String discountCheckBooks(int fiction,
                                          int nonFiction) {
        String discount = "Discount";
        String noDiscount = "No Discount";
        if (fiction > 0 && nonFiction >= 3) {
            return ("Discount");
        }else return noDiscount;
    }

}

