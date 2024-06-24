package Recursion;

public class binarySearch {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // first element
        System.out.println(search(0, intArray.length-1, 1, intArray));

        // last element
        System.out.println(search(0, intArray.length-1, 10, intArray));

        // somewhere in between
        System.out.println(search(0, intArray.length-1, 4, intArray));

        // not present in array
        System.out.println(search(0, intArray.length-1, 11, intArray));

    }

    public static int search(int start, int end, int target, int[] arr){

        if(start > end){
            return -1;
        }

        int mid = (start+end)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return search(start, mid-1, target, arr);
        }

        return search(mid+1, end, target, arr);

    }

}
