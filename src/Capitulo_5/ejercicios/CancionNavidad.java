package Capitulo_5.ejercicios;

public class CancionNavidad {
    public static void main(String[] args) {
        String[] dias = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
                "eleventh", "twelfth" };
        String[] regalos = {
                "a partridge in a pear tree",
                "two turtle doves, and",
                "three French hens,",
                "four calling birds,",
                "five golden rings,",
                "six geese a-laying,",
                "seven swans a-swimming,",
                "eight maids a-milking,",
                "nine ladies dancing,",
                "ten lords a-leaping,",
                "eleven pipers piping,",
                "twelve drummers drumming,"
        };

        for (int i = 0; i < 12; i++) {
            System.out.println("On the " + getDayText(i) + " day of Christmas,");
            System.out.println("my true love sent to me:");
            for (int j = i; j >= 0; j--) {
                if (j == 0 && i != 0) {
                    System.out.println("and " + regalos[j]);
                } else {
                    System.out.println(regalos[j]);
                }
            }
            System.out.println();
        }
    }

    public static String getDayText(int day) {
        switch (day) {
            case 0:
                return "first";
            case 1:
                return "second";
            case 2:
                return "third";
            case 3:
                return "fourth";
            case 4:
                return "fifth";
            case 5:
                return "sixth";
            case 6:
                return "seventh";
            case 7:
                return "eighth";
            case 8:
                return "ninth";
            case 9:
                return "tenth";
            case 10:
                return "eleventh";
            case 11:
                return "twelfth";
            default:
                return "";
        }
    }
}
