/**
 * Permet de créer un 'Month' conforme pour une 'Date'
 * En verifiant le nombre de jours dans le mois en question
 * et en accédant au nom du mois en toutes lettres (String)
 */
public class Month {

    private int _month;
    private static String[] _monthNames = {"Janvier" , "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre" };

    /**
     * Constructeur _month vaut entre [1-12] si le paramètre vaut entre [1-12] aussi, sinon vaut 0
     * @param month : numéro du mois [1-12]
     */
    public Month( int month ) {
        if (1<=month && month<=12) {
            _month = month;
        }
        else {
            _month = 0;
        }
    }

    /**
     * Permet de connaitre le nombre de jours maximum dans un mois
     * @param year : le nombre de jour du mois de février varie selon si l'anée est bissextile ou non
     * @return renvoie le nombre de jours max d'un mois
     */
    public int getMaxDaysNumber (Year year) {
        if (_month == 1
        || _month == 3
        || _month == 5
        || _month == 7
        || _month == 8
        || _month == 10
        || _month == 12) {
            return 31;
        }
        else if (_month == 2) {
            return year.isLeap() ? 29:28;
        }
        else if (_month == 0) {
            return 0;
        }
        else {
            return 30;
        }
    }

    /**
     * Méthode 1 : Switch / Case
     * On obtient le nom du mois en toutes lettres
     * @return renvoie le nom du mois sous forme de String
     */
    public String getMonthName() {
        return switch ( this._month ) {
            default -> "Invalid";
            case 1 -> "Janvier";
            case 2 -> "Février";
            case 3 -> "Mars";
            case 4 -> "Avril";
            case 5 -> "Mai";
            case 6 -> "Juin";
            case 7 -> "Juillet";
            case 8 -> "Août";
            case 9 -> "Septembre";
            case 10 -> "Octobre";
            case 11 -> "Novembre";
            case 12 -> "Décembre";
        };
    }
    /**
     * Méthode 2 : Tableau
     * On obtient le nom du mois en toutes lettres
     * @return renvoie le nom du mois sous forme de String
     */
    public String getMonthName2() {
        return Month._monthNames[this._month-1];
    }

    /**
     * On obtient le nom du mois en toutes lettres à l'aide de la fonction 'getMonthName()'
     * @return renvoie le nom du mois sous forme de String
     */
    @Override
    public String toString() {
        return getMonthName();
        //return getMonthName2();
    }
}


