public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 15, 20, 41, 22, 37, 55, 19, 24 };
        int target = 22;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // Search in the array : return the index if item found"
    // otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run for loop
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}