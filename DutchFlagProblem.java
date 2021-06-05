import java.util.Arrays;

    public class DutchFlagProblem {

        public static int[] getSorted_2(int[] arr) {
            //3 flags 0, 1, 2
            int alen = arr.length;

            int start = 0;
            int end = alen-1;
            int index = 0;

            while(index <=end) {

                if(arr[index] == 0) {
                    int temp =  arr[start];
                    arr[start] = arr[index];
                    arr[index] = temp;

                    start++;
                    index++;
                } else if(arr[index] == 1) {
                    index++;
                } else if(arr[index] == 2) {
                    int temp =  arr[end];
                    arr[end] = arr[index];
                    arr[index] = temp;
                    end--;
                }
            }

            return arr;
        }

        public static int[] getSorted_1(int[] arr) {
            int alen = arr.length;
            int zero, one, two;
            one = two = zero = 0;

            for(int i=0; i<alen-1; i++) {
                if (arr[i] == 0) zero++;
                else if (arr[i] == 1) one++;
                else two++;
            }

            for(int j=0; j<zero; j++) {
                arr[j] = 0;
            }
            for(int j=zero; j<zero+one; j++) {
                arr[j] = 1;
            }
            for(int j=zero+one; j<(zero+one+two); j++) {
                arr[j] = 2;
            }
            return arr; 
        } 

        public static void main(String[] args) {
            int[] unsortArr = {2, 2, 1, 0, 2, 0, 1, 1, 2, 2, 0};
            int[] sortArr = getSorted_2(unsortArr);

            System.out.println("Sorted Array: "+Arrays.toString(sortArr));
        }
    }
