package date;

/**
 * permet d'extraire les caracteristiques d une annee
 */
public class Year implements Comparable<Year> {
    private int m_year;

    /**
     * Constructeur
     * @param year : l annee exprimee en entier
     */
    public Year(int year)
    {
        m_year = year;
    }
    /**
     *
     */
    @Override
    public String toString()
    {
        return "Year("+m_year+")";
    }
    /**
     * verifie si l anne est bissextile
     * @return true si l annee est bissextile false sinon
     */
    public boolean isLeapYear()
    {
        return ( (m_year %4 ==0) && (m_year %100 !=0) )
                || m_year %400 ==0;
    }

    /**
     * conversion en entier
     * @return l annee sous forme d entier
     */
    public int toInt()
    {
        return m_year;
    }

    /**
     * calcule le nombre de jours dans l annee en tenant compte de si l annee est bissextile
     * @return le nombre de jours
     */
    public int daysNumber()
    {
        return isLeapYear()?366:365;
    }

    /**
     * Verifie si les deux annees sont identiques
     * @param other : l'autre anne a comparer
     * @return renvoie true si les deux annees sont identiques et false sinon
     */
    public boolean equals(Year other)
    {
        return m_year == other.m_year;
    }
    /**
     * verifie si l'instance courante de annee est avant l'annee other
     * @param other: annee avec laquelle on compare l'instance courante
     * @return true si c'est le cas, false sinon
     */
    public boolean isBefore(Year other)
    {
        return m_year < other.m_year;
    }

    @Override
    public int compareTo(Year other){
        if(isBefore(other)){
            return -1;
        } else if(other.isBefore(this)) {
            return 1;
        } else {
            return 0;
        }
    }

}
