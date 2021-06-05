import java.util.Arrays;
//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

    public class NegativePositiveRearrange {
        public static int[] reArrange(int[] arr, int size) {
            int start = 0;
            int end = size-1;

            while (start <= end) {
                if(arr[start] <= 0 && arr[end] >= 0) {
                    start++;
                    end--;
                } else if(arr[start] >= 0 && arr[end] <= 0) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                } else if(arr[start] <= 0 && arr[end] <=0) {
                    start++;
                } else if(arr[start] >= 0 && arr[end] >=0) {
                    end--;
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr = {6, 3, 9, 5, -22, 1, -6, 3, -8, 5, -2, -1, 3, 99, 0}; 

            int[] arrUpdated = reArrange(arr, arr.length);
            System.out.println("Rearrange :"+Arrays.toString(arrUpdated));
        }
    }
