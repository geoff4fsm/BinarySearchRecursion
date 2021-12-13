public class BinarySearchRecursion {
    public static int binarySearch(int[] arr, int left, int right, int target)
    {
       if ( left > right ) {
           return -1;
       }
        int mid =  left + ( right - left ) / 2 ;
        if ( target == arr[mid]) {
            return mid ;
    }
        if ( target < arr[mid] ) {
            return binarySearch( arr, left, mid - 1, target );
    }
        if ( target > arr[mid] ) {
            return binarySearch( arr, mid + 1 , right, target );
    }
        return mid;
    }

    public static void main(String[] args)
    {
        int[] arr = { 2, 5, 6, 8, 9, 10 };
        int target = 5;

        int left = 0;
        int right = arr.length - 1;

        int index = binarySearch(arr, left, right, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
