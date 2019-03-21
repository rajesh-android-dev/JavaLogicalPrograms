package algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int n = arr.length;
        int x = 23;
        int result = bs.binarySearchRecursive(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    int binarySearchRecursive(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearchRecursive(arr, left, mid - 1, x);

            return binarySearchRecursive(arr, mid + 1, right, x);

        }
        return -1;
    }

    int binarySearchIterative(int arr[], int left, int right, int x) {
        while (right >= left){
            int mid = left + (right - left)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid]<x)
                left = mid+1;
            else
                right = mid-1;
        }
        return -1;
    }
}
