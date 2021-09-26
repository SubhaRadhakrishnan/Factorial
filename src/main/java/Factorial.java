public class Factorial {

    public int getFactorial(int inNumber) {
        int fact = 1;
        for (int counter = 2; counter <= inNumber; counter++) {
            fact *= counter;
        }
        return fact;
    }
}
