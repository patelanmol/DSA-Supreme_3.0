package Recursion;

public class searchElementInArray {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(search(intArray, 10, 0, 11));

        System.out.println(search(intArray, 10, 0, 5));

    }

    public static boolean search(int[] arr, int size, int index, int target){

        if(arr[index] == target){
            return true;
        }

        if(index == size-1){
            return false;
        }

        return search(arr, size, index+1, target);

    }
}
