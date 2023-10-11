import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String firstname;
    private final String surname;
    private final String phoneNumber;
    private final ArrayList<Account> accounts;

    public Client(String firstname, String surname, String phoneNumber) {
        this.firstname = firstname;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        accounts = new ArrayList<>();
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account createAccount(Currency targetCurrency) {
        return createAccount(targetCurrency, 0);
    }

    public Account createAccount(Currency targetCurrency,
                              double initialValue) {
        Account account = new Account(targetCurrency);
        account.setBalance(initialValue);
        accounts.add(account);

        return account;
    }
}
