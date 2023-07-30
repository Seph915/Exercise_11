import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        String[] carBrand = {"fiat", "mercedes", "audi", "jeep", "seat"};
        System.out.println("number car brand " + carBrand.length);
        System.out.println("third car brand " + carBrand[2]);

        int [] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        for(int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);

        }
    }
}
