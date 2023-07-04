import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Bank bank = new Bank(0);


        Customer c1 = new Customer();
        c1.setName("Paul");
        c1.setAmount(1000);
        c1.setBank(bank);

        Customer c2 = new Customer();
        c2.setName("Esther");
        c2.setAmount(900);
        c2.setBank(bank);

        Customer c3 = new Customer();
        c3.setName("Raj");
        c3.setAmount(3000);
        c3.setBank(bank);

        Customer c4 = new Customer();
        c4.setName("Olive");
        c4.setAmount(100);
        c4.setBank(bank);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: $" + bank.getBalance());
    }

}
