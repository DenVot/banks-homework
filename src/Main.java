public class Main {
    public static void main(String[] args) {
        Currency cur1 = new Currency("CR1", 2);
        Currency cur2 = new Currency("CR2", 3);

        Bank bank = new Bank();

        Client client = new Client("Denis", "Voitenko", "88002253535");
        bank.createClient(client);

        client.createAccount(cur1, 100);
        Account accountIn2 = client.createAccount(cur2, 123);

        accountIn2.setBalance(100);

        System.out.println(bank.getClient("88002253535").isPresent());
        System.out.println(bank.getClient("88002253534").isPresent());
        System.out.println(bank.getSumOfClientsInCurrency(cur2));
    }
}