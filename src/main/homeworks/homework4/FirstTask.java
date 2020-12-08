package homeworks.homework4;

public class FirstTask {

    //Switch first value in table with the last one

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
        numbers[0] = numbers[numbers.length - 1] - numbers[0];
        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];

        for (int number : numbers) {

            System.out.println(number);

        }

        System.out.println("----------------");

        //solution with variable
        int[] newNumbers = {1, 2, 3, 4, 5};

        int element = newNumbers[0];
        newNumbers[0] = newNumbers[newNumbers.length - 1];
        newNumbers[newNumbers.length - 1] = element;

        for (int number : newNumbers) {

            System.out.println(number);

        }

    }


}
