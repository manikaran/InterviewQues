 
//Maximum and minimum of an array using minimum number of comparisons
class LinearSearch {

    public static class Pair {
        int min;
        int max;
    }

    public static Pair getMinMax(int[] arr) {
        int arrlen = arr.length;
        Pair pObj = new Pair();

        if(arrlen == 0) {
            pObj.min = pObj.max = 0;
            return pObj;
        }

        if(arrlen == 1) {
            pObj.min = pObj.max = arr[0];
            return pObj;
        }

        if(arr[0] < arr[1]) {
            pObj.min = arr[0];
            pObj.max = arr[1];
        } else {
            pObj.min = arr[1];
            pObj.max = arr[0];
        }

        for(int i=2; i<arrlen; i++) {
        if(arr[i] < pObj.min) {
            pObj.min = arr[i];
        } else if(arr[i] > pObj.max) {
            pObj.max = arr[i];
        }
        }
            return pObj;
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 0, 8, 3, 5, 1, 2, 9};
        int arr1[] = {};
        int arr2[] = {6};
        Pair minMaxObj = getMinMax(arr2);

        System.out.println("Min: "+minMaxObj.min);
        System.out.println("Max: "+minMaxObj.max);
    }
}