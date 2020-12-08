package homeworks;

public class TableMain {

    public static void main(String[] args) {

//        System.out.println("First interview task");
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        int element = numbers[0];
//        numbers[0] = numbers[numbers.length - 1];
//        numbers[numbers.length - 1] = element;
//
//        for (int number : numbers) {
//
//            System.out.println(number);
//
//        }

        //without variables
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
//        numbers[0] = numbers[numbers.length - 1] - numbers[0];
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];
//
//        for (int number : numbers) {
//
//            System.out.println(number);
//
//        }

//        System.out.println("Second interview task");
//        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};
//
//        int evenNumbers = 0;
//        int oddNumbers = 0;
//
//        System.out.println("Even numbers");
//
//        for (int i = 0; i < numbers.length; i++) {
//
//            if (numbers[i] % 2 == 0) {
//                evenNumbers++;
//            } else {
//                oddNumbers++;
//            }
//        }
//
//        System.out.println(evenNumbers);
//        System.out.println(oddNumbers);
//

        System.out.println("Third interview task");
        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        int min;

        for (int i = 0; i < numbers.length; i++) {

            min = numbers[i];
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] < min){
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
        for (int number : numbers) {

            System.out.println(number);
        }
    }

}
