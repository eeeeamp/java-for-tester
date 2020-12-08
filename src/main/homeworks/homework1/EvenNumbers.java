package homeworks.homework1;

public class EvenNumbers {

    public static void main(String[] args) {

        int firstNumber = 31;
        int secondNumber = 341;
        int thirdNumber = 789;
        int fourthNumber = 4;

        System.out.println("Check if the sum of first two numbers is even");

        checkSumOfTwoNumbers(firstNumber, secondNumber);

        System.out.println("Check if the sum of last two numbers is even");

        checkSumOfTwoNumbers(thirdNumber, fourthNumber);

    }

    public static void checkSumOfTwoNumbers(int a, int b) {

        if ((a + b) % 2 == 0) {

            System.out.println("Sum of numbers is even");
        } else {
            System.out.println("Sum of numbers is not even");
        }

    }
}
