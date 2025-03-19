import java.util.ArrayList;

public class BankAccount {
    private String m_firstName;
    private String m_lastName;
    private ArrayList<Account> m_accounts;

    public BankAccount(String firstName, String lastName)
    {
        this.m_firstName = firstName;
        this.m_lastName = lastName;
        this.m_accounts = new ArrayList<Account>();
    }

    public int createAccount(double initialBalance)
    {
        this.m_accounts.add(new Account(initialBalance));
        return this.m_accounts.size()-1;
    }

    public int createAccount()
    {
        this.m_accounts.add(new Account());
        return this.m_accounts.size()-1;
    }

    public boolean transfer(double amount, int sourceNumber, BankAccount target, int targetNumber)
    {
        return m_accounts.get(sourceNumber).transfer(amount, target.m_accounts.get(targetNumber));
    }
}
