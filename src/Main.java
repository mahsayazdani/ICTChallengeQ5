import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bankCapacity, n;
        bankCapacity = scan.nextInt();
        n = scan.nextInt();

        Bank bank = new Bank(1 , bankCapacity);
        List<Client> clients = new ArrayList<>();

        for(int i = 1, enterTime = 0; i <= n; ++i) {
<<<<<<< HEAD
            int servicTime = scan.nextInt();
            int boredThreshold = scan.nextInt();
            int entryDelay = scan.nextInt();
            enterTime += entryDelay;
            clients.add(new Client(i, servicTime, boredThreshold, enterTime));
=======
            int serviceTime = scan.nextInt();
            int boredThreshold = scan.nextInt();
            int entryDelay = scan.nextInt();
            enterTime += entryDelay;
            clients.add(new Client(i, serviceTime, boredThreshold, enterTime));
>>>>>>> 4e2e1858a6a77b442964e3e3f37443f2437b38d4
        }

        int time = 0;
        for(Client client : clients) {
            try {
                bank.enter(client);
            } catch (FullCapacityException e) {
                e.printStackTrace();
            }
        }

    }

    public static void done(Client client, String reason){}
}
