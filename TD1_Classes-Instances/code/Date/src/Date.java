public class Date {

    private Year _year;
    private Month _month;
    private int _day;

    /**
     * Crée une date à partir de son année, son mois et son jour
     * @param day doit être un entier compris entre 1 et 31.
     *            Un modulo est appliqué pour garantir cette condition
     *            et sa validité en fonction du mois
     * @param month doit être un entier compris entre 1 et 12.
     *              Un modulo est appliqué pour garantir cette condition.
     * @param year est l'année de cette date
     */
    public Date( int day, int month, int year ) {
        this._year = new Year(year);
        this._month = new Month(month);
        int moduloDay = 30;
        // Si le mois est février, Dépends si on est une année bissextile
        if ( month == 2 ) {
            moduloDay = this._year.isLeap() ? 29 : 28;
        }
        // Sinon, 31 jours si mois avant juillet et impairs ou mois après juillet et pairs
        else if ( (month<8 && month % 2 == 1) || (month>=8 && month % 2 == 0) ) {
            moduloDay = 31;
        }
        this._day = (day-1) % moduloDay + 1;
    }

    @Override
    public String toString() {
        return this._day + " " + this._month + " " + this._year.getYear();
    }

}

