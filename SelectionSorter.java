public class SelectionSorter {
    public static void sort(int[]v) {
        for(int i=0; i<v.length;i++) {
            int minPos =minimumPosition(v,i);
            ArrayUtil.swap(v,minPos,i);
        }
    }
    
    private static int minimumPosition(int []v, int from){
        int minPos=from;
        for(int i=from+1;i<v.length;i++){
            if(v[i]<v[minPos]) minPos=i;
        }
        return minPos;
    }
}
