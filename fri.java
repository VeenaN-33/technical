public class fri {
public static void main(String[] args) {
    

    int[] array = {3, 1, 4, 6, 2, 8};
        int[] result = findMinMaxSum(array);
        System.out.println("Sum of Maximum and Minimum elements: " + (result[0] + result[1]));
    }
        public static int[] findMinMaxSum(int[] arr) {
            if (arr == null || arr.length == 0) {
                // Handle empty array or null input
                return new int[]{0, 0};
            }
    
            int min = arr[0];
            int max = arr[0];
    
            for (int element : arr) {
                if (element < min) {
                    min = element;
                }
                if (element > max) {
                    max = element;
                }
            }
    
            return new int[]{min, max};
        }
}

