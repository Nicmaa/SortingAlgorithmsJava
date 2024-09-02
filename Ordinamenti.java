import java.util.Scanner;
import java.util.Arrays;
import java.util.function.Consumer;

public class Ordinamenti {

    public static void printTimeSorter() {
        Scanner scanner = new Scanner(System.in);
        String input;
        String exit = "exit";
        do {
            System.out.println("Which sorting algorithm would you like to use? [or type exit]");
            input = scanner.next().toLowerCase();
            if (!input.equals(exit)) {
                System.out.println("First element: ");
                int first = scanner.nextInt();
                System.out.println("Last element: ");
                int last = scanner.nextInt();
                System.out.println("Step: ");
                int step = scanner.nextInt();

                if (step <= 0) {
                    System.out.println("Step must be greater than 0.");
                    continue;
                }

                switch (input) {
                    case "selectionsort":
                        printTimeSelection(first, last, step);
                        break;
                    case "insertsort":
                        printTimeInsert(first, last, step);
                        break;
                    case "mergesort":
                        printTimeMerge(first, last, step);
                        break;
                    case "bubblesort":
                        printTimeBubble(first, last, step);
                        break;
                    case "quicksort":
                        printTimeQuick(first, last, step);
                        break;
                    case "arrays":
                        printTimeArrays(first, last, step);
                        break;
                    default:
                        System.out.println(
                                "Sorting algorithm not available. Choose from: selectionsort, insertsort, mergesort, bubblesort, quicksort, arrays.");
                        break;
                }
            }
        } while (!input.equals(exit));
        scanner.close();
    }

    private static void benchmarkSort(String sortName, int first, int last, int step, Consumer<int[]> sortFunction) {
        System.out.println("\n" + sortName.toUpperCase() + "\n\nSIZE:\tTIME(ms)\tTIME(s):");
        Time timer = new Time();
        for (int i = first; i <= last; i += step) {
            int[] array = ArrayUtil.randomIntArray(i, 101);
            timer.start();
            sortFunction.accept(array);
            timer.stop();
            System.out.println(i + "\t" + timer.getElapsedTime() + "\t\t" + timer.getElapsedTime() / 1000.0);
        }
    }

    public static void printTimeSelection(int first, int last, int step) {
        benchmarkSort("Selection Sort", first, last, step, SelectionSorter::sort);
    }

    public static void printTimeInsert(int first, int last, int step) {
        benchmarkSort("Insertion Sort", first, last, step, InsertSorter::sort);
    }

    public static void printTimeMerge(int first, int last, int step) {
        benchmarkSort("Merge Sort", first, last, step, MergeSorter::sort);
    }

    public static void printTimeBubble(int first, int last, int step) {
        benchmarkSort("Bubble Sort", first, last, step, BubbleSorter::sort);
    }

    public static void printTimeQuick(int first, int last, int step) {
        benchmarkSort("Quick Sort", first, last, step, QuickSorter::sort);
    }

    public static void printTimeArrays(int first, int last, int step) {
        benchmarkSort("Arrays.sort()", first, last, step, Arrays::sort);
    }
}
