import java.util.ArrayList;

public class Bank {
    private int freeGateCount;
    private int freeSeatCount;
    private long currentTime;
    private ArrayList<Client> clients;
    private Gate[] gates;

    public Bank(int gateInitCount, int seatInitCount) {
        freeGateCount = gateInitCount;
        freeSeatCount = seatInitCount;
    }

    public Bank(int freeSeatCount, Gate[] gates) {
        this.freeGateCount = gates.length;
        this.freeSeatCount = freeSeatCount;
        this.gates = gates;
    }

    public void enter(Client client) throws FullCapacityException {
        if (freeGateCount > 0) {
            freeGateCount--;
            client.setOnWork(true);
            clients.add(client);
        } else if (freeSeatCount > 0) {
            freeSeatCount--;
            clients.add(client);
        } else {
            throw new FullCapacityException();
        }
    }

    public void timeLapse(){
        currentTime ++;
        for(int i=0; i<clients.size(); i++){
            Client client = clients.get(i);
            if(client.getRemainWork() <= 0){
                clients.remove(client);
                Main.done(client, "JobsDone");
                i--;
            }else if((!client.isOnWork()) && client.getEndWaitTime() > currentTime){
                clients.remove(client);
                Main.done(client, "Bored");
                i--;
            }else if(client.isOnWork()){

                client.decreaseRemainWork();
            }
        }
    }

    public long getCurrentTime() {
        return currentTime;
    }
}
