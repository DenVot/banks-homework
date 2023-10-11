import java.util.ArrayList;

public class ClientInfo {
    private final Client client;
    private final ArrayList<Account> accounts;

    public ClientInfo(Client client) {
        this.client = client;
        accounts = new ArrayList<>();
    }

    public Client getClient() {
        return client;
    }

    public ArrayList<Account> getClientAccounts() {
        return accounts;
    }
}
