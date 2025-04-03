package western.grammaire;

public class Feminin implements Genre{

    public Feminin() {
    }

    @Override
    public String getArticleDefini(String mot) {
        if (voyelleDebut(mot)) {
            return "l'" + mot;
        }
        return "la " + mot;
    }

    @Override
    public String getArticleIndefini(String mot) {
        return "une " + mot;
    }

    @Override
    public String getArticlePartitif(String mot) {
        if (voyelleDebut(mot)) {
            return "de l'" + mot;
        }
        return "de la " + mot;
    }

    @Override
    public String Preposition(String mot) {
        if (voyelleDebut(mot)) {
            return "d'" + mot;
        }
        return "de " + mot;
    }
}
