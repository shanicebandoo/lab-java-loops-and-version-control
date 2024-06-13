public class Questions {
    public static void main(String[] args){
        int[] randomNums = {1,2, 4, 5, 7, 8, 12};
        int[] results = findSmallestAndSecond(randomNums);
        System.out.println("Question 1 - Difference: " + differenceNums(randomNums));
        System.out.println("Question 2 - The smallest number is: " + results[0] +". The second smallest number is: " + results[1]);

        double x = 5.0;
        double y = 4.0;
        double calculation = calculateExpression(x, y);
        System.out.println("Question 3 - The result is: " + calculation);
    }

    public static int differenceNums(int[] array){
        if (array.length < 1) {
            throw new IllegalArgumentException("Array length must be at least 2");
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }

    public static int[] findSmallestAndSecond(int[] array){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int value : array) {
            if (value < smallest) {
                secondSmallest = smallest;
                smallest = value;
            } else if (value < secondSmallest && value != smallest) {
                secondSmallest = value;
            }
        }
            return new int[]{smallest, secondSmallest};

    }

    public static double calculateExpression(double x, double y){
        double firstTerm = Math.pow(x, 2);
        double secondTerm = Math.pow((4 * y/5 - x), 2);
        return firstTerm + secondTerm;
    }
}
