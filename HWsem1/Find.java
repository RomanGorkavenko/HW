package HWsem1;

public class Find {
    
    public static int findCenter(int[] array) {
        if (array == null || array.length <= 2) {
            throw new IllegalArgumentException("Array must contain at least 3 elements");
        }
        for (int i = 1; i < array.length - 1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = i - 1; j >= 0; j--) {
                sum1 += array[j];
            }
            for (int j = i + 1; j <= array.length - 1; j++) {
                sum2 += array[j];

            }
            if (sum1 == sum2) {
                return i;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 12, 5, 3, 7};
        System.out.println("Индекс = " + findCenter(array));
    }
}
