package date;

/**
 * permet d'extraire les caracteristiques d un mois
 */
public class Month implements Comparable<Month>{
    private int m_month;

    /**
     * Constructeur
     * @param month : numero du mois, doit etre compris entre 1 et 12
     */
    public Month(int month)
    {
        if(1<=month && month <=12)
        {
            m_month =month;
        }
        else
        {
            throw new IllegalArgumentException("The month should be between 1 et 12");
        }
    }

    /**
     * conversion en entier
     * @return le numero du mois
     */
    public int toInt()
    {
        return m_month;
    }

    /**
     * Calcule le nombre de jours du mois
     * @param year l'annee consideree pour le mois (permet de calculer le nombre de jours de Fevrier)
     * @return le nombre de jours
     */
    public int daysNumber(Year year)
    {
        if( m_month ==1|| m_month ==3 || m_month ==5 || m_month ==7 || m_month ==8 || m_month ==10 || m_month ==12 )
        {
            return 31;
        }
        else if (m_month ==2)
        {
            return year.isLeapYear() ? 29 : 28;
        }
        else
        {
            return 30;
        }
    }

    /**
     * verifie si le mois courant est identique a other
     * @param other: le mois a comparer
     * @return true si les deux mois sont identiques
     */
     public boolean equals(Month other)
    {
        return m_month ==other.m_month;
    }

    /**
     * verifie si un mois est strictement avant un autre
     * @param other : le mois a comparer
     * @return true si c'est le mois courant est avant other false sinon
     */
    public boolean isBefore(Month other)
    {
        return m_month <other.m_month;
    }

    @Override
    public int compareTo(Month other){
        if(isBefore(other)){
            return -1;
        } else if (other.isBefore(this)){
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Convertit en chaines de caracteres
     * @return le nom du mois en francais
     */
    @Override
    public String toString()
    {
        switch(m_month)
        {
            case 1 :
                return "Janvier";
            case 2 :
                return "Fevrier";
            case 3:
                return "Mars";
            case 4:
                return "Avril";
            case 5:
                return "Mai";
            case 6:
                return "Juin";
            case 7:
                return "Juillet";
            case 8:
                return "Aout";
            case 9:
                return "Septembre";
            case 10:
                return "Octobre";
            case 11:
                return "Novembre";
            case 12:
                return "Decembre";
            default:
                return "mois invalide";
        }
    }


}
