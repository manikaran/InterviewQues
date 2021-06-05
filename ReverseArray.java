import java.util.Arrays;

class ReverseArray {
    //Write a program to reverse an array (or string)

    public static int[] revArr(int[] arr) {
        int arrlen = arr.length;
        int[] newArr = new int[arrlen]; 

        for(int i=0; i<arrlen; i++) {
            newArr[i] = arr[arrlen-1-i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] regularArr = {1, 2, 3, 4, 5, 6};
        int[] newArray = revArr(regularArr);

        System.out.println(Arrays.toString(newArray));
    }
}