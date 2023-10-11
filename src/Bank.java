import java.util.HashMap;
import java.util.Optional;

public class Bank {
    public HashMap<String, Client> clients = new HashMap<>();

    public double getSumOfClientsInCurrency(Currency targetCurrency) {
        double sum = 0;

        for (String s : clients.keySet()) {
            for (Account clientAccount : clients.get(s).getAccounts()) {
                sum += clientAccount.getBalanceInCurrency(targetCurrency);
            }
        }

        return sum;
    }

    public Optional<Client> getClient(String phoneNumber) {
        if (!clients.containsKey(phoneNumber)) {
            return Optional.empty();
        }

        return Optional.of(clients.get(phoneNumber));
    }

    public void createClient(Client client) {
        if (clients.containsKey(client.getPhoneNumber())) {
            throw new RuntimeException("Пользователь с таким юзернеймом уже существует");
        }

        clients.put(client.getPhoneNumber(), client);
    }

    public boolean deleteClient(String phoneNumber) {
        if (!clients.containsKey(phoneNumber)) return false;

        clients.remove(phoneNumber);
        return true;
    }
}
