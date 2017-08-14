package main.java;

/**
 * Created by vadim_vil on 04.08.2017.
 */
public class SearchUtils {
    public static int Search(int[] arr, int elt) {
        if ((elt > arr.length) || (elt < arr[1])) {
            int mid = -1;
            return mid;
        }
        int left = 0;
        int right = arr.length;
        int mid = 0;

            while (!(left >= right)) {
                mid = left + (right - left) / 2;
                if (arr[mid] == elt)
                    break;

                if (arr[mid] > elt)
                    right = mid;
                else
                    left = mid + 1;
            }
        return mid;
    }
}