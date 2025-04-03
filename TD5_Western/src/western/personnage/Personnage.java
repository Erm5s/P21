package western.personnage;

import western.grammaire.Genre;
import western.grammaire.Masculin;
import western.grammaire.Feminin;
import western.grammaire.Substantif;

public class Personnage {
    String m_nom;
    Substantif m_boisson;

    public Personnage(String nom) {
        m_nom = nom;
        m_boisson = (new Substantif("eau", new Feminin()));
    }

    public Personnage (String nom, Substantif boisson) {
        m_nom = nom;
        m_boisson = boisson;
    }

    public String sePresenter(){
        return m_nom + " - Bonjour, je suis " + m_nom + " et j'aime " + m_boisson.avecArticleDefini() + '.';
    }

    public String boire(){
        return m_nom + " - Ah ! boire " +  m_boisson.avecArticlePartitif()+ " ! GLOUPS !";
    }

    public String boire(Substantif boisson){
        if (boisson.getMot() == getBoisson()) {
            return boire();
        }
        return m_nom + " - GLOUPS ! Faut vraiment avoir soif pour boire " + boisson.avecArticlePartitif()
                + " ! j'aurais préféré boire " + this.m_boisson.avecArticlePartitif()+ ".";
    }
    public String dire(String discours){
        return m_nom + " - " + discours;
    }

    public String getBoisson() {
        return this.m_boisson.getMot();
    }
}
