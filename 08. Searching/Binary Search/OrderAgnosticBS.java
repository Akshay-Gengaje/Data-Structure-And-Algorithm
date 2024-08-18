public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { -18, -10, -3, 2, 5, 10, 11, 18, 20, 21, 23, 45, 55 };
        int[] arr = { 55, 45, 23, 21, 20, 18, 11, 10, 5, 2, -3, -10, -18 };
        int target = 55;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // Find Array is sorted in ascending order or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}