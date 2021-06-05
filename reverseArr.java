
class ReverseArr {
    //Write a program to reverse an array (or string)

    public static int revArr(int[] arr) {
        int arrlen = arr.length;

        if(arrlen == 0) return null;

        int[] newArr = new int[arrlen]; 

        for(int i=1; i<=arrlen; i++) {
            newArr[i] = arr[arrlen-i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] regularArr = {1, 3, 4, 5, 6};
        revArr(regularArr);

        System.out.println(regularArr);
    }
}