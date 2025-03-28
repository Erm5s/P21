/**
 * Permet de créer un 'Year' conforme pour une 'Date'
 * En verifiant si l'année est bissextile 'isLeap()' pour avoir
 * le nombre de jours dans l'année 'getMaxDaysNumber()'.
 * On peut comparer deux années entre elle pour savoir si l'un est avant l'autre ou égales
 */
public class Year {

    private int _year;

    /** Constructeur : crée une année
     * @param year : prend un entier définissant l'année en paramètre
     */
    public Year (int year) {
        this._year = year;
    }

    /**
     * Vérifie si une année est bissextile ou non
     * Une année est bissextile si elle est multiple de 4 mais pas multiple de 100
     * @return renvoie 1 si c'est bissextile, 0 sinon
     */
    public Boolean isLeap() {
        return (this._year % 4 == 0 && this._year % 100 != 0) || this._year % 400 == 0;
    }

    /**
     * Permet de connaîte le nombre de jours d'une année selon si elle est bissextile ou non
     * @return renvoie le nombre de jours d'une année
     */
    public int getMaxDaysNumber() {
        return this.isLeap() ? 366 : 365;
    }

    /**
     * Compare deux années pour vérifier si l'année de l'instance est avant l'année comparé
     * @param other : autre année avec laquelle comparer
     * @return renvoie 1 si l'année de l'instance est l'année à comparer, 0 sinon
     */
    public Boolean isBefore( Year other ) {
        return other != null && this._year < other._year;
    }

    /**
     * Compare deux années pour vérifier si l'année de l'instance et l'année à comparer sont égales
     * @param other : autre année avec laquelle comparer
     * @return renvoie 1 si les deux années sont égales, 0 sinon
     */
    public Boolean isEqual( Year other ) {
        return other != null && this._year == other._year;
    }

    /**
     * Même fonction que 'isEqual()' mais vérifie également que l'objet à comparer est de type 'Année'
     * @param other : autre objet avec lequel comparer
     * @return renvoie 1 si l'objet est de type 'Année' et que les deux années sont égales, 0 sinon
     */
    @Override
    public boolean equals( Object other ) {
        if ( other instanceof Year )  {
            return this._year == ((Year)other)._year;
        }
        return false;
    }

    /**
     * Permet de savoir l'année de l'instance
     * @return renvoie l'année de l'instance sous forme d'entier
     */
    public int getYear() {
        return _year;
    }

    /**
     * Convertis l'année de l'instance en chaîne de caractère
     * @return renvoie l'année de l'instance sous forme de String
     */
    @Override
    public String toString() {
        return Integer.toString(_year);
    }
}
