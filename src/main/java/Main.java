import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,2,6,3,8,1,5,2};
        bubbleSort(nums, false);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {
        bubbleSort(nums, true);
    }

    public static void bubbleSort(int[] nums, boolean ascending) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1] ^ !ascending) { // exclusive or operator
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    public static void otherSort(int[] nums) {
        int idx = 0;
        int temp;
        while (idx <= nums.length - 2) {
            if (nums[idx] <= nums[idx + 1]) {
                idx++;
            } else {
                temp = nums[idx];
                nums[idx] = nums[idx + 1];
                nums[idx + 1] = temp;
                if (idx == 0) {
                    idx++;
                    continue;
                }
                idx--;
            }
        }
    }
}
