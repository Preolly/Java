package OOPS;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(6)));
    }
        public static int[] twoSum(int target) {
            int[] arr = {1,3,3,10};

            for (int j = 0; j < arr.length; j++) {
                for (int i = 1; i < arr.length; i++) {
                    int sum = arr[j] + arr[i];
                    if (sum == target) {
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{};
        }
    }

