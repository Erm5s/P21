package western.grammaire;

public class Masculin implements Genre {
    public Masculin() {}

    @Override
    public String getArticleDefini(Boolean voyelleDebut) {
        if (voyelleDebut) {
            return "l'";
        }
        return "le ";
    }

    @Override
    public String getArticleIndefini(Boolean voyelleDebut) {
        return "un ";
    }

    @Override
    public String getArticlePartitif(Boolean voyelleDebut) {
        if (voyelleDebut) {
            return "de l'";
        }
        return "du ";
    }

    @Override
    public String getPreposition(Boolean voyelleDebut) {
        if (voyelleDebut) {
            return "d'";
        }
        return "de ";
    }
}
