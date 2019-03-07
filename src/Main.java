import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bankCapacity, n;
        bankCapacity = scan.nextInt();
        n = scan.nextInt();

        Bank bank = new Bank(1, bankCapacity);
        List<Client> clients = new ArrayList<>();

        for (int i = 1, enterTime = 0; i <= n; ++i) {

            int serviceTime = scan.nextInt();
            int boredThreshold = scan.nextInt();
            int entryDelay = scan.nextInt();
            enterTime += entryDelay;
            clients.add(new Client(i, serviceTime, boredThreshold, enterTime));
        }

        int time = 0;
        for (Client client : clients) {
            try {
                bank.enter(client);
            } catch (FullCapacityException e) {
                e.printStackTrace();
            }
        }

    }

    public static void done(Client client, String reason) {
    }
}
