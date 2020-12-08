package homeworks.homework4;

public class SecondTask {

    public static void main(String[] args) {

        //Count even and odd numbers in tables
        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {

                evenNumbers++;
            } else {

                oddNumbers++;
            }
        }

        System.out.println("Sum of even numbers: " + evenNumbers);
        System.out.println("Sum of odd numbers: " + oddNumbers);

    }
}
