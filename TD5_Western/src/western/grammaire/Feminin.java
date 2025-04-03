package western.grammaire;

public class Feminin implements Genre{

    public Feminin() {
    }

    @Override
    public String getArticleDefini(Boolean voyelleDebut) {
        if (voyelleDebut) {
            return "l'";
        }
        return "la ";
    }

    @Override
    public String getArticleIndefini(Boolean voyelleDebut) {
        return "une ";
    }

    @Override
    public String getArticlePartitif(Boolean voyelleDebut) {
        if (voyelleDebut) {
            return "de l'";
        }
        return "de la ";
    }

    @Override
    public String getPreposition(Boolean voyelleDebut) {
        if (voyelleDebut) {
            return "d'";
        }
        return "de ";
    }
}
