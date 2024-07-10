public class arrayA1 {
    public static void Find(int numbers[]) {
        int check = numbers[0];
        boolean result = false;
        for (int i = 1; i < numbers.length; i++) {
            if (check == numbers[i]) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 1 };
        Find(numbers);
    }
}
