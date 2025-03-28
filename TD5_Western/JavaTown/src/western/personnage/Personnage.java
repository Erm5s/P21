public class Personnage {
    String m_nom;

    Personnage (String nom) {
        m_nom = nom;
    }

    Personnage (String nom, Substantif boisson) {
        m_nom = nom;
    }

    String sePresenter(){
        return "";
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
