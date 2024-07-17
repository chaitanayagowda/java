public class ByteShort {

    public static int calculateSum(byte a, short b) {
        int sum = a + b;
        return sum;
    }

    public static int calculateDifference(byte a, short b) {
        int difference = a - b;
        return difference;
    }

    public static void main(String[] args) {
        byte num1 = 10;
        short num2 = 5;

        int sum = calculateSum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        int difference = calculateDifference(num1, num2);
        System.out.println("Difference of " + num1 + " and " + num2 + " is: " + difference);
    }
}
