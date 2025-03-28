/**
 * Permet de connaitre le solde d'un 'Account' et d'effectuer des 'transfer()' entre comptes
 * Impossible en revanche d'ajouter de la monnaie de nulle part
 */
public class Account {
    private double m_balance;

    /**
     * Constructeur : cree un compte avec un solde initialisable
     * @param initialBalance : prend en parametre le solde initial du compte (seule possibilite de creation de monnaie)
     */
    public Account(double initialBalance) {
        m_balance = initialBalance;
    }

    /**
     * Constructeur : cree un compte dont le solde est initialisé a 0
     */
    public Account() {
        m_balance = 0;
    }

    /**
     * Pour consulter le solde du compte
     * @return renvoie le solde actuel du compte
     */
    public double getBalance() {
        return m_balance;
    }

    /**
     * Effectue un virement entre deux comptes,
     * si le destinataire est invalide ou le solde insuffisant, le virement n'a pas lieu
     * @param amount     : montant du virement, doit être positif
     * @param recipient: destinataire du virement (non null)
     * @return renvoie true si le virement a bien eu lieu et false sinon
     */
    public boolean transfer(double amount, Account recipient) {
        if (amount > 0 && amount <= m_balance && recipient != null) {
            m_balance -= amount;
            recipient.m_balance += amount;
            return true;
        }
        return false;
    }

    /**
     * Retourne le montant du compte sous forme de string
     * @return "Account(balance: _balance_)"
     */
    @Override
    public String toString() {
        return "(balance:" + m_balance + ")";
    }
}