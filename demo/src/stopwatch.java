public class stopwatch {

    private long startTime;
    private long endTime;

    public stopwatch(){
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }

    public long start(){
        this.startTime = System.currentTimeMillis();
        return startTime;

    }

    public long end(){
        this.endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
