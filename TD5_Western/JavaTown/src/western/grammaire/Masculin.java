package western.grammaire;

public class Masculin implements Genre {
    public Masculin() {}

    @Override
    public String getArticleDefini(String mot) {
        if (voyelleDebut(mot)) {
            return "l'" + mot;
        }
        return "le " + mot;
    }

    @Override
    public String getArticleIndefini(String mot) {
        return "un " + mot;
    }

    @Override
    public String getArticlePartitif(String mot) {
        if (voyelleDebut(mot)) {
            return "de l'" + mot;
        }
        return "du " + mot;
    }

    @Override
    public String Preposition(String mot) {
        if (voyelleDebut(mot)) {
            return "d'" + mot;
        }
        return "de " + mot;
    }
}
