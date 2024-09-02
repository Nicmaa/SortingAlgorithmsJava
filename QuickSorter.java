import java.util.Arrays;

public class QuickSorter {

    public static void sort(int[] v) {
        sort(v, 0, v.length - 1);
    }

    public static void sort(int[] v, int from, int to) {
        while (from < to) {
            int p = partition(v, from, to);
            // Choose the shorter part to sort to avoid stack overflow
            if (p - from < to - p) {
                sort(v, from, p - 1); // Sort the left part
                from = p + 1; // Update the starting index for the right part
            } else {
                sort(v, p + 1, to); // Sort the right part
                to = p - 1; // Update the end index for the left part
            }
        }
    }

    private static int partition(int[] v, int from, int to) {
        int pivot = v[from];
        int i = from;
        int j = to;
        while (i < j) {
            // Find an element greater than the pivot on the left
            while (v[i] <= pivot && i < to) {
                i++;
            }
            // Find an element less than or equal to the pivot on the right
            while (v[j] > pivot && j >= 1) {
                j--;
            }
            if (i < j) {
                ArrayUtil.swap(v, i, j); // Swap the two elements to maintain order
            }
        }
        ArrayUtil.swap(v, from, j); // Move the pivot to its final position
        return j; // Return the index of the pivot in its final position
    }
}
