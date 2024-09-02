public class Time {
   
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;
    
    public Time(){
        reset();
    }
    
    private void reset (){
        startTime=0;
        elapsedTime=0;
        isRunning=false;
        
    }
    
    public void start (){
        if(isRunning) return;
        isRunning=true;
        startTime=System.currentTimeMillis();
        
    }

    public void stop(){
        if(isRunning){
            isRunning=false;
            long endTime=System.currentTimeMillis();
            elapsedTime= endTime - startTime;
        }
    }

    public long getElapsedTime() {
        if(isRunning) {
            long endTime = System.currentTimeMillis();
            return endTime-startTime;
        } else {
            return elapsedTime;
        }
    }

    
}
