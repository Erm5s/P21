package western.personnage;

public class Personnage {
    String m_nom;

    Personnage (String nom) {
        m_nom = nom;
    }

    Personnage (String nom, Substantif boisson) {
        m_nom = nom;
    }

    String sePresenter(){
        return m_nom + " - Bonjour, je suis " + m_nom + " et j'aime";
    }

    String boire(){
        return "";
    }

    String boire(Substantif boisson){
        return "";
    }
    String dire(String discours){
        return discours;
    }
}
