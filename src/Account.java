public class Account {
    private final Currency currency;
    private double balance;

    public Account(Currency currency) {
        this.currency = currency;
    }

    public double getBalanceInCurrency() {
        return balance;
    }

    public double getBalanceInCurrency(Currency target) {
        return CurrenciesConverter.ConvertFromOriginalToTarget(balance, currency, target);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
