
public class Client {

    private int id;
    private int entryTime;
    private int endWaitTime;
    private int remainWork;

    public Client(int id, int entryTime, int endWaitTime, int remainWork) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void decreaseRemainWork(){
        remainWork--;
    }
}
