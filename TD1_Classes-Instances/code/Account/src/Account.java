public class Account {

    private String m_firstName;
    private String m_lastName;
    private double m_balance;

    public BankAccount(String firstName, String lastName) {
        this.m_firstName = firstName;
        this.m_lastName = lastName;

    }
    /**
     * Constructeur Account permettant d'initier un compte avec un solde
     * @param initBalance montant initial à la création du compte
     */
    public Account (double initBalance) {
        this.m_balance = initBalance;
    }

    /**
     * Constructeur Account permettant d'initier un compte avec un solde à 0
     */
    public Account () {
        this.m_balance = 0;
    }

    /**
     * permet d'effectuer un virement entre deux comptes
     * @param amount : montant du virement, doit être positif
     * @param recipient : destinataire du virement, non null
    **/
    public Boolean payement(double amount, Account recipient) {
        if (amount < 0 || amount > recipient.m_balance) {
            return false;
        }
        else {
            this.m_balance -= amount;
            recipient.m_balance += amount;
            return true;
        }
    }

    /**
     * permet d'avoir les infos sur un compte bancaire
     * @return renvoie "Compte de 'nom du compte' : 'XX,XX€'"
     */
    public String toString() {
        return "Compte de " + this.m_name + " : " + this.m_balance + "€";
    }
}

