import java.util.Arrays;

class MinMaxInSortedArray {


    public static int[] searchRange(int[] a, int n) {
        int start = 0;
        int end = a.length;

        int first = -1;
        int last = -1;
        int[] res=new int[2];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (a[mid] == n) {
                first = mid;
                end = mid - 1;
            } else if (a[mid] < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            res[0]=first;

        }
        start = 0;
        end = a.length;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (a[mid] == n) {
                last=mid;
                start = mid + 1;
            } else if (a[mid] < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            res[1]=last;

        }
        return res;
    }

    public static void main(String[] args) {

        int[] a = {5, 7, 8, 10, 10, 10, 15, 18, 20};
        int n = 10;
        System.out.println(Arrays.toString(MinMaxInSortedArray.searchRange(a, n)));
    }



}
