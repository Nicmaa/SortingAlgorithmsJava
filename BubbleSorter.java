public class BubbleSorter {
    public static void sort(int[]v) {
        for(int j=v.length;j>0;j--) {
            for(int i=0;i<v.length-1;i++) {
                if(v[i]>v[i+1]) ArrayUtil.swap(v, i, i+1);
            }
        }
    }
}
