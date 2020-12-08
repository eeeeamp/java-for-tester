package homeworks.homework4;

public class FourthTask {

    public static void main(String[] args) {

        //Order the table DESC
        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] < numbers[j]) {
                    int index = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = index;
                }
            }
        }

        for (int number : numbers) {

            System.out.println(number);

        }

    }
}
