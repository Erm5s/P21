import western.Narrateur;
import western.grammaire.Genre;
import western.grammaire.Substantif;
import western.grammaire.Masculin;
import western.grammaire.Feminin;
import western.personnage.Personnage;

public class Histoire1
{
    public static void main(String[] args)
    {
        Personnage max = new Personnage("Max");
        Personnage kid = new Personnage("The Kid", new Substantif("thé à la menthe", new Masculin()));
        Personnage bill = new Personnage("Bill", new Substantif("whisky", new Masculin()));
        Narrateur homere = new Narrateur();

        homere.ajouterLignes(max.sePresenter());
        homere.ajouterLignes(max.boire());
        homere.ajouterLignes(max.dire("Bon, au boulot, maintenant !"));

        homere.ajouterLignes(kid.sePresenter());
        homere.ajouterLignes(kid.boire());

        homere.ajouterLignes(bill.sePresenter());
        homere.ajouterLignes(bill.boire(new Substantif("eau", new Feminin())));

        homere.raconterHistoire();
    }
}
