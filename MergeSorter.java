import java.util.Arrays;

public class MergeSorter {
    public static void sort(int []v) {

        if(v.length<=1) return;
        
        int [] first= new int[v.length/2];
        int [] second= new int[v.length-first.length];

        for(int i=0; i<first.length;i++) {
            first[i]=v[i];
        }
        for(int i=0;i<second.length;i++) {
            second[i]=v[first.length+i];
        }
        
        sort(first);
        sort(second);

        merge(first, second, v);

    }

    public static void merge(int []f, int[]s,int[]a) {
        int iFirst = 0;
        int iSecond= 0;
        int j=0;

        while(iFirst<f.length && iSecond<s.length) {
            if(f[iFirst]<s[iSecond]) {
                a[j]=f[iFirst];
                iFirst++;
            }
            else {
                a[j]=s[iSecond];
                iSecond++;
            }
            j++;
        }

        while(iFirst<f.length) {
            a[j]=f[iFirst];
            iFirst++;
            j++;
        }

        while(iSecond<s.length) {
            a[j]=s[iSecond];
            iSecond++;
            j++;
        }
    }
}
