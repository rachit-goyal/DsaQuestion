import javax.swing.*;

public class SearchElementInRotatedArray {


    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            final int m = (l + r) / 2;
            if (nums[m] == target)
                return Math.max(bs(nums, m, r, target), bs(nums, l, m - 1, target));
            if (nums[l] <= nums[m]) { // nums[l..m] are sorted
                /*if (nums[l] <= target && target < nums[m])
                    r = m - 1;
                else
                    l = m + 1;*/
                l = m + 1;
            } else { // nums[m..n - 1] are sorted
                /*if (nums[m] < target && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;*/
                r = m - 1;
            }
        }


        return -1;

    }

    public static int bs(int[] a, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,5};

        System.out.println(SearchElementInRotatedArray.search(arr, 3));
    }
}
