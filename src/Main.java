
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
        ArrayList<Client> clients = new ArrayList<Client>();

        for (int i = 0, enterTime = 0; i <= n; ++i) {
            int servicTime = scan.nextInt();
            int boredThreshold = scan.nextInt();
            int entryDelay = scan.nextInt();
            enterTime += entryDelay;
            clients.add(new Client(i+1, servicTime, boredThreshold, enterTime));
        }

        for (Client client : clients) {
            try {
                while (bank.getCurrentTime() < client.getEntryTime()) {
                    bank.timeLapse();
                }
                bank.enter(client);
            } catch (FullCapacityException e) {
                System.out.println("Banned");
            }
        }
        bank.timeLapse();
    }


    public static void done(Client client, String reason){
        System.out.println(client.getId() + ", " + reason);
    }
}
