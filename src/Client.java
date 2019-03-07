
public class Client {
   private int entryTime;
   private int endWaitTime;
   private int remainWork;

    public Client(int entryTime, int endWaitTime, int remainWork) {
        this.entryTime = entryTime;
        this.endWaitTime = endWaitTime;
        this.remainWork = remainWork;
    }

    public int getEntryTime() {
        return entryTime;
    }

    public int getEndWaitTime() {
        return endWaitTime;
    }

    public int getRemainWork() {
        return remainWork;
    }

    public void decreaseRemainWork(){
        remainWork--;
    }
}
