package date;

/**
 * Conserver une date
 */
public class Date implements Comparable<Date>{
    private int m_day;
    private Month m_month;
    private Year m_year;

    /**
     * Constructeur de la date des numeros du jour, mois, annee
     * @param jour doit etre compris entre 1 et mois.nbJours
     * @param mois doit etre compris entre 1 et 12
     * @param annee
     */
    public Date(int jour, int mois, int annee)
    {
        m_year= new Year(annee);
        try {
            m_month = new Month(mois);
        } catch(IllegalArgumentException exception)
        {
            throw new InvalidDateException(exception.getMessage());
        }
        if(1 <= jour && jour <= m_month.daysNumber(m_year)) {
            m_day = jour;
        } else{
            throw new InvalidDateException("The day should be between 1 and "+m_month.daysNumber(m_year));
        }
    }

    /**
     * convertit la date en chaine de caracteres
     * @return "_num Jour_ _nom du mois_ _numero annee_
     */
    @Override
    public String toString()
    {
        return m_day +" "+ m_month.toString()+" "+m_year.toInt();
    }

    /**
     * verifie si une date correspond à une autre
     * @return true si c'est le cas, false sinon
     */
    public boolean equals(Date other)
    {
        return m_year.equals(other.m_year)
                && m_month.equals(other.m_month)
                && m_day == other.m_day;
    }

    /**
     *
     * @param other date à comparer
     * @return true si this est strictement avant other, false sinon
     */
    public boolean isBefore(Date other)
    {
        return m_year.isBefore(other.m_year)
                || (m_year.equals(other.m_year) && m_month.isBefore(other.m_month))
                || (m_year.equals(other.m_year) && m_month.equals(other.m_month) && m_day < other.m_day);
    }

    @Override
    public int compareTo(Date other){
        if(isBefore(other)){
            return -1;
        } else if(other.isBefore(this)){
            return 1;
        } else {
            return 0;
        }
    }

}
