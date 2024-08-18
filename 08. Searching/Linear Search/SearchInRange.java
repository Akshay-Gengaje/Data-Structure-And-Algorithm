public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 11;
        int start = 5;
        int end = arr.length;
        System.out.println(searchInRange(arr, target,start, end));
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0)
            return -1;
        for (int i = start; i < end; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
