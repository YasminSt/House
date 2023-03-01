package typeConversion;

public class Logic {
    public static void main(String[] args) {
        //The sun is shining and it is raining
        boolean sun = true;
        boolean rain = true;

        System.out.println(sun && rain);

        //This exercise is confuses me OR I know exactly what this is about

        boolean confusesMe = true;
        boolean iKnow = false;

        System.out.println(confusesMe || iKnow);

//        (1>3 AND(NOT(3-2<5)) OR 2*2 == 4)
        boolean result = (1 > 3 && (!(3 - 2 < 5)) || 2 * 2 == 4);
        System.out.println(result);

//        (6 >= 2*3 ||2-3 < 0) && (1*1 == 1 && 1 != 1+1)
        boolean result2 = ((6 >= 2 * 3 || 2 - 3 < 0) && (1 * 1 == 1 && 1 != 1 + 1));
        System.out.println(result2);



    }
}
