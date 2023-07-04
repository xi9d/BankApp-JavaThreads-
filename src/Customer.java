public class Customer implements Runnable {
    private String name;
    private int amount;
    private Bank bank;

    public Customer(Bank bank) {
        this.bank = bank;
    }

    public Customer() {
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Customer(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        bank.deposit(amount);
        bank.withdraw(amount);
    }
}
