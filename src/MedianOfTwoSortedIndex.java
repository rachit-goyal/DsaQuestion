public class MedianOfTwoSortedIndex {


    public static double median(int[] arr1, int[] arr2) {

        int len = arr1.length + arr2.length;
        int[] mergeArray = new int[len];
        int i = 0;
        int j = 0;
        int k = 0;
        double median = 0.0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                mergeArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mergeArray[k] = arr2[j];
                j++;
                k++;
            }

        }

        while (i < arr1.length) {
            mergeArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            mergeArray[k] = arr2[j];
            j++;
            k++;
        }

        int m = mergeArray.length / 2;
        if (mergeArray.length % 2 == 0) {
            median = mergeArray[m] + mergeArray[m - 1];
            median = median / 2;
        } else {
            median = mergeArray[m];
        }

        return median;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        System.out.println(MedianOfTwoSortedIndex.median(arr1, arr2));
    }
}
