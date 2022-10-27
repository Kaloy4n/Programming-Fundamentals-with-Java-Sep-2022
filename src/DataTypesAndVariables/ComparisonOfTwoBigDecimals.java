package DataTypesAndVariables;

import java.math.BigDecimal;

class ComparisonOfTwoBigDecimals {

    public static void main(String[] args)
    {
        // Creating 2 BigDecimal objects
        BigDecimal First, Second;

        First = new BigDecimal("47653.002");
        Second= new BigDecimal("22121.302");

        if (First.compareTo(Second) == 0) {
            System.out.println(First + " and " + Second + " are equal.");
        }
        else if (First.compareTo(Second) > 0) {
            System.out.println(First + " is greater than " + Second + ".");
        }
        else if (First.compareTo(Second) < 0) {
            System.out.println(First + " is lesser than " + Second + ".");
        }
    }
}