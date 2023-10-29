package array;

public class Triplets {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                for (int k = 0; k < arr.length; k++) {
                    if (sum == arr[k] && k != i && k != j) {
                        count++;
                    }
                }
            }
        }

        System.out.println("Number of triplets: " + count);
    }
}
