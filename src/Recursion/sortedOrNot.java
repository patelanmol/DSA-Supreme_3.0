package Recursion;

public class sortedOrNot {

    public static void main(String[] args) {

        int[] notSortedArray = {100, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(checkSorted(notSortedArray, 0, notSortedArray[0]));


        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(checkSorted(sortedArray, 0, sortedArray[0]));
    }

    public static boolean checkSorted(int[] arr, int index, int prev){
        if(index == arr.length){
            return true;
        }

        if(arr[index] < prev){
            return false;
        }

        return checkSorted(arr, index+1, arr[index]);
    }

}
