import java.util.ArrayList;

public class Bank {
    private int freeGateCount;
    private int freeSeatCount;
    private long currentTime;
    private ArrayList<Client> clients;

    public Bank(int gateInitCount, int seatInitCount) {
        freeGateCount = gateInitCount;
        freeSeatCount = seatInitCount;
    }

    public void enter(Client client) throws FullCapacityException {
        if (freeGateCount > 0) {
            freeGateCount--;
            clients.add(client);
        } else if (freeSeatCount > 0) {
            freeSeatCount--;
            clients.add(client);
        } else {
            throw new FullCapacityException();
        }
    }

    public void timeLapse(){

    }
=======
  
  
>>>>>>> refs/remotes/origin/master
}
