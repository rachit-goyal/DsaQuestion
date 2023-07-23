public class PeakElement {


    public static int peakElement(int[] arr) {
        int res = -1;


        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0) {
            return res;
        }
        if (arr.length == 1) {
            return 0;
        }
        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                return 0;
            } else {
                return 1;
            }
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid + 1] > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (mid == 0) {
                if (arr[0] > arr[1]) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (mid == arr.length - 1) {
                if (arr[mid -1] > arr[mid]) {
                    return mid - 1;
                } else {
                    return mid ;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(PeakElement.peakElement(arr));
    }
}
