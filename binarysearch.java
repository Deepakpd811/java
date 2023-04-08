// binary search

public class binarysearch {

    static int binarySearch(int arr[], int start, int end, int x) {
        

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid ;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    };

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int len = arr.length;
        int val = 4;

        int res = binarySearch(arr, 0, len, val);

        System.out.println(res);


    }
}
