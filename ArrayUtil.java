import java.util.Random;

public class ArrayUtil {
    private static Random generator = new Random();

    public static int [] randomIntArray(int dim, int max) {
        int[] v = new int[dim];
        for(int i=0;i<v.length;i++) {
            v[i]=generator.nextInt(max);
        }
        return v;
    }

    public static int [] copyArray(int []v) {
        int[] a = new int[v.length];
        for(int i=0;i<v.length;i++) {
            a[i]=v[i];
        }
        return a;
    }

    public static void swap(int []v, int i, int j) {
       int temp=v[i];
       v[i]=v[j];
       v[j]=temp;
    }
}
